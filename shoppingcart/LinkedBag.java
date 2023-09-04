package shoppingcart;

/**
 * Implementation of the BagInterface using a chain of linked nodes.
 * 
 * @author Frank M. Carrano, Timothy M. Henry
 * @version 5.0
 */
public class LinkedBag<T> implements BagInterface<T> {

    private Node firstNode;
    private int numberOfEntries;

    /**
     * Initializes an empty LinkedBag.
     */
    public LinkedBag() {
        firstNode = null;
        numberOfEntries = 0;
    }

    @Override
    public boolean add(T newEntry) {
        Node newNode = new Node(newEntry, firstNode);
        firstNode = newNode;
        numberOfEntries++;
        return true;
    }

    @Override
    public boolean remove(T anEntry) {
        Node currentNode = firstNode;
        while (currentNode != null) {
            if (anEntry.equals(currentNode.data)) {
                currentNode.data = firstNode.data;
                firstNode = firstNode.next;
                numberOfEntries--;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries];
        int index = 0;
        Node currentNode = firstNode;
        while ((index < numberOfEntries) && (currentNode != null)) {
            result[index] = currentNode.data;
            index++;
            currentNode = currentNode.next;
        }
        return result;
    }

 

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public T remove() {
        T result = null;
        if (firstNode != null) {
            result = firstNode.data;
            firstNode = firstNode.next;
            numberOfEntries--;
        }
        return result;
    }

    @Override
    public void clear() {
        while (!isEmpty()) {
            remove();
        }
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        int loopCounter = 0;
        Node currentNode = firstNode;
        while ((loopCounter < numberOfEntries) && (currentNode != null)) {
            if (anEntry.equals(currentNode.data)) {
                frequency++;
            }
            loopCounter++;
            currentNode = currentNode.next;
        }
        return frequency;
    }

    @Override
    public boolean contains(T anEntry) {
        boolean found = false;
        Node currentNode = firstNode;
        while (!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.data)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        }
        return found;
    }


    private class Node {
        private T data;
        private Node next;

        private Node(T dataPortion) {
            this(dataPortion, null);
        }

        private Node(T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        }
    }
}

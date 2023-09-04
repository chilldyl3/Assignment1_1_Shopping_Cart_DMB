package shoppingcart;

public class ShoppingCart<T> {
    private BagInterface<T> itemBag;

    /**
     * Initializes an empty ShoppingCart.
     */
    public ShoppingCart() {
        this.itemBag = new LinkedBag<>();
    }

    /**
     * Adds an item to the shopping cart.
     * 
     * @param item The item to add.
     * @return True if the item was added successfully, false otherwise.
     */
    public boolean addItem(T item) {
        return itemBag.add(item);
    }

    /**
     * Removes an item from the shopping cart.
     * 
     * @param item The item to remove.
     * @return True if the item was removed successfully, false otherwise.
     */
    public boolean removeItem(T item) {
        return itemBag.remove(item);
    }

    /**
     * Calculates the total price of items in the cart.
     * 
     * @return The total price.
     */
    public double calculateTotalPrice() {
        double total = 0.0;
        Object[] items = itemBag.toArray();
        for (Object obj : items) {
            if(obj instanceof Item) {
                Item item = (Item) obj;
                total += item.getPrice();
            }
        }
        return total;
    }

    /**
     * Displays the contents of the cart.
     */
    public void displayItems() {
        Object[] items = itemBag.toArray();
        for (Object obj : items) {
            System.out.println(obj);
        }
    }

    public void printItems() {
        T[] items = itemBag.toArray();
        for (T item : items) {
            System.out.println(item.toString());
        }
    }
}



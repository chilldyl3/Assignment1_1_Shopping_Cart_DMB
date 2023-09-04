package shoppingcart;

/**
 * A class that tests the functionality of the ShoppingCart class.
 * @author [Dylan Barth] 
 * @version 1.0
 */
public class ShoppingCartTest {

    public static void main(String[] args) {

    	ShoppingCart<Item> cart = new ShoppingCart<>();

        // Create 5 items
        Item item1 = new Item("Laptop", 99999); // Price is in cents, $999.99
        Item item2 = new Item("Phone", 59999);  // $599.99
        Item item3 = new Item("Book", 1999);    // $19.99
        Item item4 = new Item("Tablet", 29999); // $299.99
        Item item5 = new Item("Headphones", 4999); // $49.99

        // Add items to cart
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item5);

        // Print items added
        System.out.println("Items added:");
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println(item4);
        System.out.println(item5);
        System.out.println();

        System.out.println("Total price of items in cart: $" + cart.calculateTotalPrice() / 100.0);
        System.out.println();
        
        // Print contents of cart
        System.out.println("Contents of cart:");
        cart.printItems();
        System.out.println();
        
        System.out.println("Total price of items in cart: $" + cart.calculateTotalPrice() / 100.0);
        System.out.println();

        // Remove some items
        cart.removeItem(item3);  // Removing book
        cart.removeItem(item4);  // Removing tablet

        // Print contents of cart after removal
        System.out.println("Contents of cart after removing some items:");
        cart.printItems();
        System.out.println();

        // Total price
        System.out.println("Total price of items in cart: $" + cart.calculateTotalPrice() / 100.0);
    }
}



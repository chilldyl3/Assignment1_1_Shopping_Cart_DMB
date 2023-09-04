package shoppingcart;
/** 
 * A class of items for sale.
 * 
 * @author Frank M. Carrano
 * @author Timothy M. Henry
 * @version 5.0
 */
public class Item {

    private String description;
    private int price;

    /**
     * Constructs an Item with the given description and price.
     * 
     * @param productDescription the description of the item
     * @param productPrice the price of the item in cents
     */
    public Item(String productDescription, int productPrice) {
        description = productDescription;
        price = productPrice;
    } // end constructor

    /**
     * Retrieves the description of the item.
     * 
     * @return the description of the item
     */
    public String getDescription() {
        return description;
    } // end getDescription

    /**
     * Retrieves the price of the item.
     * 
     * @return the price of the item in cents
     */
    public int getPrice() {
        return price;
    } // end getPrice

    /**
     * Returns the string representation of the item with price formatted as dollars and cents.
     * 
     * @return a string representation of the item
     */
    @Override
    public String toString() {
        return description + "\t$" + price / 100 + "." + String.format("%02d", price % 100);
    } // end toString
} // end Item



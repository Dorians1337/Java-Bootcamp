package sef.module10.activity;

import java.util.HashMap;

/**
 * Class demonstrating HashMap usage to store and retrieve electronic item prices.
 *
 * @author Dorians Vaitovskis
 */
public class ElectronicItemDetails {

    /**
     * Retrieves the price of an electronic item by name from the provided HashMap.
     *
     * @param itemHashMap HashMap containing item names as keys and prices as values
     * @param name        the name of the item to look up
     * @return the price of the item, or 0.0 if the item is not found
     */
    public double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {
        if (itemHashMap != null && itemHashMap.containsKey(name)) {
            return itemHashMap.get(name);
        }
        return 0.0;
    }

    /**
     * Main method populating electronic items into a HashMap and printing the price of TV.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // 5.1 Create itemHashMap with String name and double price
        HashMap<String, Double> itemHashMap = new HashMap<String, Double>();

        // 5.3.1 Add 4 items in hashmap - TV, Refrigerator, Washing Machine, Laptop
        itemHashMap.put("TV", 799.99);
        itemHashMap.put("Refrigerator", 1200.00);
        itemHashMap.put("Washing Machine", 550.00);
        itemHashMap.put("Laptop", 999.50);

        // Create instance to call non-static returnPriceOfItem method
        ElectronicItemDetails details = new ElectronicItemDetails();

        // 5.3.2 Print the price of TV
        System.out.println("Price of TV is " + details.returnPriceOfItem(itemHashMap, "TV"));
    }
}

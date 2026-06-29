import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public Inventory() {

        items = new ArrayList<>();

    }

    public void addItem(Item item) {

        items.add(item);

    }

    public boolean hasItem(String itemName) {

        for (Item item : items) {

            if (item.getItemName().equalsIgnoreCase(itemName)) {

                return true;

            }

        }

        return false;

    }

    public void displayItems() {

        if (items.isEmpty()) {

            System.out.println("Inventory is empty.");

        } else {

            System.out.println("\n===== INVENTORY =====");

            for (Item item : items) {

                System.out.println("Item: " + item.getItemName());
                System.out.println("Value: " + item.getValue());
                System.out.println();

            }

        }

    }

}
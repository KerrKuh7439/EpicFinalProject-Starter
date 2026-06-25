public class Item {

    private String itemName;
    private int value;

    public Item(String itemName, int value) {

        this.itemName = itemName;
        this.value = value;

    }

    public String getItemName() {

        return itemName;

    }

    public int getValue() {

        return value;

    }

    public void setItemName(String itemName) {

        this.itemName = itemName;

    }

    public void setValue(int value) {

        this.value = value;

    }

}
package com.rockarolla;

/**
 * @author rockarolla01
 * Date: 15.02.2019
 */
public class Item {
    private String itemName;

    public Item() {

    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                '}';
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Item(String itemName) {

        this.itemName = itemName;
    }
}

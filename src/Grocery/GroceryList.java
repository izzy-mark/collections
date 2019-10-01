package Grocery;

public class GroceryList {

//A user should be prompted if they would like to create a grocery list.
//
//        If they pick yes, they will be prompted if they would like to enter a new item.
//
//        If the users picks yes, they should be given the following three prompts:
//
//        Given an ordered list of grocery categories to choose from, select the category.
//        Enter name of the item.
//        Enter how many of the item.

    private String itemName;
    private int amount;
    private String category;

    public GroceryList(String itemName, int amount, String category) {
        this.itemName = itemName;
        this.amount = amount;
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

package Grocery;

import grades.Input;


public class GroceryApplication {

    private static String[] category = {"1.produce", "2.meat", "3.cheese", "4.snacks", "5.drinks"};

    public static String categoryName;

    public static void main(String[] args) {

            displayMenu();
    }


    public static void displayMenu(){
        Input input = new Input();

        System.out.println("Would you like to build a Grocery List?");

        if(input.yesNo()){
            System.out.println("Would you like to enter a new item");
            if(input.yesNo()){
                addNewItem();
            }
        }

    }

    public static void addNewItem(){
        Input input = new Input();

        System.out.println("select a category");
        for (String str: category) {
            System.out.print("|" + str + "| ");
        }

        int catChoice = input.getInt("");
        String itemName;
        int howMany = 0;

        switch (catChoice){
            case(1):
                categoryName = "produce";
                break;
            case(2):
                categoryName = "meat";
                break;
            case(3):
                categoryName = "cheese";

                break;
            case(4):
                categoryName = "snacks";
                break;
            case(5):
                categoryName = "drinks";
                break;
        }

         itemName = input.getString("Enter the name of item");

        howMany = input.getInt("enter how many of the item");

        System.out.println("would you like to add this to the list?");
        if(input.yesNo()){

            GroceryList newList = new GroceryList(itemName, howMany, categoryName);

        }


    }


}

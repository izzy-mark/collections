package grades;

import java.util.Scanner;

public class Input {


    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

//    The class should have the following methods, all of which return command line input from the user:
//    String getString()

//    public String getString(){
//        System.out.println("enter a string");
//        return scanner.nextLine();
//    };

    private String getString(){
        return this.scanner.nextLine();
    }

    public String getString(String prompt){
        if(prompt.isEmpty()){
            System.out.println("Type something: ");
        } else {
            System.out.println(prompt);
        }
        return getString();
    }

////    boolean yesNo()
////The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//
    public boolean yesNo(){
        System.out.println("Y/N?");

        String input = this.scanner.nextLine().trim();

        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");

    };




//    int getInt(int min, int max)
//The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.

//    public int getInt(int min, int max){
//
//        System.out.println("enter an integer between " + min + " and " + max);
//        int input;
//        boolean isInt = false;
//
//        do {
//            input = Integer.parseInt(scanner.nextLine());
//
//            if (input >= min && input <= max) {
//                isInt = true;
//            } else {
//                System.out.println("Invalid, enter an integer between " + min + " and " + max);
//            }
//        } while (!isInt);
//
//        return input;
//    };

//    public int getInt(int min, int max){
//        int input = Integer.parseInt(scanner.nextLine());
//        if (input >= min && input <= max) {
//                return input;
//            } else {
//                System.out.println("Invalid, enter an integer between " + min + " and " + max);
//                return getInt(min, max);
//            }
//    };

    public int getInt(int min, int max){
        int number = getInt();
        if(number >= min && number <= max){
            return number;
        } else {
            System.out.println("Out of range");
            return getInt(min, max);
        }
    }

//    public int getInt(){
//        System.out.println("Give me a number: ");
//        return Integer.parseInt(this.scanner.nextLine());
//    }


//    int getInt()

    public int getInt(){
        System.out.println("enter a number:");
        return Integer.parseInt(scanner.nextLine());
    };

    public int getInt(String prompt){
        System.out.println(prompt);
        return Integer.parseInt(this.scanner.nextLine());
    }

//    double getDouble(double min, double max)
// The getDouble method should do the same thing, but with decimal numbers.

//    public double getDouble(double min, double max){
//
//        System.out.println("enter a double between " + min + " and " + max);
//        double input;
//        boolean isDouble = false;
//
//        do {
//            input = Double.parseDouble(scanner.nextLine());
//
//            if (input > min && input < max) {
//                isDouble = true;
//            } else {
//                System.out.println("Invalid, enter a double between " + min + " and " + max);
//            }
//        } while (!isDouble);
//
////        return input;
////    };
//
//    public double getDouble(double min, double max){
//        double input = Double.parseDouble(scanner.nextLine());
//        if (input >= min && input <= max) {
//            return input;
//        } else {
//            System.out.println("Invalid, enter a double between " + min + " and " + max);
//            return getDouble(min, max);
//        }
//    };
//
////    double getDouble()
//
//    public double getDouble(){
//        System.out.println("enter a double");
//        return Double.parseDouble(scanner.nextLine());
//    };

    public double getDouble(double min, double max){
        double number = getDouble("Give me a decimal");
        if(number >= min && number <= max){
            return number;
        } else {
            System.out.println("Out of range");
            return getDouble(min, max);
        }
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return Double.parseDouble(this.scanner.nextLine());
    }
}
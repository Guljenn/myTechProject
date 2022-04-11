package collections.arrayList;

import java.util.ArrayList;

public class AddingAllRemovingAll {
    public static void main(String[] args) {

        ArrayList<String> germanCars = new ArrayList<>();

        /*
        TASK 1
        Create an Arraylist of germanCars and add below items
        BMW
        Mercedes
        Volkswagen
        Audi
         */

        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");
        germanCars.add("Audi");

        System.out.println("German cars is = " + germanCars);

        /*
        Japan cars = Honda, Toyota, Lexus. Create this ArrayList and print your result with a message saying
        Japanese cars are equal to the above
         */

        ArrayList<String> japaneseCars = new ArrayList<>();

        japaneseCars.add("Honda");
        japaneseCars.add("Toyota");
        japaneseCars.add("Lexus");

        System.out.println("Japanese cars is = " + japaneseCars);

        /*
        Create an ArrayList of Luxury cars and store below cars
        Maserati
        Tesla
        Range Rover
        Jaguar
         */
        ArrayList<String> luxuryCars = new ArrayList<>();

        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");

        System.out.println("Luxury cars is = " + luxuryCars);

        // PUTTING ALL THE CARS TOGETHER

        ArrayList<String> inventory = new ArrayList<>();
        System.out.println("Inventory at the beginning = " + inventory); // []

        //Adding all German cars to the inventory collection
        inventory.addAll(germanCars);
        System.out.println("\nInventory after adding luxury cars = " + inventory);

        // Adding all Japanese cars to the inventory collection
        inventory.addAll(japaneseCars);
        System.out.println("Inventory after adding Japanese cars = " + inventory);

        // Adding all luxury cars to the inventory collection
        inventory.addAll(luxuryCars);
        System.out.println("Inventory after adding luxury cars = " + inventory);

        // Removing all Japanese cars from inventory
        inventory.removeAll(japaneseCars);
        System.out.println("Japanese cars removed from inventory is = " + inventory);


        // Removing Tesla, Audi, and BMW

        inventory.remove("Tesla");
        inventory.remove("Audi");
        inventory.remove("BMW");
    }
}

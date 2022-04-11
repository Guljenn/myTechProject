package oop_principles.class_objects;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

public class Animal {

    // default constructor

    public Animal (){

    }
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Create a constructor that takes 6 args: name, color, age, isHerbivore, isCarnivore, isOmnivore

    public Animal(String name, String color, int age, boolean isHerbivore, boolean isCarnivore, boolean isOmnivore) {
        // I should assign local variables to instance variables
        this.name = name;
        this.color = color;
        this.age = age;
        this.isHerbivore = isHerbivore;
        this.isCarnivore = isCarnivore;
        this.isOmnivore = isOmnivore;

    }

    //Define instance variables of an animal  Or Fields of an Animal object

    public String name;
    public int age;
    public String color;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;

    @Override
    public String toString() {
        String s = "Animal{";
        if(this.name != null) s +=   "name='" + this.name + '\'';
        if(this.color != null) s += ", color='" + this.color + '\'';
        if(this.age != 0) s +=  ", age=" + this.age;
        if(this.isCarnivore) s += ", isCarnivore=" + this.isCarnivore;
        if(this.isHerbivore) s += ", isHerbivore=" + this.isHerbivore;
        if(this.isOmnivore) s += ", isOmnivore=" + this.isOmnivore;
        s += '}';
        return s;

    }

    //Testing Animal
    public static void main(String[] args) {

        /*
        Create an animal object called a1 and defines its information as below
        cow
        3
        black
        herbivore

         */
       Animal a1 = new Animal("Cow", "Black", 3, false, true, false);

        System.out.println(a1);

        /*
        Create an a2 object with below info
        Cat
        1
        Gray
        Omnivore
         */
    Animal a2 = new Animal("Cat", "Gray", 1, false, false, true);
        System.out.println(a2);



        /*
        Create a3 object with below info
        parrot
        2
        white
        herbivore

         */
        Animal a3 = new Animal("Parrot", "White", 2, true, false, false);
        System.out.println(a3);

        Animal a4 = new Animal("Lion", "Beige", 4, false, true, false);

        System.out.println(a4);

        /*
        TASK 1
        Store your animal objects in a collection
        Count how many
         */

           List<Animal> animals = new ArrayList<>();
           animals.add(a1);
           animals.add(a2);
           animals.add(a3);
           animals.add(a4);

           int countH = 0;
           int countOmn = 0;
           int countC = 0;
           for(Animal element : animals ){
               if(element.isOmnivore) countOmn++;
               else if(element.isCarnivore) countC++;
               else  countH++;
           }
        System.out.println("Herbivore = " +countC);
        System.out.println("Herbivore = " +countH);
        System.out.println("Omnivore = " +countOmn);



    }


}

package oop_principles.class_objects;

public class AppleTest {
    public static void main(String[] args) {
        // Create 2 Apple objects

       Apple apple1 = new Apple();
       apple1.price = .99;
       apple1.color = "Red";
       apple1.taste = "Sweet";
        System.out.println("The apples are " + apple1.color + " " + apple1.taste + " and the price is " + apple1.price);


        Apple apple2 = new Apple();
        apple2.price = 1.99;
        apple2.color = "Green";
        apple2.taste = "Sour";

    }
}

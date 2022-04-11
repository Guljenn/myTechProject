package oop_principles.class_objects;

public class Car {


    public Car() {
    }
        public String make;
        public String color;
        public String model;
        public int year;

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    // right click, generate and select toString()


}

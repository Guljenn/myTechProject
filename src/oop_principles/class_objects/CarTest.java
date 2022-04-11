package oop_principles.class_objects;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();

       car1.make = "Tesla";
       car1.model = "S";
       car1.color = "Red";
       car1.year = 2022;

        System.out.println(car1);

        Car car2 = new Car();
        car2.make = "Tesla";
        car2.year = 2022;
        car2.color = "Silver";
        car2.model = "S";
        System.out.println(car2);

        Car car3 = new Car();
        car3.make = "Tesla";
        car3.color = "Green";
        car3.model = "X";
        car3.year = 2021;
        System.out.println(car3);

        Car car4 = new Car();
        car4.make = "Tesla";
        car4.color = "Red";
        car4.model = "S";
        car4.year = 2022;

    }
}

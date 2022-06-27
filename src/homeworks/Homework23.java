package homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework23 {
    /*
    Requirement:
    Write a method called as parseData() which takes a
    String has some keys in {} and values after between }{
    and returns a collection that has all the keys and values
    as entries.
    NOTE: The keys should be sorted!
    Test Data:
    {104}LA{101}Paris{102}Berlin{103}Chicago{100}Lon
    don
    Expected Output:
    {100=London, 101=Paris, 102=Berlin, 103=Chicago,
    104=LA}
     */

    public static TreeMap<String, String> parseData1(String s){
        TreeMap<String, String> newMap = new TreeMap<>();
        String[] str = s.replaceAll("[{}]", " ").split(" ");
        for(int i = 1; i <= str.length-1; i += 2){
            newMap.put(str[i], str[i + 1]);
        }
        return newMap;
    }

    /*
    Requirement:
    Write a method called as calculateTotalPrice1() which takes
    a Map of some shopping items with their amounts and
    calculates the total prices as double. Item prices are given
    below
    Apple = $2.00
    Orange = $3.29
    Mango = $4.99
    Pineapple = $5.25
    Test Data 1:
    {Apple=3, Mango = 1}
    Expected Output 1:
    10.99
     */

    public static double calculateTotalPrice1(Map<String, Integer> map) {
        double totalPrice = 0.00;
        HashMap<String, Double> map1 = new HashMap<>();
        map1.put("Apple", 2.00);
        map1.put("Mango", 4.99);
        map1.put("Orange", 3.29);
        map1.put("Pineapple", 5.25);

        for (String s : map.keySet()) {
            totalPrice += map.get(s) * map1.get(s);
        }
        return totalPrice;
    }

    /*
    Requirement:
    Write a method calculateTotalPrice2() which takes a Map of some
    shopping items with their amounts and calculates the total prices as
    double. Item prices are given below
    Apple = $2.00
    Orange = $3.29
    Mango = $4.99
    BUT there will be some discounts as below
    There will be %50 discount for every second Apple
    There will be 1 free Mango if customer gets 3. So, fourth one is free.
    Test Data 1:
    {Apple=3, Mango = 5}
    Expected Output 1:
    24.96
     */

    public static double calculateTotalPrice2(Map<String, Integer> map) {
        Map<String, Double> totalShopping = new HashMap<>();
        totalShopping.put("Apple", 2.00);
        totalShopping.put("Orange", 3.29);
        totalShopping.put("Mango", 4.99);

        double totalPrice = 0.00;
        for (String value : map.keySet()) {
            for (int i = 1; i < map.get(value) + 1; i++) {
                if (map.containsKey("Apple") && i % 2 == 1) totalPrice += totalShopping.get(value) / 2.00;
                else if (map.containsKey("Mango") && i % 4 == 0) {
                } else totalPrice += totalShopping.get(value);
            }
        }
        return Math.round(totalPrice * 100.0) / 100.0;

    }

    public static void main(String[] args) {
            System.out.println(">>>>>>>TASK1<<<<<<<");
            System.out.println(parseData1("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));
            System.out.println(">>>>>>>TASK2<<<<<<<");
            HashMap<String, Integer> map = new HashMap<>();
            map.put("Apple", 3);
            map.put("Mango", 1);
            System.out.println(calculateTotalPrice1(map));
            HashMap<String, Integer> map1 = new HashMap<>();
            map1.put("Apple", 2);
            map1.put("Pineapple", 1);
            map1.put("Orange", 3);
            System.out.println(calculateTotalPrice1(map1));
            System.out.println(">>>>>>>TASK3<<<<<<<");
            HashMap<String, Integer> map2 = new HashMap<>();
            map2.put("Apple", 4);
            map2.put("Mango", 8);
            map2.put("Orange", 3);
            System.out.println(calculateTotalPrice2(map2));
    }

}

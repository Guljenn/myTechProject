import java.util.LinkedHashMap;

public class Test {
    /*
    Requirement:
-Student is responsible to create a main method and test their method.
-Write a method that takes an array of String and returns the count of each unique element in the array as a Map
Test Data:
["Apple", "Apple", "Orange", "Apple", "Kiwi"]
Expected:
 {Apple=3, Orange=1, Kiwi=1}
     */

    public static  LinkedHashMap<String, Integer> countUniqueElements(String[] arr){
        LinkedHashMap<String, Integer> charCounts = new LinkedHashMap<>();


        for(int i = 0; i <= arr.length-1; i++){
            if(!charCounts.containsKey(arr[i])) charCounts.put(arr[i], 1);
             else charCounts.put(arr[i], charCounts.get(arr[i])+1);
            }


        return charCounts;
    }

    public static void main(String[] args) {
       String[] arr = {"Apple", "Apple", "Orange", "Kiwi"};


        System.out.println(countUniqueElements(arr));
    }
}

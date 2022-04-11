package collections.LinkedList;

import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        LinkedList<Double> numbers = new LinkedList<>();
        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.3);
        numbers.add(17.7);

        System.out.println(numbers);

        for(Double d : numbers) {
            System.out.println(d);
        }
        System.out.println("\nSome methods of LinkedList");
            System.out.println(numbers.get(0));
            System.out.println(numbers.getFirst()); // 10.5
            System.out.println(numbers.getLast());  // 17.7

        System.out.println("\nSome additional methods of LinkedList");
        System.out.println(numbers.peek());  // get first
        System.out.println((numbers.peekFirst()));  // 10.75
        System.out.println(numbers.peekLast());     // 17.7

        System.out.println(numbers);


        System.out.println("\n----------------------------------------------");
        System.out.println(numbers.poll()); // retrieves the first element and removes it
        System.out.println(numbers.pollFirst());  // retrieves the first element and removes it

        System.out.println(numbers.pollLast()); // retrieves the last element and removes it
        System.out.println(numbers);

        System.out.println("\n_______________________________________________________");
        numbers.push(5.7);  // add the object to the head, meaning to the zeroth index
        numbers.push(8.9);
        System.out.println(numbers.pop());  // removes the first element
        System.out.println(numbers);





    }
}

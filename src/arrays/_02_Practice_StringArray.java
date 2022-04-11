package arrays;



import java.util.Arrays;

public class _02_Practice_StringArray {
    public static void main(String[] args) {
        /*
        Create a String array and store below data
        Name of the array is students
         */

        String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};
        System.out.println("Unsorted array = " + Arrays.toString(students));
        Arrays.sort(students);
        System.out.println("Sorted array = " + Arrays.toString(students));

        /*
        Print the first and last names after it is sorted
         */

        System.out.println("First name is =" + students[0]);
        System.out.println("Last name is =" + students[students.length - 1]);

        // TASK 3
        /*
        count how many names start with A
         */
        int count = 0;

        for (String element : students) {
            if (element.charAt(0) == 'A')
                count++;

        }
        System.out.println(count);

        for (String element : students) {
            System.out.println(element.length() / 2);

        }
        // count how many names contains a-A or e-E
        int count1 = 0;
        for (String elements : students) {
            if (elements.toLowerCase().contains("a") || elements.toLowerCase().contains("e"))
                count1++;
        }


        System.out.println(count1);

        //TASK 5
        int countL = 0;
        for (String element : students) {
            if (element.length() >= 5) {
                countL++;

            }
        }
        System.out.println(countL);

//        int countLG = 0;
//        for(int i = 0; i <= students.length; i++){
//            if(students[i].length() >= 5){
//                countLG++;
//                System.out.println(students[i]);
//            }
//        }System.out.println(countLG);

        /*
        Check if this array has an element that is equal to "Jennifer
        if it has it, print ture
        otherwise print false
         */
        boolean hasJennifer = false;
        for (String element : students) {
            if (element.equals("Jennifer")) {
                hasJennifer = true;
                break;
            }
        }
        System.out.println(hasJennifer);


        System.out.println(students[0] + " " + students[students.length-1]);

        int countA = 0;
        for( String element : students) {
            if(element.startsWith("A")){
                countA++;

            }
        }
                    System.out.println(countA);

    }
}
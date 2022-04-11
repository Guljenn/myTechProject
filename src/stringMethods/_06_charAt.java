package stringMethods;

public class _06_charAt {
    public static void main(String[] args) {

        /*
        Method Task: It helps to get a character at a specific index
        NOTE: Index starts with zero
        -It is non-static as we call it with object name
        -It is a return type and returns char primitive
        -It takes an argument which is int (index)

        NOTE: It will throw StringIndexOutOfBoundsException when the given index is not in the bounds
         */

//        String name = "Alex";
//
//        System.out.println( "" + name.charAt(3) + (name.charAt(2)));
//        char firstChar = name.charAt(0);
//
//        if (firstChar == 'a' || firstChar == 'A') {
//            System.out.println("First name starts with A");
//        }
//            else {
//                System.out.println("This name does not start with A");
//        }

        String name = "Guluzar";
        char myName = name.charAt(0);

        if (myName == 'G' || myName == 'g') {
            System.out.println("Print out G");
        }
        else System.out.println("no");

        String name1 = "Guluzar";

        System.out.println(name1.charAt(name1.length()-5));

        String sentence = "Java is fun";
        System.out.println(sentence.charAt(6));

    }
}

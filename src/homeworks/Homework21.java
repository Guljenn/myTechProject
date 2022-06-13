package homeworks;

public class Homework21 {

                        // TASK - 1
    public static void fizzBuzz(int number) {
        for (int i = 1; i <= 18; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);

        }
    }
                        // TASK - 2

    public static String fizzBuzz2(int number) {

        if (number % 15 == 0) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
         return String.valueOf(number);

                           // TASK - 3

    }

        public static int findSumOfNumbers(String str) {
            int num = 0;
            int sum = 0;

            for(int i = 0; i <= str.length()-1; i++){
                if(Character.isDigit(str.charAt(i)))
                    num = num*10 + (str.charAt(i) - '0');  // if a single number is found, it will not be multiplied by 10
                                                           // if there is a number followed by another number it will multiply it
                                                           // -0 is to find the index of character in the string
                else{
                    sum += num;  // Update the value and add to num
                    num = 0;     // reset the number
                }
            }
            return sum + num;     // return the sum + num

        }

                                        // TASK 4


    public static int findBiggestNumber(String str) {
        int num = 0;
        int max = 0;
        for(int i = 0; i <= str.length()-1; i++){
            if(Character.isDigit(str.charAt(i))){
                num = num * 10 + (str.charAt(i) - '0');
            }
            else{
                max = Math.max(max, num);  // Update maximum value
                num = 0;                       // Reset the number
            }
        }
        return Math.max(max, num);           // return the max

    }
                                        // TASK 5
    public static String countSequenceOfCharacters1(String s){
        StringBuilder sb = new StringBuilder();  // empty container to increment and store count
        int count = 0;    // create counter
        if (s.length() == 0) return "";    // if string is empty return empty
        else{   // second condition
            for (int i = 0; i < s.length() - 1; i++) {    // count one if string is not empty
                count = 1;
                if (("" + s.charAt(i)).equals("" + s.charAt(i + 1))){   // count if the characters that are consecutive are equal
                    count ++;   // increment the count n
                    i = i + count - 1;  // update
                }
                sb.append(count).append(s.charAt(i));   // append the count and characters
            }
            if (!("" + s.charAt(s.length() - 1)).equals(("" + s.charAt(s.length() - 2)))) sb.append("1").append(s.charAt(s.length() - 1));
            // if they don't equal, append count and characters - this accounts for characters that don't have a duplicate
        }
        return sb.toString();
    }







    public static void main(String[] args) {
        System.out.println(".......fizzBuz().......");
        fizzBuzz(3);
        fizzBuzz(5);
        fizzBuzz(18);


        System.out.println(".......fizzBuz2().......");
        System.out.println(fizzBuzz2(1));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));

        System.out.println(".......findSumOfNumbers().......");

        System.out.println(findSumOfNumbers("abc$")); // 0
        System.out.println(findSumOfNumbers("a1b4c  6#")); // 11
        System.out.println(findSumOfNumbers("ab110c045d")); // 155
        System.out.println(findSumOfNumbers("525"));  // 525

        System.out.println(".......findBiggestNumber().......");
        System.out.println(findBiggestNumber("abc$")); // 0
        System.out.println(findBiggestNumber("a1b4c  6#")); // 6
        System.out.println(findBiggestNumber("ab110c045d")); //110
        System.out.println(findBiggestNumber("525")); // 525

        System.out.println(".......countSequenceOfCharacters().......");
        System.out.println(countSequenceOfCharacters1("aaAAa"));


        }


    }


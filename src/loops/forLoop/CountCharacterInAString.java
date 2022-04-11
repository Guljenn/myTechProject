package loops.forLoop;

public class CountCharacterInAString {
    public static void main(String[] args) {

        /*
        Write a java program to count total number of "o" letter in a given string
         */

        String name = "TechGlobal School";
        int count = 0;
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == 'o') count++;


            }
            System.out.println(count);
        }
    }

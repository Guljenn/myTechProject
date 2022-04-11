package stringMethods;

public class _01_valueOf {
    public static void main(String[] args) {

        /*
        1. Method Task: Convert given variable to a String
        - it is static - you can call it with a class
        - it is a return type, and it returns a String
        - it takes different arguments as it is a overloaded method and converts given args to a String
        */
        int i = 5;

        String str1 = String.valueOf(i);   // num5

        System.out.println(5 + 5);  // 10 this adds it
        System.out.println(str1 + str1);// 55 this combines it
        boolean check = true;
        String bool = String.valueOf(5==1);
        System.out.println(bool);
        System.out.println(str1 + 1);

        int a = 55;
        char character = '6';
        String value = String.valueOf(a);
        String char1 = String.valueOf(character);
        System.out.println(value + char1);
        String b = String.valueOf(check);
        System.out.println(b);


    }
}

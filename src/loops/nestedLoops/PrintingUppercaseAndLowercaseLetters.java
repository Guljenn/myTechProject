package loops.nestedLoops;

public class PrintingUppercaseAndLowercaseLetters {
    public static void main(String[] args) {


        System.out.println("Lowercase letters ");
        for (int i = 97; i <= 122; i++) {
            System.out.println((char) i);
        }
        System.out.println("Uppercase letters");
        for (int j = 65; j <= 90; j++) {
            System.out.println(((char) j));
        }
    }
}
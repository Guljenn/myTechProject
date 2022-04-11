package incrementAndDecrementOperators;

public class PreDecrementAndPostDecrement {
    public static void main(String[] args) {
        int a = 5;

        System.out.println(a--); //delayed
        System.out.println(--a); //affective immediately
        System.out.println(a);   // the new value

        System.out.println(a--);  //delayed
        System.out.println(--a);
        System.out.println(a);

    }
}

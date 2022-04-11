package mathClass;

public class FindMax {
    public static void main(String[] args) {

        int x = 8;
        int y = 20;

        int maxValueOfXY = Math.max(x, y);

        System.out.println(maxValueOfXY);

        int num1 = 4;
        int num2 = 56;
        int num3 = 23;

        Math.max(num1,num2);
        Math.max(Math.max(num1,num2),num3);





        System.out.println("Max of given number is: " + Math.max(Math.max(num1,num2),num3));

    }
}

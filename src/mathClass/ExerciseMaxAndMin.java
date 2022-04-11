package mathClass;

public class ExerciseMaxAndMin {
    public static void main(String[] args) {

        /*
        create variables
        create the objects
        print out values
       */

        int x = 4;      int y = 67;     int z = -54;

        int maxValueOfXY = Math.max(x,y);
        int maxValueOfZ = Math.max(maxValueOfXY, z);
        System.out.println(maxValueOfXY);

        int minValueOfXY = Math.min(x,y);
        int minValueOfZ = Math.min(minValueOfXY, z);

        System.out.println(minValueOfZ);
    }
}

package Casting;

public class CastingPrimitives {
    public static void main(){

        /*
        double > float > long > int > char > short > byte
         */

        int myInt = 32;
        long myLong = myInt;   // implicit Casting

          //  this gives an error becaue it wants us to cast  myInt = myLont;

        myInt = (int)myLong;

        int mySecondInt = 'B';   // implicit casting
        char myChar = (char)56;  // int and char is equal so no casting is necessary

        int myThirdInt = (int) 45.4; // SAY THE DATA TYPE YOU WANT TO CONVERT NOT THE OTHER ONE!!




    }
}

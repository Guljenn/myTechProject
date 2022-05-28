package casting;

public class ConvertingStringToPrimitive {
    public static void main(String [] args){

        String num1 = "23";
        String num2 = "12";

        int num1Int = Integer.parseInt(num1);     // this method is used the most
        int num2Int = Integer.parseInt(num2);      // ParseDatatype is a primitive

        System.out.println(num1 + num2);
        System.out.println(num1Int + num2Int);

        Integer num1Integer = Integer.valueOf(num1);   // Value of is Wrapper Class
        Integer num2Integer = Integer.valueOf(num2);

       String bool = "false";     // the outcome will be whatever value you have in the variable. True is true, false is false.

       boolean claim1 = false;
       System.out.println(bool);
    }
}

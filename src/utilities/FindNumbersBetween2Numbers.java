package utilities;

public class FindNumbersBetween2Numbers {

    public static String findNumsBet_50And0 (int num) {
        if (num == 9) {
            return "You have hit the lucky number";
        }else if (num == -11) {
            return "You have hit the unlucky number";
        }

        if (num == 0) {
            return "The number is 0";
        } else if (num <= 50 && num > 0) {
            return "The number is positive and less the 50";
        } else if (num >= -50 && num < 0){
            return "The number is negative and more than -50";
        }
        return "The number is out of range";
    }

}

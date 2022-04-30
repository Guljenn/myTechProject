package enums;

import static enums.Constants.Frequencies.MONTHLY;
import static enums.Constants.Frequencies.YEARLY;

public class Practice_01 {
    public static void main(String[] args) {

        int hourly = 20;
        int daily = 160;
        int weekly = 800;
        int biWeekly = 1600;
        int monthly = 3200;
        int yearly = 38400;

        Constants.Frequencies frequency = MONTHLY;
        switch (frequency) {
            case YEARLY:
                System.out.println("38,400");
                break;
            case MONTHLY:
                System.out.println("3,200");
                break;
            case BIWEEKLY:
                System.out.println("1,600");
            case WEEKLY:
                System.out.println(weekly);
                break;
            case DAILY:
                System.out.println(daily);
                break;
            case HOURLY:
                System.out.println(hourly);
                break;
            default:
                throw new RuntimeException("There is no such frequency!!!");
        }
    }
}
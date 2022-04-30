package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingDateFormat {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate);

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(("Today is = " + sdf.format(currentDate)));

        SimpleDateFormat hm = new SimpleDateFormat("E, hh:mm a ");

        System.out.println( hm.format(currentDate));

    }
}

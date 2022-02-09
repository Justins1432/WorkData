package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        String eventDateFrom = "2022-02-26T11:00:00Z";
        String eventDateTo = "2022-02-26T19:59:00Z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date dateEventFrom = simpleDateFormat.parse(eventDateFrom);
        Date dateEventTo = simpleDateFormat.parse(eventDateTo);
        simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String formatStringEventFrom = simpleDateFormat.format(dateEventFrom);
        String formatStringEventTo = simpleDateFormat.format(dateEventTo);
        System.out.println("С " + formatStringEventFrom + " по " + formatStringEventTo);

    }

}

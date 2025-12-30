import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ZonedDateTimePrinter {

    public static void main(String s[]) {
        Scanner scanner = new Scanner(System.in);
        ZonedDateTime nowDateTime = ZonedDateTime.now();
        System.out.println("\nDefault Format " + nowDateTime);
   
        String strDateTimeFormat = scanner.nextLine();
        DateTimeFormatter newDateTimeformat = DateTimeFormatter.ofPattern(strDateTimeFormat);
        System.out.println("The date and time is " + nowDateTime.format(newDateTimeformat));
    }
}

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        
        // Get an instance of Calendar
        Calendar cal = Calendar.getInstance();
        
        // Display current date and time details
        System.out.println("Current Date and Time: " + cal.getTime());
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1)); // Month starts from 0
        System.out.println("Day of Month: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of Week: " + cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Hour: " + cal.get(Calendar.HOUR));
        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
        System.out.println("Second: " + cal.get(Calendar.SECOND));

        //  Add or subtract days, months, years
        cal.add(Calendar.DAY_OF_MONTH, 7);  // Add 7 days
        System.out.println("Date After 7 Days: " + cal.getTime());
        
        cal.add(Calendar.MONTH, -1);  // Subtract 1 month
        System.out.println("Date After Subtracting 1 Month: " + cal.getTime());
        
        // Compare two calendar dates
        Calendar anotherDate = Calendar.getInstance();
        anotherDate.set(2025, Calendar.DECEMBER, 25);  // Setting a specific date

        // Get time zone and calendar type
        System.out.println("Time Zone ID: " + cal.getTimeZone().getID());
        System.out.println("Calendar Type: " + cal.getCalendarType());
    }
}
/*
 ---- OUTPUT ----
 Current Date and Time: Thu Nov 06 17:41:35 IST 2025
 Year: 2025
 Month: 11
 Day of Month: 6
 Day of Week: 5
 Hour: 5
 Minute: 41
 Second: 35
 Date After 7 Days: Thu Nov 13 17:41:35 IST 2025
 Date After Subtracting 1 Month: Mon Oct 13 17:41:35 IST 2025
 Time Zone ID: Asia/Calcutta
 Calendar Type: gregory
*/
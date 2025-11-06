import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        
        // Create a Date object representing the current date and time
        Date currentDate = new Date();
        System.out.println("Current Date and Time: " + currentDate);

        // Get the time in milliseconds since January 1, 1970 (Epoch time)
        System.out.println("Milliseconds since Epoch: " + currentDate.getTime());

        // Create a new date after adding milliseconds (1 hour = 3600000 ms)
        Date oneHourLater = new Date(currentDate.getTime() + 3600000);
        System.out.println("One Hour Later: " + oneHourLater);

        // Create another date object and compare using equals()
        Date anotherDate = new Date(currentDate.getTime());
        System.out.println("Dates Equal: " + currentDate.equals(anotherDate));

    }
}
/*
 ---- OUTPUT ----
 Current Date and Time: Thu Nov 06 18:08:25 IST 2025
 Milliseconds since Epoch: 1762432705293
 One Hour Later: Thu Nov 06 19:08:25 IST 2025
 Dates Equal: true
*/


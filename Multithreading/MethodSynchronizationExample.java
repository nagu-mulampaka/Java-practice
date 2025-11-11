// Program to demonstrate Thread Synchronization in Java (Method Level)
// Shared resource class
class TicketBooking {
    boolean booked = false;

    // Synchronized method to prevent simultaneous access
    public synchronized void bookTicket(String name) {
        if (!booked) {
            System.out.println(name + " selected the seat");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println(name + " completed the payment");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println(name + " got the ticket");
            System.out.println(name + " successfully booked the Movie ticket");

            booked = true; // Seat is now booked
        } else {
            System.out.println("Sorry " + name + ", this seat is already booked.");
        }

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Thread class representing each user trying to book a ticket
class TicketThread extends Thread {
    TicketBooking booking;
    String passengerName;

    TicketThread(TicketBooking booking, String name) {
        this.booking = booking;
        this.passengerName = name;
    }

    public void run() {
        booking.bookTicket(passengerName);
    }
}

// Main class
public class MethodSynchronizationExample {
    public static void main(String[] args) {
        TicketBooking seat7 = new TicketBooking();

        TicketThread santosh = new TicketThread(seat7, "Nagu");
        TicketThread suresh = new TicketThread(seat7, "Suresh");

        santosh.start();
        suresh.start();
    }
}

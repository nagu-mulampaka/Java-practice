// Program to demonstrate Thread Synchronization in Java (Block Level)

// Represents a ticket booking system
class BusTicketBooking {
    private boolean isBooked = false;

    // Method to book a ticket
    public void bookTicket(String passengerName) {
        synchronized (this) {
            if (!isBooked) {
                System.out.println(passengerName + " selected the seat.");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(passengerName + " completed the payment.");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(passengerName + " got the ticket.");
                System.out.println(passengerName + " successfully booked the bus ticket.\n");
                isBooked = true;
            } else {
                System.out.println("Sorry " + passengerName + ", this seat is already booked.\n");
            }
        }

        // Simulate some delay outside the synchronized block
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Thread class representing a user trying to book a ticket
class BookingThread extends Thread {
    private final BusTicketBooking ticketBooking;
    private final String passengerName;

    BookingThread(BusTicketBooking bookingSystem, String name) {
        this.ticketBooking = bookingSystem;
        this.passengerName = name;
    }

    @Override
    public void run() {
        ticketBooking.bookTicket(passengerName);
    }
}

// Main class to run the synchronization example
public class BlockSynchronizationExample {
    public static void main(String[] args) {
        BusTicketBooking seat7 = new BusTicketBooking();

        BookingThread nagu = new BookingThread(seat7, "Nagu");
        BookingThread suresh = new BookingThread(seat7, "Suresh");

        nagu.start();
        suresh.start();
    }
}

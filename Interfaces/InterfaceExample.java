// Program: Demonstrating Interfaces in Java
// Define a common interface for all payment types
interface Payment {
    void pay(double amount);   // abstract method
    void paymentSuccess();     // abstract method
}

// Class implementing the interface
class CreditCardPayment implements Payment {
    String cardNumber;
    String cardHolder;
    String transactionId = "CC" + System.currentTimeMillis();

    CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    public void pay(double amount) {
        System.out.println("Credit Card Holder Name: " + cardHolder);
        System.out.println("Amount: " + amount);
        System.out.println("Card Number: XXXX-XXXX-XXXX-" + cardNumber.substring(12));
    }

    public void paymentSuccess() {
        System.out.println("Payment Successful! Transaction ID: " + transactionId);
    }

}

// Another class implementing the interface
class UpiPayment implements Payment {
    String upiId;
    String transactionId = "UPI" + System.currentTimeMillis();

    UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    public void pay(double amount) {
        System.out.println("Processing UPI payment via " + upiId);
        System.out.println("Amount: " + amount);

    }

    public void paymentSuccess() {
        System.out.println("Payment Successful! Transaction ID: " + transactionId);
    }

}

// Another class implementing the interface
class CashPayment implements Payment {
    String transactionId = "CASH" + System.currentTimeMillis();

    public void pay(double amount) {
        System.out.println("Payment received in cash: " + amount);
    }

    public void paymentSuccess() {
        System.out.println("Payment Successful! Transaction ID: " + transactionId);
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        // Create payment objects
        Payment credit = new CreditCardPayment("1234567812345678", "Nagu Mulampaka");
        Payment upi = new UpiPayment("nagu@upi");
        Payment cash = new CashPayment();

        /// Perform and display Credit Card payment
        System.out.println("---- CREDIT CARD PAYMENT ----");
        credit.pay(2500);
        credit.paymentSuccess();
        System.out.println();

        // Perform and display UPI payment
        System.out.println("---- UPI PAYMENT ----");
        upi.pay(1200);
        upi.paymentSuccess();
        System.out.println();

        // Perform and display Cash payment
        System.out.println("---- CASH PAYMENT ----");
        cash.pay(800);
        cash.paymentSuccess();
    }
}

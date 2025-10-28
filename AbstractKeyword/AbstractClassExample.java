// This program demonstrates abstract keyword in Java.
// Abstract class 
abstract class Vehicle {
    String brand;
    int speed;
    double fuelCapacity;

    // Constructor to initialize variables
    Vehicle(String brand, int speed, double fuelCapacity) {
        this.brand = brand;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    // Common method - same for all vehicles
    public void starting() {
        System.out.println(brand + " vehicle started at speed " + speed + " km/h");
    }

    public void stop() {
        System.out.println(brand + " vehicle stopped.");
    }

    // Common method to show vehicle details
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h, Fuel Capacity: " + fuelCapacity + " liters");
    }

    // Abstract methods - must be implemented by all subclasses
    abstract void fuelType();
    abstract double calMileage();
}

// Subclass 1: Car
class Car extends Vehicle {

    Car(String brand, int speed, double fuelCapacity) {
        super(brand, speed, fuelCapacity);
    }

    // Implementing the abstract method of Vehicle
    void fuelType() {
        System.out.println(brand + " uses Petrol as fuel.");
    }

    double calMileage() {
        return 15.5; // average mileage for car
    }
}

// Subclass 2: Electric Bike
class ElectricBike extends Vehicle {
    int batteryCapacity; // in kWh

    ElectricBike(String brand, int speed, double fuelCapacity) {
        super(brand, speed, fuelCapacity);
    }

    // Implementing the abstract method of Vehicle
    void fuelType() {
        System.out.println(brand + " runs on Electric Battery.");
    }

    double calMileage() {
        return 80.0; // km per charge
    }
}

// Main class
public class AbstractClassExample {
    public static void main(String[] args) {
        
        // Creating a Car object and calling its methods
        Vehicle v1 = new Car("Toyota", 150, 45);
        v1.displayInfo();
        v1.starting();
        v1.fuelType();
        System.out.println("Mileage: " + v1.calMileage() + " km/l");
        v1.stop();

        System.out.println("-------------------------------------------");

        // Creating an ElectricBike object and calling its methods
        Vehicle v2 = new ElectricBike("Ola", 90, 0);
        v2.displayInfo();
        v2.starting();
        v2.fuelType();
        System.out.println("Mileage: " + v2.calMileage() + " km/charge");
        v2.stop();
    }
}

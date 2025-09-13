// Abstract class Car
abstract class Car {
    // Abstract method (does not have a body)
    abstract void startCar();

    // Concrete method (has a body)
    void stopCar() {
        System.out.println("Car is stopping...");
    }
}

// Honda is a subclass of Car
class Honda extends Car {
    // Provide implementation for the abstract method
    @Override
    void startCar() {
        System.out.println("Honda car is starting...");
    }
}

// Main class to test abstraction
public class Abstarction {
    public static void main(String[] args) {
        Car myCar = new Honda(); // Creating an object of Honda
        myCar.startCar(); // Calls the startCar method of Honda class
        myCar.stopCar();  // Calls the stopCar method of Car class
    }
}

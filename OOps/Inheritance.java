// Parent class
class Animal {
    // Method in the parent class
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Method specific to Dog class
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to test inheritance
public class Inheritance {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog();

        // Call methods from both the parent class and the child class
        myDog.eat();  // Inherited method from Animal
        myDog.bark(); // Method of Dog class
    }
}

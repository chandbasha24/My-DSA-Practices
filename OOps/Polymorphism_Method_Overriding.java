// Parent class

class Animal {
    // Method in the parent class
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}

// Another child class
class Cat extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("The cat meows");
    }
}

public class Polymorphism_Method_Overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference and object
        Animal myDog = new Dog();       // Animal reference but Dog object
        Animal myCat = new Cat();       // Animal reference but Cat object

        myAnimal.sound(); // Calls the method from Animal class
        myDog.sound();    // Calls the overridden method from Dog class
        myCat.sound();    // Calls the overridden method from Cat class
    }
}

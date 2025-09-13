class MathOperations {
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double numbers
    double add(double a, double b) {
        return a + b;
    }
}

public class PolyMorphism_MethodOverloading {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        System.out.println("Sum of two integers: " + mathOps.add(5, 10));
        System.out.println("Sum of three integers: " + mathOps.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + mathOps.add(5.5, 10.5));
    }
}

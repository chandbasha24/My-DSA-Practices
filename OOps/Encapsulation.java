class Student {
    // Private variables to hide the data
    private String name;
    private int age;

    // Public method to set the student's name
    public void setName(String name) {
        this.name = name;
    }

    // Public method to get the student's name
    public String getName() {
        return name;
    }

    // Public method to set the student's age
    public void setAge(int age) {
        if (age > 0) { // Validation to ensure a valid age is set
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }

    // Public method to get the student's age
    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student student = new Student();

        // Setting values using setter methods
        student.setName("Chand Basha");
        student.setAge(21);

        // Getting values using getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}














// class BankAccount {
//     private double balance; // Private variable

//     public void deposit(double amount) { // Setter method
//         if (amount > 0) {
//             balance += amount;
//         } else {
//             System.out.println("Invalid deposit amount.");
//         }
//     }

//     public double getBalance() { // Getter method
//         return balance;
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         BankAccount myAccount = new BankAccount();
//         myAccount.deposit(1000); // Using setter to add money
//         System.out.println("Balance: " + myAccount.getBalance()); // Using getter to view balance
//     }
// }

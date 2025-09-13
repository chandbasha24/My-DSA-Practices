public class PrimeNumbersInRange {
    public static void main(String[] args) {
       int num=50;
        // Iterate through each number in the range
        for (int i= 1; i <=num; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
 // Check divisibility from 2 to num-1
        for (int i = 2; i <num; i++) {
            if (num % i == 0) {
                return false; // If divisible by any number other than 1 and itself, it is not prime
            }
        }
        return true; // If no divisors found, it is prime
    }
}

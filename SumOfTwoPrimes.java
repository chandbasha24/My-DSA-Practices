
public class SumOfTwoPrimes {

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
        
    //     // Input the number to check
    //     System.out.print("Enter a number: ");
    //     int number = scanner.nextInt();

    //     // Check if the number can be expressed as a sum of two prime numbers
    //     boolean found = false;
    //     for (int i = 2; i <= number / 2; i++) {
    //         if (isPrime(i) && isPrime(number - i)) {
    //             System.out.println(number + " = " + i + " + " + (number - i));
    //             found = true;
    //         }
    //     }

    //     if (!found) {
    //         System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
    //     }

       
    // }

    // // Helper function to check if a number is prime
    // public static boolean isPrime(int num) {
    //     if (num <= 1) {
    //         return false;
    //     }
    //     for (int i = 2; i <= Math.sqrt(num); i++) {
    //         if (num % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static String  longestPrefix(String[] str){
    if(str.length==0 || str==null){
        return "";
       
        
    }
    // String arr[] ={"flower","fly","flow"};
    String prefix=str[0];
    for(int i=1;i<str.length;i++){
    while(!str[i].startsWith(prefix)){
        prefix=prefix.substring(0,prefix.length()-1);
        if(prefix.isEmpty()){
            return "";
        }
    }}
    return prefix;
    } 
    
    public static void main(String[] args) {
         String str[]={"flower","fly","flow"};
            System.out.println("Longest common prefix: " + longestPrefix(str));
    
    }
}

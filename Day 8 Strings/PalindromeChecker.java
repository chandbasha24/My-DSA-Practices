import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to make the check case-insensitive
        str = str.toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        
        return true;  // If the loop completes, the string is a palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        
        sc.close();
    }
}

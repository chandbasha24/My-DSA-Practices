public class StringRecursionPalindrome {
    public static boolean isPalin(int num ){
        String str= Integer.toString(num);
        if(str.length()<=1){
            return true;
        }
        if(str.charAt(0)==str.charAt(str.length()-1)){
            // return isPalin(str.substring(1, str.length()-1));
            return isPalin(Integer.parseInt(str.substring(1, str.length()-1)));
        }
        return false;
    }
    public static void main(String[] args) {
        int num1=99899;
        System.out.println(isPalin(num1));
    }
}




















// public class MergeTwoSorted {
//     public static boolean Palin(String str){
       
//         if(str.length()<=1){
//             return true;
//         }
//             if(str.charAt(0)==str.charAt(str.length()-1)){
//               return Palin(str.substring(1,str.length()-1));
//             }
//             return false;
        
//     }
//     public static void main (String args[])
//     {
//     String str="malayalam";
//     System.out.println(Palin(str));
//     }
// }
// public class ReverseNumberRecursion {

//     public static int reverse(int num, int reversedNum) {
//         // Base case: if num becomes 0, return the reversed number
//         if (num == 0) {
//             return reversedNum;
//         }
//         // Get the last digit of num
//         int lastDigit = num % 10;
//         // Add the last digit to the reversed number and move its position to the left
//         reversedNum = reversedNum * 10 + lastDigit;
//         // Recursively call reverse with the remaining part of the number
//         return reverse(num / 10, reversedNum);
//     }

//     public static void main(String[] args) {
//         int num = 12345;
//         int reversedNum = reverse(num, 0);
//         System.out.println("Reversed number: " + reversedNum);
//     }
// }



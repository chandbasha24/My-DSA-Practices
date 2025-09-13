public class RecursionExample {
    public static int sum(int k){
        if(k>0){
            return k+sum(k-1);
        }
        else{
            return 0;
        }

    }
    public static void main(String[] args){
        int total=sum(3);
        System.out.println("total " +total);
    }
}
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


 import java.util.*;
public class sort012 {
    public static int[] sort012(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int mid = 0;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[mid] and arr[low]
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                // Move mid ahead
                mid++;
            } 
            else{
                
                // Swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }return arr;
    }

    public static void main(String[] args) {
        // Test input array
        int[] arr = {0, 1, 2, 0, 1, 2, 0, 2, 1};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sorting the array
        sort012(arr);
        
        // Output the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

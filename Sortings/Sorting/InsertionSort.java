
import java.util.*;
public class InsertionSort {
    static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int[] result = insertionSort(arr);
       
        System.out.println(Arrays.toString(result));
    }
}
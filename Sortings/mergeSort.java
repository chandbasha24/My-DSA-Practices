import java.util.Arrays;

public class MergeSort {
    
    // Function to merge two subarrays of arr[]
    public static void merge(int[] a, int l, int mid, int r) {
        // Sizes of the two subarrays
        int n1 = mid - l + 1;
        int n2 = r - mid;
        
        // Temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            L[i] = a[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = a[mid + 1 + j];
        
        // Initial indexes of the subarrays
        int i = 0, j = 0;
        
        // Initial index of merged subarray array
        int k = l;
        
        // Merge the temporary arrays
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of L[] if any
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of R[] if any
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }
    
    // Main function that sorts arr[l..r] using merge()
    public static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            // Find the middle point
            int mid = l + (r - l) / 2;
            
            // Sort first and second halves
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);
            
            // Merge the sorted halves
            merge(a, l, mid, r);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        mergeSort(arr, 0, arr.length - 1);
        
        System.out.println(Arrays.toString(arr));
    }
}

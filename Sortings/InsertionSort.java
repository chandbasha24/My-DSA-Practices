import java.util.Arrays;

public class InsertionSort {
    
    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }return arr;
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] output = insertionSort(arr);
        
        System.out.println(Arrays.toString(output));
    }
}


// def binary(arr):
//     n=len(arr)
//     for i in range(1,n):
//         j=i
//         while j>0 and arr[j-1]>arr[j]:
//             arr[j-1], arr[j]=arr[j],arr[j-1]
//             j-=1
//     return arr
  
// arr=[1,23,3,4,5]

// output=binary(arr)
// print(output)
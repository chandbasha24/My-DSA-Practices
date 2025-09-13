import java.util.Arrays;

public class SelectionSort {
    
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) { 
                if (arr[minIndex]>arr[j]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 99, 22, 11, 90};
        int[] output = selectionSort(arr);
        
        System.out.println(Arrays.toString(output));
    }
}


// def binary(arr):
//     n=len(arr)
//     for i in range(n):
//         minIndex=i
//         for j in range(i+1,n):
//             if arr[minIndex]>arr[j]:
//                minIndex=j
//         arr[minIndex],arr[i]=arr[i],arr[minIndex]
//     return arr
  
// arr=[1,23,3,4,5]

// output=binary(arr)
// print(output)
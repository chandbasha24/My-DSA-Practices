
class Solution {
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <high  && arr[i] <= pivot) {
                i++;
            }

            while (j > low && arr[j] >= pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }

   
}

public class QUICK_SORT {
    public static void main(String[] args) {
        Solution sc=new Solution(); 
        int[] arr = {4, 6, 2, 5, 7, 1, 1, 3};
        int n = arr.length;
        System.out.println("Before Using Quick Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.qs(arr, 0, arr.length - 1);
        System.out.println("After Quick Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


// def partition(arr, low, high):
//     pivot = arr[low]
//     i = low
//     j = high
    
//     while i < j:
//         while i < high and arr[i] <= pivot:
//             i += 1
//         while j > low and arr[j] >= pivot:
//             j -= 1
//         if i < j:
//             arr[i], arr[j] = arr[j], arr[i]  # Swap
    
//     arr[low], arr[j] = arr[j], arr[low]  # Swap pivot to correct position
//     return j


// def quick_sort(arr, low, high):
//     if low < high:
//         p_index = partition(arr, low, high)
//         quick_sort(arr, low, p_index - 1)
//         quick_sort(arr, p_index + 1, high)


// # Main program
// arr = [4, 6, 2, 5, 7, 1, 1, 3]
// n = len(arr)
// print("Before Using Quick Sort:", arr)
// quick_sort(arr, 0, n - 1)
// print("After Quick Sort:", arr)

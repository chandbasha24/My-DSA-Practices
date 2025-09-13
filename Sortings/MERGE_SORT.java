import java.util.*;

class Solution {
    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2 ;
        mergeSort(arr, low, mid);  // left half
        mergeSort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high);  // merging sorted halves
    }
}
public class MERGE_SORT{
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        Solution sc=new Solution();
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        sc.mergeSort(arr, 0, n-1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}


// def merge(arr, low, mid, high):
//     temp = []  # Temporary array
//     left = low  # Starting index of left half
//     right = mid + 1  # Starting index of right half

//     # Storing elements in a sorted manner
//     while left <= mid and right <= high:
//         if arr[left] <= arr[right]:
//             temp.append(arr[left])
//             left += 1
//         else:
//             temp.append(arr[right])
//             right += 1

//     # If elements on the left half are still remaining
//     while left <= mid:
//         temp.append(arr[left])
//         left += 1

//     # If elements on the right half are still remaining
//     while right <= high:
//         temp.append(arr[right])
//         right += 1

//     # Transferring elements from temp to original array
//     for i in range(len(temp)):
//         arr[low + i] = temp[i]


// def merge_sort(arr, low, high):
//     if low >= high:
//         return
//     mid = (low + high) // 2
//     merge_sort(arr, low, mid)  # Left half
//     merge_sort(arr, mid + 1, high)  # Right half
//     merge(arr, low, mid, high)  # Merging sorted halves


// # Main program
// arr = [9, 4, 7, 6, 3, 1, 5]
// n = len(arr)
// print("Before sorting array:", arr)
// merge_sort(arr, 0, n - 1)
// print("After sorting array:", arr)

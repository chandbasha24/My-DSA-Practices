

public class BubbleSort {
    
    public  static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n -1; i++) {
            
          
            for (int j = 0; j < n - 1 - i; j++) {
                
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
           
        }return arr;
    }

    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90}; 
        int[] output=bubbleSort(arr);
         for(int i:output){
            System.out.print(i+ " ");
         }
        // System.out.println(Arrays.toString(output));

        

       
    }
}



// def bubble_sort(arr):
//     n = len(arr)
//     for i in range(n - 1):
//         for j in range(n - 1 - i):
//             if arr[j] > arr[j + 1]:
//                 arr[j], arr[j + 1] = arr[j + 1], arr[j]  # Swapping
//     return arr

// arr = [64, 34, 25, 12, 22, 11, 90]
// output = bubble_sort(arr)
// print(" ".join(map(str, output)))

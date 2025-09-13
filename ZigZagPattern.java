import java.util.*;
 class ZigZagPattern {
    public static int[] convertToZigZag(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0) {
                // If the current index is even, ensure arr[i] < arr[i + 1]
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i+1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                // If the current index is odd, ensure arr[i] > arr[i + 1]
                if (arr[i] < arr[i + 1]) {
                    // Swap arr[i] and arr[i+1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
       System.out.println(Arrays.toString( convertToZigZag(arr)));
    //    for(int i:arr){
    //        System.out.print(i+" ");
    //    }
        
       
    }
}

import java.util.*;
public class arr012 {
    public static void arr012(int arr[]){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int mid=0;
       while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[mid] and arr[low]
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }  else if (arr[mid] == 1) {
                // Move mid ahead
                mid++;
            } 
              else if(arr[mid]==2){
                // Swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        }
    
    public static void main(String args[]){
        // Profit sc=new Profit();
      int arr[]={2,0,1,1,1,0};
      arr012(arr);
     for(int i:arr){
          System.out.print(i+" ");
     }
    }
}

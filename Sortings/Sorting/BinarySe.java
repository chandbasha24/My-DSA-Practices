
import java.util.*;

public class BinarySe{
    public static void main(String[] args) {
        int arr[]={1,3,45,43,22,6};
        int target=22;
        Arrays.sort(arr);
        int index=sort(arr, target);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found "+index);
        }
    }
    public static  int sort(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<high){
                low=mid+1;
            }
            else{
                high=mid-1;
            } 
        }
      return -1;
    }
}
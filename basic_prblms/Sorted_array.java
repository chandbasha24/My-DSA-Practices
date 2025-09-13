
import java.util.Arrays;

public class Sorted_array {
    static int[] IsSorted(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            
                if(arr[i+1]<arr[i])
                return new int[]{i,i+1};
         
        }
        return new int[]{-1,-1};
       

    }
    public static void main (String args[])
    {
        int arr[]={3,4,5,8,7,9};
        int n=arr.length;
        int result[]=IsSorted(arr, n);
       if(result[0]==-1){
        System.out.println("the array is sorted");
       }
       else{
        System.out.println("the "+ Arrays.toString(result));
       }
    }
    
}

import java.util.Arrays;

public class kth_Largest_And_Smallest_By_AscendingOrder {
    static void kth(int arr[], int k){
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println("kth largest elemt "+arr[n-k]+ "kth smallest "+arr[k-1]);
    }
    public static void main(String[] args) {
        int arr[]={6,5,1,2,4,8}; //1,2,4,5,6,8  
        kth(arr, 3);
    }
}

import java.util.*;

class Solution{
    public static void merge(int arr[], int low, int mid, int high){
        ArrayList<Integer>temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid &&right<=high )
    
    {
        if(arr[left]<arr[right]){
            temp.add(arr[left]);
            left++;
        }
        else{
            temp.add(arr[right]);
            right++;
        }
    }
    while(left<=mid){
        temp.add(arr[left]);
           left++;
    }
    while(right<=high){
        temp.add(arr[right]);
        right++;
    }
    for(int i=low;i<=high;i++){
        arr[i]=temp.get(i-low);
    }

}
public static void mergeSort(int arr[], int low,int high){
  
    if(low>=high) return;
    int mid=(low+high)/2;
    mergeSort(arr,low,mid);  //left sub array
    mergeSort(arr,mid+1,high); // right sub array
    merge(arr,low,mid,high);   //combine both arrays..

}
}

public class MergeSort {
    public static void main(String[] args) {
        Solution sc=new Solution();
        int n=7;
        int arr[]={4,5,32,54,6,3,2};
        System.out.println("before sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
       System.out.println();
        sc.mergeSort(arr,0,n-1);
        System.out.println("after sort" );
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " " );
        }
        System.out.println();

    }
    
}
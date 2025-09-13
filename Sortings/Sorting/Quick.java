
class Solution{
    public static int partition(int arr[], int low, int high){
    int pivot=arr[low];
    int i=low;
    int j=high;
    while(i<j){
        
        while(arr[i]<=pivot && i<=high-1){
            i++;
        }
        while(arr[j]>pivot && j>=low+1){
            j--;
        }
        if(i<j){
          int temp=arr[j];
          arr[j]=arr[i];
          arr[i]=temp;
        }
    }
    int temp=arr[low];
    arr[low]=arr[j];
    arr[j]=temp;
    return j;
    }
    public static void qs(int arr[], int low, int high){
        if(low<high){
  int pIndex=partition(arr, low, high);
  qs(arr,low,pIndex-1);
  qs(arr,pIndex+1,high);
        }
    }
}

 class Quick {
    public static void main(String[] args) {
        Solution sc=new Solution();
        int arr[]={2,34,5,64,4,32,24,56,4};
        int n=arr.length;
        System.out.println("before sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        sc.qs(arr, 0, n-1);
        System.out.println();
        System.out.println("after sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}

public class SecondLargest {
    public static int SecLar(int arr[]){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
                
            }
           else if(secondLargest<arr[i] &&arr[i]!=largest){
                secondLargest=arr[i];
            }
        }return secondLargest;
    }
    public static void main (String args[]){
        int arr[]={1,47,78,1,8,3,5};
        int second=SecLar(arr);
       System.out.println(second);
    }
}


public class  Maxprofit1 {
    public static int maximumProfit(int arr[]){
        // Write your code here.
        int n=arr.length;
        int maxprofit=0;
        int minprices=Integer.MAX_VALUE;
         for(int i=0;i<n;i++)
         {
        minprices=Math.min(minprices,arr[i]);
          maxprofit=Math.max(maxprofit,arr[i]-minprices);
         }
         return maxprofit;
    }
    public static void main(String[] args) {
        int pricess[]={7,1,2,3,4,5,8};
        int maxpro=maximumProfit(pricess);
        System.out.println("Maximum Profit :"+maxpro);
    }
}

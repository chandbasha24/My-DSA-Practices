class Solution {
    public int maxProfit(int[] prices) {
    int maxPro=0;
    int minPrice=Integer.MAX_VALUE;
    for(int i=0;i<prices.length;i++){
 minPrice=Math.min(minPrice,prices[i]);
 maxPro=Math.max(maxPro,prices[i]-minPrice);
    }return maxPro;
}
}
public class MaxProfit{
    public static void main(String args[]){
        Solution sc=new Solution();
        int prices[]={1,5,4,3,79,8};
        int result=sc.maxProfit(prices);
       
            System.out.println("maxprofit " + result);
     
        
    }
}
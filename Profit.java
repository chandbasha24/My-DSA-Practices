public class Profit {
    public static void main(String args[]){
        int prices[]={7,1,5,3,3,6,4};
        int n=prices.length;
        int maxPro=0;
        int minprices=Integer.MAX_VALUE; 
        for(int i=0;i<n;i++){
            minprices=Math.min(minprices,prices[i]);    // infinity , 7    -1,1 
            maxPro=Math.max(maxPro,prices[i]-minprices); //0, 7-7 --0 
          
        }
        System.out.println(maxPro);
    }
}


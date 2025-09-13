public class PrimeRange {
    public static void main (String args[]){
       for(int i=2;i<=10;i++){
       if(isPrime(i)){
        System.out.print(i+ " ");
       }
       }
    }
    public static boolean isPrime(int n){
          if(n<=1){
            return false;
          }
        for(int j=2;j<n;j++){
            if(n%j==0){
                return false;
            }            
        }
        return true;
    }
}



public class SumRecursion {
    public static int Sum(int n){
        int rev=0;
        while(n>0){ 
        int last=n%10;
        rev=rev+last;
        n=n/10;
    }return rev;
    }
   
    public static void main(String[] args) {
      int n=1234;
      System.out.println("Sum of digits of "+n+" is "+Sum(n));
}}

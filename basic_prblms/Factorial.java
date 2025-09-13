import java.util.*;
public class Factorial{  
    public static void main(String []args)
    {
        int res=1,n;
        System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();

    while(n>0)
        {
           res=res*n ;
           n--;
           
        }
        System.out.println(res);
      
    }
}

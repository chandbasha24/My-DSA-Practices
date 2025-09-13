import java.util.*;
public class Prime 
{
    public static void main(String[] args)
    {

        int n, count=0;
        System.out.println("enter the number :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
               count++;
            }
        }
        if(count==2)
        {
        
           System.out.println("this is prime number");
    }
      else{
      
        System.out.println("not prime");
      }
    }

}

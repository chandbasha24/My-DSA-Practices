import java.util.Scanner;

public class For {
  
        public static void main (String[] args)
        {
       int sum=0,a,b;
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the a:");          
        a=sc.nextInt();
        System.out.println("enter the b :");
        b=sc.nextInt();
   
for(int i=a+1; i<b;i++)
{
    sum=i+sum;
}
System.out.println(sum);
    } 
    
}

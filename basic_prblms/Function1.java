import java.util.Scanner;

public class Function1 
{
        static int printAdd(int x,int y)
   {
        System.out.println("the sum is "+(x+y));
        return x+y;
    }
public static void main(String[] args)
{
int a,b;

Scanner sc=new Scanner(System.in);  
System.out.println("enter the a:");        
a=sc.nextInt();
System.out.println("enter the b");
b=sc.nextInt();
printAdd(a, b);
}


}



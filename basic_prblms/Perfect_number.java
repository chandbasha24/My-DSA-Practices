import java.util.Scanner;

public class Perfect_number {
    public static void main(String []args)
    {
    int n,sum=0;
    System.out.println("enter the number");// 1+2+3-->6 
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    for(int i=1;i<n;i++)
    {
        if(n%i==0)
        {
            sum=sum+i;
        }
    }
    if(n==sum)
    {
        System.out.println("this is perfect number");
    }
    else
    {
        System.out.println("this is not perfect number");
    }

    }
}

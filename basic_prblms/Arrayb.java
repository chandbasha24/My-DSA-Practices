import java.util.Scanner;

public class Arrayb 
{
    public static void main(String[] args)
    {
        int a[]=new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array less than 5 : ");
        int n=sc.nextInt();
        System.out.println("enter the elemnents");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                System.out.println(a[i]);
            }
    }
}

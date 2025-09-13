import java.util.Scanner;
public class Tribonacci {
    public static void main(String[] args)
    {
        int a=0,b=1,c=1,d,term;
        System.out.print("enter the term");
        Scanner sc= new Scanner(System.in);
        term=sc.nextInt();
        for(int i=1;i<=term;i++)
        {
            System.out.print(a+" ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;
           
        }


    }

    
}

import java.util.*;
public class Fibonocci {
    public static void main(String[] args)
    {
        int term,a=0,b=1,c;
        System.out.println("enter the term :");
        Scanner sc = new Scanner(System.in);
        term=sc.nextInt();
        for(int i=1;i<=term;i++)
        {
            System.out.print(a);
            c=a+b;
            a=b;
            b=c;

        }
    }
    
}

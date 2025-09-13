import java.util.Scanner;
public class Palindrome {
    public static void main(String []args)
    {
        int n,c,r,s=0; //s reverse number
        System.out.println("enter the number ");
        Scanner sc= new Scanner (System.in);
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;

        }
        if(c==s)
        {
        System.out.println("palindrome number");
        }
        else{
            System.out.println(" not palindrome number");
        }
    }
}

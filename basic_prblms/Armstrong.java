
import java.util.Scanner;
public class Armstrong {
    public static void main(String[]args)
    {
        int n, c, r, arm=0;
        System.out.println("enter the armstrong");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0)  //153.....
        {
            r=n%10;
            arm=(r*r*r)+arm;
            n=n/10;
        }
        if(c==arm)
        {
            System.out.println("this is armstrong number");
        }
        else{
             System.out.println("this is not armstrong number");
        }
    }
    
}

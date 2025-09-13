import java.util.*;
public class Reverse_number {   //123--321
    public static void main(String []args)
    {
        int r,n,s=0;
        System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();

    while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
            
        }
        System.out.println(s);
      
    }
}

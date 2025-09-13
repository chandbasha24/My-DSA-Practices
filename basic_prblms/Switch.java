import java.util.Scanner;

public class Switch {
    public static void main (String[] args){
         int a;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        
        switch (a) 
        {
            case 1:
            System.out.println("ur in case1");
        break;
         case 2:
            System.out.println("ur in case2");
        break;
         case 3:
            System.out.println("ur in case3");
        break;
            default:
            System.out.println("not available");
                break;
        }
    }
    
}

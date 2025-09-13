import java.util.*;

public class Marks {
    public static void main(String[] args)
    {
         System.out.println("enter an integer: ");
        Scanner sc = new Scanner(System.in);
       
        int n =sc.nextInt();
    if(n<50)
    {
        System.out.println("fail");
    }
    else if(n>50 && n<60)
{
    System.out.println("D");
}
else if(n>60 && n<70)
{
    System.out.println("C");
}
else if(n>70 && n<80)
{
    System.out.println("B");

}
else if(n>80 && n<90)
{
    System.out.println("A");
}
else if(n>90 && n<100){
    System.out.println("ex");
}

else{
    System.out.println("wrong input");
}
}
}

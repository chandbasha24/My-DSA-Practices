import java.util.Scanner;

public class Leaf_year 
{
     public static void main(String []args)
    {
    int year;
    System.out.println("enter the year");
    Scanner sc=new Scanner(System.in);
    year=sc.nextInt();
    if(year%400==0 || year%100!=0&&year%4==0){
        System.out.println("leap");
    }
    else{
        System.out.println("not leap");
    }
   }
}
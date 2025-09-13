
import java.util.Scanner;


public class String_palindrome {

  static boolean ispalindrome(String s){
    int left=0,right=s.length()-1;
    while(left<right){
     if(s.charAt(left)!=s.charAt(right)){
      return false;
     }
     left++;
     right--;
    
  } return true;}
    public static void main(String[] args){

   
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the string");
   String s=sc.nextLine();
   s=s.toLowerCase();
  //  sc.close();
  //  String rev="";
  //  for(int i=s.length()-1;i>=0;i--){
  //    rev=rev+s.charAt(i);
  //  }
  //  if(s.equals(rev)){
  //   System.out.println("palindrome");
  //  }
  //  else{
  //   System.out.println("not plainffrome");
  //  }
  if(ispalindrome(s)){
    System.out.println("palindrome");
   }
   else{
   
      System.out.println("not palindrome");
    
   }


   }


}

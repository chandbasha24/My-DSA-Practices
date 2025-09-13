


public class Count{ 
    public static void main(String args[]) 
    { 
         int n = 345678945;
        System.out.println("Number of digits in "+n+" is "+count_digits(n));
    } 

    static int count_digits(int n)
    {
       int x = n;
        int count =0;
       while( x>0 ) 
      {
          x = x / 10;
          count++;
      }
       return count;
    } 
    
}
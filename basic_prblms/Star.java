class Main 
{
   static void Star(int N)
  {
    
    for (int i = 0; i<N; i++)
    {
        //space
       for(int j=0;j<N-i-1;j++)
       {
         System.out.print("  ");
       }
       //stars
        for(int j=0;j< 2*i+1;j++)
        {
            System.out.print("* ");
        }
        //spaces....
        for(int j=0;j<N-i-1;j++)
        {
              System.out.print("  ");
        }


        System.out.println();
       }
    }

    public static void main(String[] args)
     {
        
        int N =5;
        Star(N);
     }
}
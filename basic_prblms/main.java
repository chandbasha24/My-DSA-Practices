public class main {
    static void patternABCBA(int N)
    {
        
        for (int i = 0; i<N; i++)
        {
            //space
           for(int j=0;j<N-i-1;j++)
           {
             System.out.print(" ");
           }
           //stars
    
           char ch='A';
                int breakpoint=(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++)
            {
                 System.out.print(ch);
                if(j<= breakpoint) ch++;
                else ch--;
                
               
            }
            //spaces....
            for(int j=0;j<N-i-1;j++)
            {
                  System.out.print(" ");
            }
    
    
            System.out.println();
           }



    }
    public static void main(String [] argas)
    {
        int N=5;
        patternABCBA(N);
    }
}

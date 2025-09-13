public class TriangleABC  {
    public static void main(String [] args)
    {
        int n=5;
        {
        
        for(int i=1;i<n;i++)
        {
            for(char ch='A';ch <='A'+i;ch++)
            {
                
                System.out.print(ch+ " ");
              

            }
        System.out.println(" ");
        }
    

        
        for(int i=0;i<=n;i++)
        {
            for(char ch='A';ch <='A'+(n-1-i);ch++)
            {
                
                System.out.print(ch+ " ");
              

            }
        System.out.println(" ");
        }

    }
}
}
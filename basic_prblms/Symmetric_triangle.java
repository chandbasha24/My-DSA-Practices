public class Symmetric_triangle {
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=2*n;i++)
        {
            int Start=i>n ?2*n-i: i;
            
            for(int j=1; j<=Start;j++)
            {
                System.out.print("* ");
            }
             System.out.println();
        }
    }
}

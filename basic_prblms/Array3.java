public class Array3 
{
    
    static void anonymous(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args)
    {  //anonymous aray.....
        anonymous(new int [] {1,2,3,4,5,});
    }
}

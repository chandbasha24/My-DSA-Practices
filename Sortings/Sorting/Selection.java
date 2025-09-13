import java.util.*;
class Selection {
    static int[] Selection_Sort( int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {  
            int mini=i;
            for(int j=i+1;j<n;j++)
            { if(arr[mini]>arr[j])
                {
                  mini=j;
                }
            }
            int temp= arr[mini];
            arr[mini]=arr[i];
            arr[i]= temp;
            
        }
        return arr;
    }
    public static void main( String [] args)
    {
        int arr[]= {13, 46, 24, 52, 20, 9};
       int n= arr.length;
       System.out.println("Before selection sort:");
       
       for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " ");
       }
       System.out.println();
   
     System.out.println("after selection sort:"+Arrays.toString(Selection_Sort(arr)));
   }
       
    }


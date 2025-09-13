class MOVE_ZEROES_LAST {
    public static void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int j=0;j<n;j++)
        {
            if(nums[j]!=0)
            {
              nums[i]=nums[j];
                i++;

            }
           
        } 
       for(int k=i;k<n;k++)
       {
           nums[k]=0;
       }
    }
    public static void main(String[] args) {
        // MOVE_ZEROES_LAST sc=new MOVE_ZEROES_LAST();
        int nums[]={0,3,0,4,0,2};
        for(int i:nums){
            System.out.print(i+" ");
        }
        System.out.println("");
        MOVE_ZEROES_LAST.moveZeroes(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}



/*public class Solution {
    public static int[] moveZeros(int n, int[] a) {
        // Write your code here.
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (a[j] != 0) {
                a[i++] = a[j];
            }
        }
        while (i < n) {
            a[i++] = 0;
        }
        return a;
    }
}         */

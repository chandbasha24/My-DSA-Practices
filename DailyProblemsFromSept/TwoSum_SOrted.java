class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int arr[]=new int[2];
        while(i!=j){
            if(numbers[i]+numbers[j]>target)
            j--;
            else if(numbers[i]+numbers[j]<target)
            i++;
            else{
                arr[0]=i+1;
                arr[1]=j+1;
                return arr;
            }
        }return arr;

        // for(int i=0;i<numbers.length;i++)
        // {
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(numbers[i]+numbers[j]==target)
        //         return new int[] {i+1,j+1};
        //     }
        // }return new int[] {};
    }
}
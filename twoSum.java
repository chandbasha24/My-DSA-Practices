class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main (String[]args){
        // Solution sc=new Solution();
        int nums[]={4,5,7,9,6};
        int target=12;
        int[] result=Solution.twoSum(nums,target);
        if(result.length==2){
           
             System.out.println("Indices of the two numbers that add up to the target are: " + result[0]+ " and " + result[1]);
        }
        else{
            System.out.println("not found");
        }
    }
}

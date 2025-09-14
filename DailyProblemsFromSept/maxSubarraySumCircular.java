class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum=nums[0];
        int currMax=nums[0];
        int minSum=nums[0];
        int currMin=nums[0];
        int totalSum=nums[0];

        for(int i=1;i<nums.length;i++){
            currMax=Math.max(nums[i],nums[i]+currMax);
            maxSum=Math.max(maxSum,currMax);
            currMin=Math.min(nums[i],currMin+nums[i]);
            minSum=Math.min(minSum,currMin);

              totalSum+=nums[i];
        }
        if(minSum==totalSum)
        {return maxSum;}
        else{
            return Math.max(maxSum,totalSum-minSum);
        }
            
    }
}
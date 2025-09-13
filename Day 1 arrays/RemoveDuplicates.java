
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int n = nums.length;
        int j = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        
        return j;
    }
    private static void printArray(int[] nums, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();
        
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3,4,6};
        
        int k1 = solution.removeDuplicates(nums);
        System.out.print("Output for nums1: " + k1 + ", nums = ");
        printArray(nums, k1);
        
    }
}

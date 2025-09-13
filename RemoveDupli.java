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

    
}
public class RemoveDupli{
    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();
        
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        
        int k1 = solution.removeDuplicates(nums1);
        System.out.print("Output for nums1: " + k1 + ", nums = ");
        printArray(nums1, k1);
        
        int k2 = solution.removeDuplicates(nums2);
        System.out.print("Output for nums2: " + k2 + ", nums = ");
        printArray(nums2, k2);
    }
}

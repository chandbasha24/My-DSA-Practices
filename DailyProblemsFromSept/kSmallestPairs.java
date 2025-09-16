class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>>result=new ArrayList<>();
        if(nums1.length==0 || nums2.length==0 || k==0){
            return result;
        }
        PriorityQueue<int[]> minHeap =new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(int i=0;i<nums1.length && i<k;i++){
            minHeap.offer(new int[]{nums1[i]+nums2[0],i,0});
        }
        while (!minHeap.isEmpty() && k > 0) {
            int[] current = minHeap.poll();
            int i = current[1];
            int j = current[2];

            result.add(Arrays.asList(nums1[i], nums2[j]));
            k--;
           if (j + 1 < nums2.length) {
                minHeap.offer(new int[]{nums1[i] + nums2[j + 1], i, j + 1});
            }
        }

        //O(min(m,k)⋅log(min(m,k)))+O(klogk)......



        return result; 
    }



    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Example 1: Basic test case
        int[] nums1_ex1 = {1, 7, 11};
        int[] nums2_ex1 = {2, 4, 6};
        int k_ex1 = 3;
        List<List<Integer>> result1 = solution.kSmallestPairs(nums1_ex1, nums2_ex1, k_ex1);
        System.out.println("Example 1 Output: " + result1); // Expected: [[1, 2], [1, 4], [1, 6]]

        // Example 2: Duplicate numbers
        int[] nums1_ex2 = {1, 1, 2};
        int[] nums2_ex2 = {1, 2, 3};
        int k_ex2 = 2;
        List<List<Integer>> result2 = solution.kSmallestPairs(nums1_ex2, nums2_ex2, k_ex2);
        System.out.println("Example 2 Output: " + result2); // Expected: [[1, 1], [1, 1]]

        // Example 3: k is larger than the number of possible pairs
        int[] nums1_ex3 = {1, 2};
        int[] nums2_ex3 = {3, 4};
        int k_ex3 = 5;
        List<List<Integer>> result3 = solution.kSmallestPairs(nums1_ex3, nums2_ex3, k_ex3);
        System.out.println("Example 3 Output: " + result3); // Expected: [[1, 3], [1, 4], [2, 3], [2, 4]]
    }
}
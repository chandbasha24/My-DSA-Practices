class Solution {
    public int[][] insert_List_After_Add_List(int[][] intervals, int[] newInterval) {
        //new List.... for adding
        List<int[]> intervalList =new ArrayList<>(Arrays.asList(intervals));
        intervalList.add(newInterval);
        //sort.........
        Collections.sort(intervalList,(a,b)->Integer.compare(a[0],b[0]));

        //temp list.........for result
        List<int[]>merged=new ArrayList<>();
        int[]prev= intervalList.get(0);
        for(int i=1;i<intervalList.size();i++){
            int[] curr= intervalList.get(i);
            if(prev[1]>=curr[0]){
                prev[1]=Math.max(prev[1],curr[1]);
            }
            else{
                merged.add(prev);
                prev=curr;
            }
        }merged.add(prev);

        //converted to list to array
        return merged.toArray(new int[merged.size()][]);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: No overlap
        int[][] intervals1 = {{1, 3}, {6, 9}};
        int[] newInterval1 = {2, 5};
        int[][] result1 = solution.insert(intervals1, newInterval1);
        System.out.println("Example 1: Merged intervals: " + Arrays.deepToString(result1)); // Expected: [[1, 5], [6, 9]]

        // Example 2: Overlap
        int[][] intervals2 = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval2 = {4, 8};
        int[][] result2 = solution.insert(intervals2, newInterval2);
        System.out.println("Example 2: Merged intervals: " + Arrays.deepToString(result2)); // Expected: [[1, 2], [3, 10], [12, 16]]
        
        // Example 3: Edge case - newInterval at the beginning
        int[][] intervals3 = {{3, 5}, {6, 8}};
        int[] newInterval3 = {1, 2};
        int[][] result3 = solution.insert(intervals3, newInterval3);
        System.out.println("Example 3: Merged intervals: " + Arrays.deepToString(result3)); // Expected: [[1, 2], [3, 5], [6, 8]]

        // Example 4: Edge case - newInterval at the end
        int[][] intervals4 = {{1, 2}, {3, 5}};
        int[] newInterval4 = {6, 7};
        int[][] result4 = solution.insert(intervals4, newInterval4);
        System.out.println("Example 4: Merged intervals: " + Arrays.deepToString(result4)); // Expected: [[1, 2], [3, 5], [6, 7]]
        
        // Example 5: Empty intervals array
        int[][] intervals5 = {};
        int[] newInterval5 = {5, 7};
        int[][] result5 = solution.insert(intervals5, newInterval5);
        System.out.println("Example 5: Merged intervals: " + Arrays.deepToString(result5)); // Expected: [[5, 7]]
    }
}
//O(NLogn)
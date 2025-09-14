class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>merged=new ArrayList<>();
        int[]prev=intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] interval=intervals[i];

            if(prev[1]>=interval[0]){
                prev[1]=Math.max(prev[1],interval[1]);
            }
            else{
                merged.add(prev);
                prev=interval;
            }
          
        } merged.add(prev);

        return merged.toArray(new int[merged.size()][]);

    }

    // MAIN METHOD
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] intervals = {
            {8, 10},
            {1, 3},
            {15, 18},
            {2, 6}
        };

        int[][] result = sol.merge(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

// 🔹 Final Time Complexity

// Sorting: O(n log n)

// Loop: O(n)

// Conversion: O(n
class Solution {
    public int hIndex(int[] citations) {

        Arrays.sort(citations);
        int n = citations.length;
        for(int i=0;i<n;i++){
            int h=n-i;
            if(h<=citations[i]){
                return h;
            }
        }return 0;
//The time complexity of this approach is O(n log n).------------sorting na..............
        
        // if(citations.length==1)return 0;
        // int h=citations[0];
        // int maxcount=1;
        // int currcount=1;
        // for(int i=1;i<citations.length;i++){
        //     if(h<=citations[i]){
        //         currcount++;
        //          maxcount= Math.min(h,currcount);

        //     }
        // }
     
        //     return maxcount;
    }
}
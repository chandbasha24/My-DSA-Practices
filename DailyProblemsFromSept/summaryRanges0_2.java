class Solution {
    public List<String> summaryRanges(int[] nums) {

         List<String> list = new ArrayList<>();
        if (nums.length == 0) return list;
        int i = 0;
        while(i < nums.length){
            int j = i;
            while(j + 1 < nums.length && nums[j + 1] == nums[j] + 1){
                j++;
            }
            if(i == j)
                list.add(String.valueOf(nums[i]));
            else
                list.add(nums[i] + "->" + nums[j]);
            i = j + 1;
        }
        return list;
        // List<String>str=new ArrayList<>();
        // Set<Integer> numbs=new HashSet<>();
        //  for(int num:nums)
        //  {
        //     numbs.add(num);
        //  }

        // for(int i=0;i<nums.length;i++){
        //     int start=nums[i];
        //     int end=nums[i];
        //     while(numbs.contains(end+1)){
        //         end=end+1;
        //         numbs.remove(end);
        //         i++;
        //     }
        //     if(start!=end && start>=Integer.MIN_VALUE &&end<=Integer.MAX_VALUE &&end>Integer.MIN_VALUE){
        //         str.add(String.valueOf(start+"->"+end));
        //     }else{
        //         str.add(String.valueOf(start));
        //     }
        // }return str;
    }
}
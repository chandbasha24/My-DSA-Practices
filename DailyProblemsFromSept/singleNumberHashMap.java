import java.util.*;
class Solution {
    public static int singleNumberHashMap(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(freq==1) return key;
            
        }return -1;
    }
    public static void main(String args[]){
        int arr[]={3,2,3,2,5,5,9};
        int result=singleNumberHashMap(arr);
        System.out.println(result);
    }
}
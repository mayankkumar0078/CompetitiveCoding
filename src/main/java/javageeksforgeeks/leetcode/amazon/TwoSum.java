package javageeksforgeeks.leetcode.amazon;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int []nums={2,7,11,15};
        int response [] =twoSum(nums,9);
        System.out.println(response[0]+" "+response[1]);

    }
    public static int[] twoSum(int[] nums, int target) {
        int response [] = new int[2];
        Map<Integer,Integer> numToIndexMap  = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            numToIndexMap.put(nums[i],i);
        }

        for (int i=0;i<nums.length;i++) {
            int diff = target-nums[i];
            if(numToIndexMap.containsKey(diff)) {
                int index = numToIndexMap.get(diff);
                response[0]=i;
                response[1] =index;
                return response;
            }
        }

        return response;
    }

}

package javageeksforgeeks.leetcode;

import java.util.*;

public class FourSum {

    public static void main(String[] args) {
        int [] nums = {1,0,-1,0,-2,2};
        List<List<Integer>> list =fourSum(nums,0);
        for (List<Integer> set: list) {
            for (int j=0;j<set.size();j++) {
                System.out.print(set.get(j)+" ");
            }
            System.out.println();
        }

    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],i);
        }
        boolean found = false;
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {

                for(int k=j+1;k<nums.length;k++) {


                    int remainingVal= target-(nums[i]+nums[j]+nums[k]);
                    if(map.containsKey(remainingVal) && map.get(remainingVal) !=i
                            && map.get(remainingVal) !=j && map.get(remainingVal) > k) {
                        ArrayList<Integer> innerList = new ArrayList<>();
                        innerList.add(nums[i]);
                        innerList.add(nums[j]);
                        innerList.add(nums[k]);
                        innerList.add(remainingVal);
                        list.add(innerList);
                        found = true;
                        break;

                    }
                }

            }
        }

        return list;

    }
}

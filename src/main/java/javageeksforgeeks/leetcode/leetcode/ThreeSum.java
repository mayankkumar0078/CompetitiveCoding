package javageeksforgeeks.leetcode.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {
    public static void main(String[] args) {
        //int [] nums = {-1, 0, 1, 2, -1, -4};
        //int [] nums = {0,0,0};
        //int [] nums ={-2,0,0,2,2};
        int [] nums ={-2,0,1,1,2};
        List<List<Integer>> list = threeSum(nums);
        for(List<Integer> l :list){
            for (Integer i :l){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list =new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        Map<Integer,Integer> map =new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++) {
            int left =0,right =nums.length-1;
            int remaining = 0-nums[i];

            while(left<right) {
                if(left==i) {
                    left++;
                    continue;
                }else if(right ==i) {
                    right--;
                    continue;
                }
                if(map.containsKey(left)){
                    left++;
                    continue;
                }
                if(map.containsKey(right)){
                    right--;
                    continue;
                }


                if(nums[left]+nums[right] ==remaining){
                    map.put(left,1);
                    map.put(right,1);
                    map.put(i,1);
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    break;
                }else if(nums[left]+nums[right] <remaining) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        return list;
    }
}

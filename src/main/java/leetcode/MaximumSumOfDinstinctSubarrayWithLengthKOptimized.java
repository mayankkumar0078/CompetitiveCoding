package leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MaximumSumOfDinstinctSubarrayWithLengthKOptimized {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = {1,5,4,2,9,9,9};
        int k= 3;
        System.out.println(maximumSubarraySum(arr,k));
    }

    public static long maximumSubarraySum(int [] nums,int k) {
        long sum =0;
        for (int i=0;i<nums.length-k+1;i++) {
            int tempK= k;
            Set<Integer> set = new HashSet<>();
            long tempSum = 0;
            set.add(nums[i]);
            set.add(nums[i+1]);
            set.add(nums[i+2]);
            tempSum = nums[i]+nums[i+1]+nums[i+2];
            //System.out.println(tempSum);
            //System.out.println(set);
            if(set.size() == k && tempSum > sum) {
                sum = tempSum;
            }
        }
        return sum;
    }
}

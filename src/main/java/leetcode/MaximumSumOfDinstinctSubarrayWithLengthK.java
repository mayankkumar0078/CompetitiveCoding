package leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:
 *
 * The length of the subarray is k, and
 * All the elements of the subarray are distinct.
 * Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,5,4,2,9,9,9], k = 3
 * Output: 15
 * Explanation: The subarrays of nums with length 3 are:
 * - [1,5,4] which meets the requirements and has a sum of 10.
 * - [5,4,2] which meets the requirements and has a sum of 11.
 * - [4,2,9] which meets the requirements and has a sum of 15.
 * - [2,9,9] which does not meet the requirements because the element 9 is repeated.
 * - [9,9,9] which does not meet the requirements because the element 9 is repeated.
 * We return 15 because it is the maximum subarray sum of all the subarrays that meet the conditions
 * Example 2:
 *
 * Input: nums = [4,4,4], k = 3
 * Output: 0
 * Explanation: The subarrays of nums with length 3 are:
 * - [4,4,4] which does not meet the requirements because the element 4 is repeated.
 * We return 0 because no subarrays meet the conditions.
 *
 */
public class MaximumSumOfDinstinctSubarrayWithLengthK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = {1,5,4,2,9,9,9};
        int k= 3;
        System.out.println(maximumSubarraySum(arr,k));
    }

    public static long maximumSubarraySum(int [] arr,int k) {
        long sum =0;
        for (int i=0;i<arr.length-k+1;i++) {
            Set<Integer> set = new HashSet<>();
            long tempSum = 0;
            for (int j=i;j<i+k;j++){
             set.add(arr[j]);
             tempSum = tempSum+arr[j];
            }
            System.out.println(tempSum);
            System.out.println(set);
            if(set.size() == k && tempSum > sum) {
                sum = tempSum;
            }
        }
        return sum;
    }
}

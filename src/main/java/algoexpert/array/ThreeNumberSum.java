package algoexpert.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *   Write a function that takes in a non-empty array of distinct integers and an
 *   integer representing a target sum. The function should find all triplets in
 *   the array that sum up to the target sum and return a two-dimensional array of
 *   all these triplets. The numbers in each triplet should be ordered in ascending
 *   order, and the triplets themselves should be ordered in ascending order with
 *   respect to the numbers they hold.
 * </p>
 * <p>
 *   If no three numbers sum up to the target sum, the function should return an
 *   empty array.
 * </p>
 *
 * Sample Input
 * <pre><span class="CodeEditor-promptParameter">array</span> = [12, 3, 1, 2, -6, 5, -8, 6]
 * <span class="CodeEditor-promptParameter">targetSum</span> = 0
 * </pre>
 *
 * Sample Output
 * <pre>[[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]
 * </pre>
 */


public class ThreeNumberSum {

    public static void main(String[] args) {
        int arr[] = {12,3,1,2,-6,5,-8,6};
        List<Integer[]> list =threeNumberSum(arr,0);

        System.out.println("test");
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> output = new ArrayList<>();
        Arrays.sort(array);
        int left =1,right =array.length-1;
        for (int i=0;i<array.length;i++) {
            left  = i+1;
            right =array.length-1;
            while (left<right) {
                int sum =array[i]+array[left]+array[right];
                if( sum== targetSum) {
                   Integer [] arr = {array[i],array[left],array[right]};
                   output.add(arr);
                   left++;
                   right--;
                } else if(sum > targetSum) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return output;
    }
}

package javageeksforgeeks.leetcode;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 *
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:
 * Only 1771 contains an even number of digits.
 *
 * 1 <= nums.length <= 500
 * 1 <= nums[i] <= 10^5
 */


public class FindNumEvenNumber {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int []nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){

            if(isEvenDigits(nums[i])) {
                count++;
            }
        }

        return count;
    }

    public static boolean isEvenDigits(int num) {
        if((num>=10 && num<=99) || (num>=1000 && num <=9999) || (num >=100000 && num <=999999)
        ||(num>=10000000 && num <=99999999) ||(num >=1000000000)) {
            return true;
        }
        return false;
    }
}

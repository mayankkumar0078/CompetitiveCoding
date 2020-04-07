package javageeksforgeeks.leetcode.leetcode;

public class RemoveElement {

    public static void main(String[] args) {
        int [] nums = {3,2,2,3};
        //int [] nums = {3,3};
        //int nums[] = {0,1,2,2,3,0,4,2};
        //int nums[] = {1};
        System.out.println(removeNum(nums, 3));
        System.out.println();
    }

    private static int removeNum(int[] nums, int val) {
        int j = nums.length - 1;
        int count = 0;
        for (int i = 0; i <= j;) {
            if (nums[i] == val) {
                if (nums[j] == nums[i]) {
                    j--;
                    continue;
                }
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--;


            }
            i++;
            count++;
        }
        return count;
    }
}

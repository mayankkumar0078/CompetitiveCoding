package javageeksforgeeks.leetcode.easy;

public class SearchInsert {

    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        //System.out.println(searchInsert(nums,5));

        int nums2[] = {1,3,5,6};
       // System.out.println(searchInsert(nums2,0));

        int nums3[] = {1,3};
        System.out.println(searchInsert(nums3,2));

    }
    public static int searchInsert(int[] nums, int target) {
        int start =0, end =nums.length-1;
        while(start <= end) {
            int mid = (start+end)/2;
            if(nums[mid] ==target) {
                return mid;
            }

            if((start == mid)) {
                if(target<nums[start]){
                    return start;
                }
            }
            if((end == mid)) {
                if(target>nums[end]){
                    return end+1;
                }
            }

            if(nums[mid]>target){
                end =mid-1;
            }else{
                start = mid+1;
            }
        }

        return Integer.MIN_VALUE;
    }
}

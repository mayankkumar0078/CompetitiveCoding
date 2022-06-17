package javageeksforgeeks.leetcode.easy;

public class RemoveDuplicatesFromSortedArray {

  public static void main(String[] args) {
    int []nums = {1,1,2};
    System.out.println(removeDuplicates(nums));
    System.out.println();
  }

  public static int removeDuplicates(int[] nums) {
    if(nums.length<=0) {
      return 0;
    }

    int count =1;
    int L=0,R;

    for(int i=1;i<nums.length;i++) {
      R=i;
      if(nums[L] == nums[R]) {
        continue;
      }
      nums[++L]= nums[R];
      count++;
    }

    return count;
  }

}

package javageeksforgeeks.grokking.algorithms;

public class SumArrayUsingRecursion {
    public static void main(String[] args) {
        int nums [] = {1,2,3,4,5};

        System.out.println(recursiveSum(nums,0));
    }

    private static int recursiveSum(int [] nums,int start) {
        if(start==nums.length){
            return 0;
        }
        return nums[start]+recursiveSum(nums,start+1);
    }
}

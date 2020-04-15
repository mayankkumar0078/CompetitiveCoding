package javageeksforgeeks.leetcode.easy;

public class MaximumSubarray {
    public static void main(String[] args) {
        //int [] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
       // int [] nums1 = {-2,1,-3,4,-10,-20,-10,-5,4};
        //int [] nums1 = {-2,1};
        int [] nums1 = {1,2};
        System.out.println(getMaxSubArrayDivideAndconcure(nums1));
    }


    public static int getMaxSubArrayDivideAndconcure(int nums[]){
        return maxSubArrayRecursive(nums,0,nums.length-1);
    }

    public static int maxSubArrayRecursive(int []nums,int start,int end) {
        if(start<end){
            int mid = (start+end)/2;

            int leftMax = maxSubArrayRecursive(nums,start,mid);
            int rightMax = maxSubArrayRecursive(nums,mid+1,end);
            int maxOverlappingSum = getMaxOverlappingSum(nums,start,mid,end);
            return Math.max(maxOverlappingSum,Math.max(leftMax,rightMax));
        }else{
            return nums[start];
        }
    }

    private static int getMaxOverlappingSum(int[] nums, int start, int mid, int end) {
        int leftMax = nums[mid];
        int leftSum = nums[mid];
        int rightMax = nums[mid+1];
        int rightSum = nums[mid+1];

        for(int i=mid-1;i>=start;i--) {
            leftSum+=nums[i];
            if(leftSum>leftMax) {
                leftMax = leftSum;
            }
        }

        for(int i=mid+2;i<=end;i++) {
            rightSum+=nums[i];
            if(rightSum>rightMax) {
                rightMax = rightSum;
            }
        }

        return leftMax+rightMax;
    }

    /**
     * maxSubArray with O(n) complexity
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int max =Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum = sum+nums[i];
            max = Math.max(max, sum);
            sum = Math.max(0,sum);
        }
        return max;
    }
    /*public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i< nums.length;i++) {
            int localMax = nums[i];
            int current =nums[i];
            for(int j=i+1;j<nums.length;j++) {
               current =current+nums[j];
               if(current >localMax) {
                   localMax =current;
               }
            }

            if(localMax >max) {
                max = localMax;
            }
        }
        return max;
    }*/
}

package leetcode;

public class SquareOfSortedArrayOptimized {

    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};

        int [] nums1 = {-7,-3,-1,2,3,11};
        int [] nums2 = {-20,-10,-9,-7,-3,-1};
        int [] nums3 = {1,3,7,9,10,20};
        int [] nums4 = {1};
        int [] nums5 = {0};
        int [] nums6 = {-2,0};
        int [] squaredNums = sortedSquares(nums6);
        for (int i=0;i<squaredNums.length;i++)
            System.out.println(squaredNums[i]);
    }

    public static int []  sortedSquares(int [] nums) {
       int i=0,j= nums.length-1,k=nums.length-1;
       int [] squaredNums = new int[nums.length];
       while (k>=0) {
           if(Math.abs(nums[i]) > Math.abs(nums[j])){
               squaredNums[k--] = nums[i]*nums[i];
               i++;
           }else {
               squaredNums[k--] = nums[j]*nums[j];
               j--;
           }
       }

       return squaredNums;
    }
}

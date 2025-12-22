package leetcode;

public class SquaresOfSortedArray {

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

    public static int[] sortedSquares(int[] nums) {
        int firstPositiveIndex = findLastNegativeIndex(nums,0,nums.length-1);
        int []squaredNums= new int[nums.length];
        if(firstPositiveIndex ==-1 && nums[nums.length-1]<0) {
            for (int i=nums.length-1,j=0;i>=0;i--,j++) {
                squaredNums[j] = nums[i]*nums[i];
            }
            return squaredNums;
        }

        if(firstPositiveIndex ==-1 && nums[nums.length-1]>=0) {
            for (int i=0;i<nums.length;i++) {
                squaredNums[i] = nums[i]*nums[i];
            }
            return squaredNums;
        }
        int i= firstPositiveIndex-1;
        int j= firstPositiveIndex;
        int k=0;
        while(k< nums.length) {
            //System.out.println(k);
            int negtiveSquare = nums[i]*nums[i];
            int positiveSquare = nums[j]*nums[j];
            if(negtiveSquare<=positiveSquare ) {
                squaredNums[k++] = negtiveSquare;
                i--;
            } else {
                squaredNums[k++] = positiveSquare;
                j++;
            }

            if(i==-1 || j== nums.length) {
                break;
            }
        }

        if(i==-1) {
            while(k<nums.length) {
                squaredNums[k++] = nums[j]*nums[j];
                j++;
            }
        }

        if(j== nums.length) {
            while(k<nums.length) {
                squaredNums[k++] = nums[i]*nums[i];
                i--;
            }
        }
        return squaredNums;
    }


    private static int  findLastNegativeIndex(int []nums,int start, int end) {
        if(start>=end ) {
            return -1;
        }
        int mid = (start+end)/2;
        //System.out.println(mid+  "   "+start+"   "+end);
        if(mid>=1 && nums[mid]>=0 && nums[mid-1] <0) {
            return mid;
        } else if(mid<nums.length-1 && mid>=0 && nums[mid+1]>=0 && nums[mid] <0) {
            return mid+1;
        } else if(mid<nums.length-1 && mid>=1  && nums[mid-1]<0 && nums[mid] <0 && nums[mid+1]<0) {
           return findLastNegativeIndex(nums,mid+1, end);
        } else {
           return findLastNegativeIndex(nums,start, mid-1);
        }

    }
}

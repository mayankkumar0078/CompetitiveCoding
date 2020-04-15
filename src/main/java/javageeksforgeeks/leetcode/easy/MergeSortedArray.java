package javageeksforgeeks.leetcode.easy;

public class MergeSortedArray {
    public static void main(String[] args) {
        //int [] nums1 ={1,2,3,0,0,0};
        //int nums2[] ={2,5,6};

        int [] nums1 ={2,0};
        int nums2[] ={1};
        merge(nums1,1,nums2,1);

        for(int i=0;i<nums1.length;i++){
            System.out.println(nums1[i]);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m==0 && n!=0){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
            return;
        }
        int i=m-1,j=n-1,current=nums1.length-1;

        while(i>=0 && j>=0) {
            if(nums1[i] >=nums2[j]) {
                nums1[current--] = nums1[i--];
            }else{
                nums1[current--] = nums2[j--];
            }
        }

        while(j>=0){
            nums1[current--]= nums2[j--];
        }
    }

    /*public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] mergedArray  = new int[m+n];

        if(n==0) {
           return ;
        }

        if(m==0 && n!=0){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
        }

        int i=0,j=0,k=0;
        while(i<m || j<n) {
            if(nums1[i] <= nums2[j] ) {
                mergedArray[k++] =nums1[i++];
            }else {
                mergedArray[k++] =nums2[j++];
            }

            if(i==m) {
                while(j<n) {
                    mergedArray[k++] = nums2[j++];
                }
                break;
            }

            if(j==n) {
                while(i<m) {
                    mergedArray[k++] = nums1[i++];
                }
            }


        }

        for(int l=0;l<m+n;l++){
            nums1[l] = mergedArray[l];
        }
    }*/
}

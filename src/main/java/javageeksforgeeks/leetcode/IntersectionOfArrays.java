package javageeksforgeeks.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IntersectionOfArrays {
    public static void main(String[] args) {

        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};

        int length = nums1.length<nums2.length?nums1.length:nums2.length;
        Map<Integer,Integer> secondArrayIndex= new HashMap<Integer, Integer>();
        int [] arr3 =new int[length];
        int count=0;

        for(int i=0;i<nums1.length;i++){
            boolean found = false;
            for(int j=0;j<nums2.length;j++) {
                if(nums1[i]==nums2[j]) {
                    if(secondArrayIndex.containsKey(j)){
                        continue;
                    }

                    arr3[count++]=nums1[i];
                    secondArrayIndex.put(j,1);
                    found=true;
                    break;
                }

            }
            if (found){
                continue;
            }
        }

        int finalArray[] = new int[count];
        for (int i=0;i<count;i++){
            finalArray[i] =arr3[i];
        }
        System.out.println();
    }

}

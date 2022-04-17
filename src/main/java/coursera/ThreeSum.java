package coursera;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        //int arr[] ={12, 3, 4, 1, 6, 9};
        int arr[] ={12, 3, 4, 1, 6, 9,11,15,25,100};
        printThreeSum(arr,24);
    }

    private static void printThreeSum(int arr[],int sum) {
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++) {
            int twoSum = sum - arr[i];
            int start=0, end =arr.length-1;
            boolean found = false;
            while(start < end) {
                if(start == i || end == i) {
                    start++;
                    continue;
                }
                int currentSum = arr[start]+arr[end];
                System.out.println("current sum "+currentSum+"  arr[i] "+arr[i]+"  i "+i);
                if(currentSum==twoSum) {
                    System.out.println( arr[i]+"  "+arr[start]+"   "+arr[end]);
                    found=true;
                    break;
                } else  if(currentSum<twoSum){
                    start++;
                } else {
                    end--;
                }
            }
            if(found) {
                break;
            }
        }
    }

}

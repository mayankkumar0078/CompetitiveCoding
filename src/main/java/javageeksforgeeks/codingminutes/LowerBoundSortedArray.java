package javageeksforgeeks.codingminutes;

public class LowerBoundSortedArray {
    public static void main(String[] args) {
        //int arr [] = {-1,-1,2,3,5};
        int arr [] = {1,2,3,4,6};
        System.out.println(lowerBoundSortedArray(arr,4));
    }

    private static int lowerBoundSortedArray(int [] arr, int val) {
        int start = 0, end = arr.length-1;
        while (start<= end) {
            int mid = (start+end)/2;
            if(arr[mid] == val && mid>0) {
                return arr[mid-1];
            }
            if(val> arr[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}

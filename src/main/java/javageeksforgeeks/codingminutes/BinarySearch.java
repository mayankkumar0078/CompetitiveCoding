package javageeksforgeeks.codingminutes;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {3,6,9,11,14,24,39,56};
        System.out.println(searchIterative(arr,1));
    }

    private static int searchIterative(int arr[],int key) {
        int start = 0, end = arr.length-1;

        while (start<=end) {
            int mid = (start +end)/2;
            if(arr[mid] == key) {
                return mid;
            } else if(key > arr[mid]){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        return -1;
    }
}

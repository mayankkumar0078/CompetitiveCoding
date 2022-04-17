package javageeksforgeeks.codingminutes;

public class KRotateArrayReversalAlgo {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        kRotate(arr,8);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void kRotate(int []arr,int k) {
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-k-1);
        reverse(arr,0, arr.length-1);

    }

    private static void reverse(int [] arr, int start,int end) {
        for (int i=start,j=end;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
        }
    }
}

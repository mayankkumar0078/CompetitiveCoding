package javageeksforgeeks.codingminutes;

public class KRotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        rotateByKPlaces(arr,4);

        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+"  ");
        }
    }

    private static void rotateByKPlaces(int [] arr, int k) {
        int temp[] = new int[k];
        for(int i=arr.length-k,j=0;i<arr.length;i++,j++) {
            temp[j]=arr[i];
        }

        for(int i=arr.length-k-1;i>=0;i--) {
            arr[i+k] = arr[i];
        }

        for (int i=0,j=0;i<temp.length;i++,j++) {
            arr[j] = temp[i];
        }
    }
}

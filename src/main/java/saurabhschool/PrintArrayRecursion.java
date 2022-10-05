package saurabhschool;

public class PrintArrayRecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        printArray(arr,0);
    }

    private static void printArray(int[] arr,int current) {
        if(current==arr.length) {
            return;
        }
        System.out.println(arr[current]);
        printArray(arr, current+1);
    }
}

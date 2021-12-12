package javageeksforgeeks.codingminutes;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(maxSubArraySum(arr));
    }

    public static long maxSubArraySum(int []arr) {
        long sum = 0l;
        for (int i = 0;i<arr.length;i++) {
            for (int j=i;j<arr.length;j++) {
                long currentSum = 0;
                for (int k=i;k<=j;k++) {
                    currentSum+=arr[k];
                }
                if(sum<currentSum) {
                    sum = currentSum;
                }
            }
        }
        return sum;
    }
}

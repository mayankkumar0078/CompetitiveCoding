package javageeksforgeeks.codingminutes;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int arr[] = {-1,2,-3,4,4,-2};
        System.out.println(maximumSubArraySumKadens(arr));
    }

    private static long maximumSubArraySumKadens(int arr[]) {
        long sum =0l;
        long currentSum = 0;
        for (int i=0;i<arr.length;i++) {
            currentSum+=arr[i];
            if(currentSum<0) {
                currentSum=0;
            }
            if(currentSum>sum) {
                sum = currentSum;
            }
        }

        return sum;
    }
}

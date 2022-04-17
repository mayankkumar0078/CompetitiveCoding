package javageeksforgeeks.codingminutes;

public class SumArraySumPrefixMethod {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(calculateMaxSubArrarySum(arr));
    }

    public static long calculateMaxSubArrarySum(int [] arr) {
        long sum =0l;
        int [] sumArray = new int[arr.length];
        sumArray[0] = arr[0];
        for (int i=1;i<arr.length;i++) {
            sumArray[i]= sumArray[i-1]+arr[i];
        }

        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length;j++) {
                long currentMax = i>0 ? sumArray[j]-sumArray[i] :sumArray[j];
                if(currentMax > sum) {
                    sum = currentMax;
                }

            }
        }
        return sum;
    }
}

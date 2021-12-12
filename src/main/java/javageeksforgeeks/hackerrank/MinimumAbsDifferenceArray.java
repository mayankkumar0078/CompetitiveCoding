package javageeksforgeeks.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAbsDifferenceArray {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-59, -36, -13, 1, -53, -92, -2, -96 ,-54 ,75);
        System.out.println(minimumAbsoluteDifference(arr));
    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        int minDiff = Integer.MAX_VALUE;
        Collections.sort(arr);
        for (int i=0;i<arr.size()-1;i++) {
            int diff = Math.abs(arr.get(i)-arr.get(i+1));
            if(diff<minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }
}

package javageeksforgeeks.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarcsCakewalk {
    public static void main(String []args) {
        System.out.println(marcsCakewalk(Arrays.asList(1,3,2)));
    }

    public static long marcsCakewalk(List<Integer> calorie) {
        Collections.sort(calorie);
        long maxSum = 0;
        int current = 0;

        for (int i=calorie.size()-1; i >= 0; i--) {
            maxSum += Math.pow(2.0,current++) * calorie.get(i);
        }

        return  maxSum;
    }

}

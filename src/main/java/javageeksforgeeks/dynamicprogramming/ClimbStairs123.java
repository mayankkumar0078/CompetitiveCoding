package javageeksforgeeks.dynamicprogramming;

import java.util.Scanner;

public class ClimbStairs123 {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        int stairsHeight = input.nextInt();
        System.out.println(getNumberOfWaysForClimbingStairs(stairsHeight));
    }

    private static long getNumberOfWaysForClimbingStairs(int n) {
        long []waysToReachN = new long[n+1];
        waysToReachN[1]=1;
        waysToReachN[2]=2;
        waysToReachN[3]=4;
        for(int i=3;i<=n;i++) {
            waysToReachN[i] =waysToReachN[i-1]+waysToReachN[i-2]+waysToReachN[i-3];
        }
        return waysToReachN[n];
    }
}

package javageeksforgeeks.dynamicprogramming;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        int stairsHeight = input.nextInt();
        System.out.println(getNumberOfWaysForClimbingStairs(stairsHeight));
    }

    private static long getNumberOfWaysForClimbingStairs(int n) {
        long []waysToReachN = new long[n+1];
        waysToReachN[1]=1;
        waysToReachN[2]=2;
        for(int i=3;i<=n;i++) {
            waysToReachN[i] =waysToReachN[i-1]+waysToReachN[i-2];
        }
        return waysToReachN[n];
    }
}

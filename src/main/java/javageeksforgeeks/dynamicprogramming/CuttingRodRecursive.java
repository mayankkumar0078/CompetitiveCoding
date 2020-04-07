package javageeksforgeeks.dynamicprogramming;

import java.util.Scanner;

public class CuttingRodRecursive {
    public static void main(String [] args) {

        int [] prices ={3,5,8,9,10,17,17,20};
        Scanner input =new Scanner(System.in);
        long current= System.currentTimeMillis();
        System.out.println();
        long revenue = revenue(input.nextInt(),prices);
        System.out.println(revenue);
        System.out.println(System.currentTimeMillis()-current);
    }

    private static long revenue(int n,int[] prices) {


        if(n==0)
            return 0;
        long maxVal=-1;
        for(int i=0;i<n;i++) {
            long temp= prices[i]+revenue(n-i-1,prices);
            if(temp>maxVal) {
                maxVal = temp;
            }
        }

        return maxVal;
    }
}

package javageeksforgeeks.dynamicprogramming;

import java.util.Scanner;

public class CuttingRodDynamicProgramming {
    public static void main(String [] args) {

        int [] prices ={3,5,8,9,10,17,17,20};
        Scanner input =new Scanner(System.in);

        long current= System.currentTimeMillis();

        long revenue = revenue(input.nextInt(),prices);

        System.out.println(revenue);
        System.out.println(System.currentTimeMillis()-current);
    }

    private static long revenue(int n,int[] prices) {
        long []maxValue= new long[n+1];
        maxValue[0]=0;
        for(int i=1;i<=n;i++) {
            long maxVal=-1;
            for(int j=0;j<i;j++) {
                long temp = prices[j] + maxValue[i-j-1];
                if (temp > maxVal) {
                    maxVal = temp;
                }
            }
            maxValue[i]=maxVal;
        }

        return maxValue[n];
    }
}

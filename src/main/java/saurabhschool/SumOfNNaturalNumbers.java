package saurabhschool;

import java.util.Scanner;

public class SumOfNNaturalNumbers {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(getSum(num));
    }

    private static long getSum(int n) {
        if(n==0) {
            return 0;
        }

        return n+getSum(n-1);
    }
}

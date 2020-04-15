package javageeksforgeeks.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(1234567899));
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
       // System.out.println(reverse(-2147483648));
    }

    private static int reverse(int x) {
       long reverseNum = 0;
       boolean positive =true;
       if(x <0) {
           positive = false;
           x = x*-1;
       }

       while(x>0){
           reverseNum =reverseNum*10+x%10;
           x=x/10;
       }

       if(!positive) {
           reverseNum = reverseNum*-1;
       }


       return (reverseNum>Integer.MAX_VALUE || reverseNum <Integer.MIN_VALUE)?0:(int)reverseNum;
    }
}

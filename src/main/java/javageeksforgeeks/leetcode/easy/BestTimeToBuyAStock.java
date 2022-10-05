package javageeksforgeeks.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BestTimeToBuyAStock {

  public static void main(String[] args) {
    //int [] prices ={2,4,1};
     int [] prices = {7,2,5,3,6,4,1,80};
    System.out.println(maxProfit(prices));
  }
  public static int maxProfit(int[] prices) {
    if(prices.length<=1) {
      return 0;
    }
    int L = 0;


    int maxProfit = 0;
    for (int i=1;i<prices.length ;i++) {
      int profit = prices[i] - prices[L];

      if( profit> 0) {
        if(profit>maxProfit) {
          maxProfit = profit;
        }
        continue;
      }
      L =i;
    }
    return maxProfit;
  }
}

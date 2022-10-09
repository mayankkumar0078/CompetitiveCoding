package algoexpert;

import java.util.Arrays;

/**
 *
 Given an array of positive integers representing the values of coins in your
 possession, write a function that returns the minimum amount of change (the
 minimum sum of money) that you cannot  create. The given coins can have
 any positive integer value and aren't necessarily unique (i.e., you can have
 multiple coins of the same value).

 <p>
 For example, if you're given <span>coins = [1, 2, 5]</span>, the minimum
 amount of change that you can't create is <span>4</span>. If you're given no
 coins, the minimum amount of change that you can't create is <span>1</span>.
 </p>

 Input= [5, 7, 1, 1, 2, 3, 22]
op: 20


 <div class="U1quNvMraAr3Hbq2JfVQ">
 <p>
 Create a variable to store the amount of change that you can currently create
 up to. Sort all of your coins, and loop through them in ascending order. At
 every iteration, compare the current coin to the amount of change that you can
 currently create up to. Here are the two scenarios that you'll encounter:
 </p>
 <ul>
 <li>
 The coin value is <b>greater</b> than the amount of change that you can
 currently create plus 1.
 </li>
 <li>
 The coin value is <b>smaller than or equal to</b> the amount of change that
 you can currently create plus 1.
 </li>
 </ul>
 <p>
 In the first scenario, you simply return the current amount of change that you
 can create plus 1, because you can't create that amount of change. In the
 second scenario, you add the value of the coin to the amount of change that
 you can currently create up to, and you continue iterating through the coins.
 </p>
 <p>
 The reason for this is that, if you're in the second scenario, you can create
 all of the values of change that you can currently create plus the value of
 the coin that you just considered. If you're given coins <span>[1, 2]</span>,
 then you can make <span>1, 2, 3</span> cents. So if you add a coin of value
 <span>4</span>, then you can make <span>4 + 1</span> cents,
 <span>4 + 2</span> cents, and <span>4 + 3</span> cents. Thus, you can make up
 to <span>7</span> cents.
 </p></div>
 */
public class NonConstructibleChange {

  public static void main(String[] args) {
    int [] arr = {5, 7, 1, 1, 2, 3, 22};
    System.out.println(nonConstructibleChange(arr));
  }

  public static int nonConstructibleChange(int[] coins) {

    Arrays.sort(coins);
    int sum = 0;

    for (int i=0;i<coins.length;i++) {
      if(coins[i] > sum+1) {
        break;
      }
      sum+=coins[i];
    }
    return sum+1;
  }
}

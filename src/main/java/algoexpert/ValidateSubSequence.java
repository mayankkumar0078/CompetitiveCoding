package algoexpert;

import java.util.Arrays;
import java.util.List;

/**
 Validate Subsequence
 Given two non-empty arrays of integers, write a function that determines
 whether the second array is a subsequence of the first one.


 A subsequence of an array is a set of numbers that aren't necessarily adjacent
 in the array but that are in the same order as they appear in the array. For
 instance, the numbers [1, 3, 4] form a subsequence of the array
[1, 2, 3, 4], and so do the numbers [2, 4]. Note
 that a single number in an array and the array itself are both valid
 subsequences of the array.

 array [5, 1, 22, 25, 6, -1, 8, 10]
 sequence = [1, 6, -1, 10]
 */

public class ValidateSubSequence {

  public static void main(String[] args) {

    System.out.println(isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10),Arrays.asList(1, 6, -1, 10)));
  }

  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int slow =0, fast =0;

    while(slow<sequence.size()) {
      if(sequence.get(slow) == array.get(fast) ) {
        slow++;
      }
      fast++;
    }
    return slow== sequence.size();
  }
}

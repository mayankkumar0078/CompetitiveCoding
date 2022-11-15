package algoexpert.array;

import java.util.Arrays;

/**
 * <p>
 *   Write a function that takes in two non-empty arrays of integers, finds the
 *   pair of numbers (one from each array) whose absolute difference is closest to
 *   zero, and returns an array containing these two numbers, with the number from
 *   the first array in the first position.
 * </p>
 *
 * <p>
 *   Note that the absolute difference of two integers is the distance between
 *   them on the real number line. For example, the absolute difference of -5 and 5
 *   is 10, and the absolute difference of -5 and -4 is 1.
 * </p>
 *
 * <p>
 *   You can assume that there will only be one pair of numbers with the smallest
 *   difference.
 * </p>
 *
 *
 * Sample Input:
 *
 * <pre><span class="CodeEditor-promptParameter">arrayOne</span> = [-1, 5, 10, 20, 28, 3]
 * <span class="CodeEditor-promptParameter">arrayTwo</span> = [26, 134, 135, 15, 17]
 * </pre>
 *
 *
 * <pre>[28, 26]</pre>
 */
public class SmallestDifference {
    public static void main(String[] args) {
        int[] arrayOne = {-1, 5, 10, 20,20, 28, 3,133};
        int[] arrayTwo = {26, 134, 135, 15, 17};
        smallestDifference(arrayOne,arrayTwo);
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int smallestDiff=Integer.MAX_VALUE, arrayOneNum=arrayOne[0],arrayTwoNum=arrayTwo[0];
        int currentDiff=Math.abs(arrayOne[0]-arrayTwo[0]), currentArrayOneNum=arrayOne[0],currentArrayTwoNum=arrayTwo[0];

        int i=0,j=0;
        while (i<arrayOne.length && j<arrayTwo.length) {
             currentDiff = Math.abs(arrayOne[i]-arrayTwo[j]);
             if(currentDiff<smallestDiff) {
                 smallestDiff = currentDiff;
                 arrayOneNum =arrayOne[i];
                 arrayTwoNum = arrayTwo[j];
             }

             if(arrayOne[i]<arrayTwo[j]) {
                 i++;
             } else {
                 j++;
             }
        }


        return new int[] {arrayOneNum,arrayTwoNum};
    }
}

package algoexpert.array;

/**
 * <div class="html">
 * <p>
 *   Write a function that takes in an array of integers and returns a boolean
 *   representing whether the array is monotonic.
 * </p>
 * <p>
 *   An array is said to be monotonic if its elements, from left to right, are
 *   entirely non-increasing or entirely non-decreasing.
 * </p>
 * <p>
 *   Non-increasing elements aren't necessarily exclusively decreasing; they simply
 *   don't increase. Similarly, non-decreasing elements aren't necessarily
 *   exclusively increasing; they simply don't decrease.
 * </p>
 * <p>Note that empty arrays and arrays of one element are monotonic.</p>
 * <h3>Sample Input</h3>
 * <pre><span class="CodeEditor-promptParameter">array</span> = [-1, -5, -10, -1100, -1100, -1101, -1102, -9001]
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>true
 * </pre>
 * </div>
 */
public class MonotonicArray {
    public static void main(String[] args) {
        int []array = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        //int []array = {-1, -5, -10, -1100, -1101, -1102, -9001};
        //int []array = {-1, -5, -10, -1100, -900, -1101, -1102, -9001};
        //int []array = {1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10, 11};
        System.out.println(isMonotonic(array));
    }

    public static boolean isMonotonic(int[] array) {
        if(array.length ==0 || array.length==1) {
            return true;
        }

        boolean increasing = true;
        boolean decreasing = true;
        for (int i=0;i<array.length-1;i++) {
            if(array[i] > array[i+1]) {
                increasing= false;
            }
        }

        for (int i=0;i<array.length-1;i++) {
            if(array[i] < array[i+1] ) {
                decreasing= false;
            }
        }

        return increasing || decreasing;
    }




}

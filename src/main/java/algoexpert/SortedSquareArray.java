package algoexpert;

/**
 *
 Write a function that takes in a non-empty array of integers that are sorted
 in ascending order and returns a new array of the same length with the squares
 of the original integers also sorted in ascending order.
 array   = [1, 2, 3, 5, 6, 8, 9]
 Output = [1, 4, 9, 25, 36, 64, 81]
 */
public class SortedSquareArray {

  public static void main(String[] args) {
    //int [] array = {1, 2, 3, 5, 6, 8, 9};
    int [] array = {-5,-3,1, 2, 6, 8, 9};
    //int [] array = {-3,-2,-1};
    int arr[] = sortedSquaredArray(array);
    System.out.println();
  }
  public static int[] sortedSquaredArray(int[] array) {
    int [] arr = new int[array.length];
    int currentLen=0;


    for (int i=0;i<array.length;i++) {
      int product = array[i] * array[i];
      int j = currentLen;
      while ( j>0 && arr[j-1] > product) {
        arr[j] = arr[j-1];
        j--;
      }
      arr[j] = product;
      currentLen++;
    }
    return arr;
  }

}

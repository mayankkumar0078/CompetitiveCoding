package algoexpert.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {

  public static void main(String[] args) {
    int [][]input =
        new int[][] {
            {1, 2, 3, 4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9, 8, 7},
        };
    spiralTraverse(input);
  }
  public static List<Integer> spiralTraverse(int[][] array) {
    int totalLength = array[0].length;
    int currentLength = totalLength;

    int totalHeight =  array.length;
    int currentHeight =  array.length;
    List<Integer> list = new ArrayList<Integer>();
    int i =0,j=0;
    while (i<currentLength) {
      list.add(array[j][i]);
      i++;
    }

    while (j< currentHeight) {
      list.add(array[j+1][i-1]);
      j++;
    }
    return list;
  }
}

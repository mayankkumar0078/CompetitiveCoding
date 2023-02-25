package algoexpert.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *   You're given an array of integers and an integer. Write a function that moves
 *   all instances of that integer in the array to the end of the array and returns
 *   the array.
 * </p>
 * <p>
 *   The function should perform this in place (i.e., it should mutate the input
 *   array) and doesn't need to maintain the order of the other integers.
 * </p>
 * <pre><span class="CodeEditor-promptParameter">array</span> = [2, 1, 2, 2, 2, 3, 4, 2]
 * <span class="CodeEditor-promptParameter">toMove</span> = 2
 * </pre>
 * <pre><span class="CodeEditor-promptParameter">array</span> = [2, 1, 2, 2, 2, 3, 4, 2]
 * <span class="CodeEditor-promptParameter">toMove</span> = 2
 * </pre>
 */
public class MoveElementToEnd {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2);
        moveElementToEnd(array,2);
        System.out.println();
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int start =0,end =array.size()-1;

        while (start<end) {
            if (array.get(start)==toMove) {
                while(end >0 && array.get(end) == toMove) {
                    end--;
                }
                if(end<=start) {
                    break;
                }
                int temp = array.get(start);
                array.set(start,array.get(end));
                array.set(end,temp);
                end--;
                start++;
            }else {
                start++;
            }
        }

        return array;
    }
}

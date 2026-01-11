package leetcode;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*int size = in.nextInt();
        int [] arr = new int[size];
        for (int i=0;i<size;i++) {
            arr[i] = in.nextInt();
        }*/

        int arr[] = {2,1,5,6,7,8,2,2,2,2,2,2,2,2,2,2,3};

        //int arr[] = {2,4};
        //int arr[] = {2,1,2};

        //int arr[] = {3,2,0,3,2,5};
        long area = findLargestRectangleOptimized(arr);
        System.out.println(area);
    }

    private static  long findLargestRectangle(int[] arr) {
        int maxArea = arr[0];

        for(int i=0;i<arr.length;i++ ){
            int lastMin = arr[i];
            for(int j=i+1;j<arr.length;j++) {
                 lastMin = Math.min(lastMin,arr[j]);
                 int currentArea = lastMin*( (j-i)+1);
                 if(maxArea<currentArea) {
                     maxArea = currentArea;
                 }
            }
        }
        return maxArea;

    }


    private static int findLargestRectangleOptimized(int[] heights) {


        Stack<Node> indexStack = new Stack<>();
        indexStack.push(new Node(heights[0],0));
        int maxArea = heights[0];
        for (int i=1;i<=heights.length;i++) {
            int currentHeight = i==heights.length? 0 :heights[i];
            int currentIndex=i;
            while(!indexStack.isEmpty() && currentHeight < indexStack.peek().height) {
                    Node node = indexStack.pop();
                    int topIndex = node.index;
                    int width = ((i - 1) - topIndex) + 1;
                    if(indexStack.isEmpty()) {
                        width = i;
                    }
                    int area = node.height * width;
                    if (area > maxArea) {
                        maxArea = area;
                    }
                    currentIndex = node.index;
                }

                indexStack.push(new Node(currentHeight,currentIndex));

        }
        return maxArea;
    }

    public static class Node {
        public Node(int height,int index) {
            this.height= height;
            this.index = index;
        }
        int height;
        int index;

    }
}

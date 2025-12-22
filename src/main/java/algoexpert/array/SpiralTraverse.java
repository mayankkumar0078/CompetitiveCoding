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

        List<Integer> op= spiralTraverse(input);
        System.out.println(op);
    }

    public static List<Integer> spiralTraverse(int[][] array) {
        int startX=0,startY=0, currentX =0, currentY=0,totalLength=array[0].length,totalHeight = array.length;
        List<Integer> list = new ArrayList<>();
        while(true) {
            while(currentX<totalLength){
                list.add(array[currentY][currentX]);
                currentX++;
            }
            currentY =currentY+1;
            currentX--;
            while(currentY<totalHeight){
                list.add(array[currentY][currentX]);
                currentY++;
            }
            currentX = currentX-1;
            currentY--;
            while (currentX>=startX) {
                list.add(array[currentY][currentX]);
                currentX--;
            }
            currentY =currentY-1;
            currentX++;
            while (currentY>startY) {
                list.add(array[currentY][currentX]);
                currentY--;
            }
            currentY++;

            startX = startX+1;
            startY = startY+1;
            currentX= startX;
            currentY= startY;
            totalLength--;
            totalHeight--;
            if(startX > (array[0].length/2) && startY> (array.length/2)) {
                break;
            }
        }


        return list;
    }
}

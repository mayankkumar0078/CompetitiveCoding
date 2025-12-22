package neetcode;

import java.util.*;

public class TopKFrequentElements {


    public static void main(String[] args) {

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int [] nums = {1,2,2,3,3,3};
        int [] nums1 = {7,7};

        int [] output = topKFrequent(nums1,1);

        for(int i=0;i<output.length;i++) {
            System.out.println(output[i]);
        }


    }

    public  static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> countByNumber = new HashMap<>();
        for (int num: nums) {
            if(countByNumber.containsKey(num)) {
                int count = countByNumber.get(num);
                count++;
                countByNumber.put(num,count);
            } else {
                countByNumber.put(num,1);
            }
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(countByNumber.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        int [] output = new int[k];
        for (int i=0;i<k;i++) {
            output[i] =list.get(i).getKey();
        }
        return output;
    }
}

package javageeksforgeeks.leetcode.amazon;

import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {
        String[] banned ={"hit"};
        String paragraph="Bob hit a ball, the hit BALL flew far after it was hit.";
        //String[] banned ={"bob","hit"};
        //String paragraph="Bob hIt BALl";
        System.out.println(mostCommonWord(paragraph,banned));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        String []tokens = paragraph.replaceAll("\\p{Punct}", " ").toLowerCase().split("\\s+");
        Set<String> bannedString = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for (String s:banned){
            bannedString.add(s);
        }
        String maxString = "";
        Map<String,Integer> tokenCountMap= new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (int i=0;i<tokens.length;i++) {
            int currentCount=tokenCountMap.getOrDefault(tokens[i],0);
            int maxCount=tokenCountMap.getOrDefault(maxString,-1);
            if(currentCount+1>maxCount && !bannedString.contains(tokens[i])){
                maxString=tokens[i];
                tokenCountMap.put(maxString,currentCount+1);
            }else if(!bannedString.contains(tokens[i])){
                tokenCountMap.put(tokens[i],currentCount+1);
            }
        }
        return maxString.toLowerCase();
    }
}

package neetcode;

import java.util.*;

public class GroupAnagrams {


    public static void main(String[] args) {
        String [] strs = {"act","pots","tops","cat","stop","hat"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        System.out.println(groupAnagrams.groupAnagrams(strs));
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groupedAnagrams = new HashMap<>();
        for (String str: strs) {
            char [] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String sortedString = String.valueOf(strArray);
            if(groupedAnagrams.containsKey(sortedString)) {
                groupedAnagrams.get(sortedString).add(str);
            } else {
                List<String> angramList = new ArrayList<>();
                angramList.add(str);
                groupedAnagrams.put(sortedString,angramList);
            }
        }
        return new ArrayList<>(groupedAnagrams.values());
    }
}

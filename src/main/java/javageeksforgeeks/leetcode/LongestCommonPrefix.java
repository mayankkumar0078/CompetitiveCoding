package javageeksforgeeks.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
      //  String [] strs = {"flower","flow","flight"};
        String [] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        int minLength= Integer.MAX_VALUE;
        for (int i=0;i<strs.length;i++) {
            if(strs[i].length()<minLength) {
                minLength = strs[i].length();
            }
        }
        StringBuilder stringBuilder = new StringBuilder("");
        if (minLength==0) {
            return stringBuilder.toString();
        }
        boolean needToBreak = false;
        for (int i=0;i<minLength;i++){
            char current = strs[0].charAt(i);
            for (int j=1;j<strs.length;j++) {
                if(strs[j].charAt(i)==current) {
                    continue;
                }else {
                    needToBreak = true;
                    break;
                }
            }

            if(needToBreak){
                break;
            }
            stringBuilder.append(current);
        }

        return stringBuilder.toString();
    }
}

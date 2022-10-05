package javageeksforgeeks.leetcode.amazon;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of strings words representing an English Dictionary, return the longest word in words that can be built one character at a time by other words in words.
 *
 * If there is more than one possible answer, return the longest word with the smallest lexicographical order. If there is no answer, return the empty string.
 */
public class LongestDictionaryWord {

  private static String maxVal= "";
  private static int maxLength = 0;

  public static void main(String[] args) {
    //String [] arr = {"w","wo","wor","worl","world", "a", "b", "c"};
    String [] arr = {"a","banana","app","appl","ap","apply","apple"};
    longestWord(arr);
    System.out.println(maxVal);
  }

  public static void longestWord(String[] words) {
    Set<String> wordsSet = new HashSet<>();
    for (String word: words) {
      wordsSet.add(word);
    }
    doGetLongestWord(wordsSet, "", 0);
  }

  private static void doGetLongestWord(Set<String> wordsSet ,String current,int c) {
    if(current.length() > maxLength) {
      maxLength = current.length();
      maxVal = current;
    }
    c=c+1;

    for (char i ='a'; i<='z';i++) {
      String cu =current;
      cu +=i;
      if(wordsSet.contains(cu)) {
        doGetLongestWord(wordsSet,cu,c);
      }
    }

  }
}


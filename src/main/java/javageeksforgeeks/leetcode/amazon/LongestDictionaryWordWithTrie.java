package javageeksforgeeks.leetcode.amazon;

import java.util.ArrayList;
import java.util.List;


/**
 * Given an array of strings words representing an English Dictionary, return the longest word in words that can be built one character at a time by other words in words.
 *
 * If there is more than one possible answer, return the longest word with the smallest lexicographical order. If there is no answer, return the empty string.
 */
public class LongestDictionaryWordWithTrie {


  static int max = Integer.MIN_VALUE;
  static List<String> list = new ArrayList<>();
  public static void main(String[] args) {

    String str [] = {"w","wo","wor","worl","world","banana","a","ap","app","appl","apple","apply","applb"};

    Trie trie = new Trie();

    for (String s:str) {
      trie.root.addWord(s);
    }

    traverseTrie(trie.root,0,"");

    System.out.println(max);

    System.out.println(trie);

  }


  private static void traverseTrie(TrieNode root,int count,String current) {
    if(count > max) {
      max = count;
      list = new ArrayList<>();
      list.add(current);
    }
    System.out.println(current);

    if(root == null) {
      return;
    }
    for (TrieNode child :root.children) {
      if(child != null && child.isWord) {
        String currentStr =current;
        currentStr += child.value;
        traverseTrie(child,count+1,currentStr);
      }

    }

  }


  public static class Trie {
    TrieNode root;

    public Trie() {
      root = new TrieNode('\0');
    }
  }

  public static class TrieNode {
    char value;
    TrieNode [] children;
    boolean isWord = false;

    public TrieNode (char value) {
      this.value =  value;
      this.children = new TrieNode[26];
    }

    public void addChild(char c) {
      TrieNode node = new TrieNode(c);
      if(this.children[c-'a'] !=null) {
        return;
      }

      this.children[c-'a'] = node;
    }

    public void addWord(String word) {
      char [] wordCharArray = word.toCharArray();
      TrieNode current = this;
      for (char c: wordCharArray) {
        if(current.children[c-'a'] != null) {
          current = current.children[c-'a'];
          continue;
        }
        TrieNode node = new TrieNode(c);
        current.children[c-'a'] = node;
        current = node;
      }
      current.isWord = true;
     }
  }
}

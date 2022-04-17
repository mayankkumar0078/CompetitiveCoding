package javageeksforgeeks.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

  public static void main(String[] args) {
    System.out.println(romanToInt("LVIII"));
  }


  public static int romanToInt(String s) {
    Map<Character,Integer> charToIntMap = new HashMap<>();
    charToIntMap.put('M',1000);
    charToIntMap.put('D',500);
    charToIntMap.put('C',100);
    charToIntMap.put('L',50);
    charToIntMap.put('X',10);
    charToIntMap.put('V',5);
    charToIntMap.put('I',1);
    charToIntMap.put('A',Integer.MAX_VALUE);

    char[] charArray = s.toCharArray();
    int num = 0;

    char previous='A';


    for (int i=0;i<charArray.length;i++) {
      if(charToIntMap.get(previous)<charToIntMap.get(charArray[i])) {
          num+=(charToIntMap.get(charArray[i])- 2*charToIntMap.get(previous));
          previous = 'A';
          continue;
      }
      num += charToIntMap.get(charArray[i]);
      previous = charArray[i];
    }

    return num;
  }
}

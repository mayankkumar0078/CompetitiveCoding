package codingminutes;

import java.util.Arrays;

public class ArePermutation {

  public static void main(String[] args) {
    System.out.println(arePermutation("test","ttew"));
  }

  public static boolean  arePermutation(String A, String B) {

    char [] Aarray = A.toCharArray();
    char [] Barray = B.toCharArray();

    Arrays.sort(Aarray);
    Arrays.sort(Barray);

    String s1 = new String(Aarray);
    String s2 = new String(Barray);
    if(s1.equals(s2)) {
      return true;
    }

    return false;
  }

}

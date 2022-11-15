package javageeksforgeeks.codingminutes;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(getFirstUniqueCharacter("inmgminutes"));
        //System.out.println(getFirstUniqueCharacter("aabb"));
    }


    public static int getFirstUniqueCharacter(String s) {

        char [] sChar = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<sChar.length;i++) {
           map.put(sChar[i],map.getOrDefault(sChar[i],0)+1);
        }
        for (int i=0;i<sChar.length;i++) {
            if(map.get(sChar[i])==1)
                return i;
        }

        return -1;
    }
}

package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StaircaseProblemWithDP {

    private static Map<Long,Long> map;
    public static void main(String[] args) {
        map= new HashMap<>();
        map.put(0l,1l);
        map.put(1l,1l);
        map.put(2l,2l);

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the input : ");
        Long input = in.nextLong();

        System.out.println(climb(input));

    }

    private static Long climb(Long input) {
        Long climbMinusOne=map.get(input-1),climbMinusTwo=map.get(input-2),climbMinusThree=map.get(input-3);

        Long value = (climbMinusOne!=null?climbMinusOne : climb(input-1)) + (climbMinusTwo!=null? climbMinusTwo: climb(input-2))+(climbMinusThree!=null? climbMinusThree: climb(input-3));
        map.put(input,value);
        return value;
    }
}

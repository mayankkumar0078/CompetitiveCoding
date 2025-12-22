package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class Fibonnacci {
    public static void main(String[] args) {
        System.out.println(fib(10,new HashMap<>()));
    }


    public static int fib(int n, Map<Integer,Integer> memoizatiomMap) {
        if(memoizatiomMap.containsKey(n)) {
            return memoizatiomMap.get(n);
        }

        if(n == 1) {
            return 1;
        }
        if(n == 0) {
            return 0;
        }

        int val = fib(n-1,memoizatiomMap) + fib(n-2,memoizatiomMap);
        memoizatiomMap.put(n,val);
        return val;
    }
}

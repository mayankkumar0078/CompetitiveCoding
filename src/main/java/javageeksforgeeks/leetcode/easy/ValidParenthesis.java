package javageeksforgeeks.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 * Input: s = "()"
 * Output: true
 *
 * Input: s = "()[]{}"
 * Output: true
 * Input: s = "(]"
 * Output: false
 *
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParenthesis {

    public static void main(String[] args) {
        //String s = "[{{()}]";
        //String s = "([)]";
        String s = "[";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Map<Character,Character> startingClosingBrackets = new HashMap<>();
        startingClosingBrackets.put('[',']');
        startingClosingBrackets.put('(',')');
        startingClosingBrackets.put('{','}');

        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            if(startingClosingBrackets.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            }else {
                Character current = null;
                if(!stack.isEmpty()) {
                     current = stack.pop();
                }else{
                    return false;
                }

                Character closingChar = startingClosingBrackets.get(current);
                if(closingChar.equals(s.charAt(i))) {
                    continue;
                }else {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;

    }
}

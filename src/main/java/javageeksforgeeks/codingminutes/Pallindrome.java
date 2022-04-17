package javageeksforgeeks.codingminutes;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(isPallindrome("madama"));
    }

    public static boolean isPallindrome(String str) {
        char [] charArray = str.toCharArray();
        int start = 0, end = charArray.length -1;
        while(start <= end) {
            if(charArray[start++] == charArray[end--]) {
                continue;
            }
            return false;
        }
        return true;
    }

    public int lengthOfLastWord(String s) {
        String [] stringArray = s.split(" ");
        return stringArray[stringArray.length-1].length();
    }
}

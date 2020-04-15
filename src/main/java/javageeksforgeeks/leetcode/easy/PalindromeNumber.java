package javageeksforgeeks.leetcode.easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1234321));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        char[] charArray = Integer.toString(x).toCharArray();

        int n = charArray.length;
        int mid = charArray.length / 2;
        for (int i = 0; i < mid; i++) {
            if (charArray[i] == charArray[n - 1 - i]) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
}

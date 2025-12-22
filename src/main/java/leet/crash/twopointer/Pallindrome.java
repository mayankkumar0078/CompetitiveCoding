package leet.crash.twopointer;

public class Pallindrome {


    public static void main(String[] args) {
        System.out.println(isPallindrome("abbaa"));
    }

    public static boolean isPallindrome(String str) {
        char [] strArray = str.toCharArray();
        int i= 0,j = strArray.length-1;
        while (i<=j) {
            if(strArray[i]!= strArray[j]) {
                return false;
            }

            i++;
            j--;
        }

        return true;

    }
}

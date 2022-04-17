package techiDelight;

//https://www.techiedelight.com/check-given-string-rotated-palindrome-not/


public class RotatedPallindrome {
    public static void main(String[] args) {
        String str= "ABCDCBA";
        System.out.println(isPallindrome(str,0,str.length()-1));
    }


    private static boolean isPallindrome(String str,int low,int high) {
        return (low>=high) || str.charAt(low)==str.charAt(high) && isPallindrome(str,low+1,high-1);
    }





}

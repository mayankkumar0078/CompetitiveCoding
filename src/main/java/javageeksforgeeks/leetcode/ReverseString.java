package javageeksforgeeks.leetcode;

public class ReverseString {
    public static void main(String[] args) {
        //String str = "Mayank";
        String str = "Mayanki";
        char [] array = str.toCharArray();
        reverseString(array);
        System.out.println();
    }
    public static void reverseString(char[] s) {
        int i=0,j=s.length-1;
        while(j>i){
            char temp = s[i];
            s[i]= s[j];
            s[j]=temp;
            j--;
            i++;
        }
    }
}

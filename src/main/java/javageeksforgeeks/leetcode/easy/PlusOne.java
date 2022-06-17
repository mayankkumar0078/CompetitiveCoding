package javageeksforgeeks.leetcode.easy;

public class PlusOne {

  public static void main(String[] args) {
    int []digits = {9};
    int [] newDigits =plusOne(digits);
    System.out.println(newDigits);
  }

  public static int[] plusOne(int[] digits) {
    int carry = 0;
    int sum = 0;
    for (int i=digits.length-1;i>=0;i--){

      if(i== digits.length-1) {
        sum  = digits[i]+1;
      } else {
        sum  = digits[i]+carry;
      }

      carry = 0;
      if(sum==10) {
        carry=1;
        digits[i] = 0;
        continue;
      }

      digits[i] = sum;
      if(carry == 0) {
        break;
      }
    }

    if(sum == 10) {
      int[] newDigits = new int[digits.length+1];
      newDigits[0]=1;
      for (int i=0,j=1;i<digits.length;i++){
        newDigits[j]=digits[i];
      }
      return newDigits;
    }

    return digits;
  }
}

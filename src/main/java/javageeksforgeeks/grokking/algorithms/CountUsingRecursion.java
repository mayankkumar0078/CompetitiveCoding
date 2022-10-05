package javageeksforgeeks.grokking.algorithms;

public class CountUsingRecursion {

  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7};
    System.out.println(count(arr,0));
  }

  private static int count(int[] arr,int start) {
    if(start==arr.length) {
      return 0;
    }
    return 1+count(arr,start+1);
  }
}

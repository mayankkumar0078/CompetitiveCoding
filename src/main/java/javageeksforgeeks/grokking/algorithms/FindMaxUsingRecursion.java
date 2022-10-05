package javageeksforgeeks.grokking.algorithms;

public class FindMaxUsingRecursion {

  public static void main(String[] args) {
    int arr[] = {1,60,3,4,5,6,7};
    System.out.println(findMax(arr,0));
  }

  private static int findMax(int []arr,int currentIndex) {
    if(currentIndex == arr.length-1) {
      return arr[currentIndex];
    }
    return Math.max(arr[currentIndex],findMax(arr,currentIndex+1));
  }
}

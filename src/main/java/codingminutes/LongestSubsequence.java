package codingminutes;

public class LongestSubsequence {

  public static void main(String[] args) {
    int [] arr = {1, 0, 0, 1, 0, 1, 0, 1, 0, 1};
    System.out.println(getLongestSubSequence(arr,2));
   }

  private static int getLongestSubSequence(int [] arr,int k) {
    int currentK = k;
    int max = 0;

    for (int i=0;i<arr.length;i++) {
      int count =0;
      currentK = k;
      if(arr[i]==0) {
        currentK--;
        count++;
      } else {
        count++;

      }

      for(int j=i+1;j<arr.length;j++) {
        if(currentK>0 && arr[j]==0) {
          currentK--;
          count++;
        } else if(currentK==0 && arr[j]==0){
          break;
        } else {
          count++;
        }
      }

      if(count >max) {
        max =count;
      }

    }
    return max;
  }
}

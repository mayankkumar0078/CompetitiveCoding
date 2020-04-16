package javageeksforgeeks.leetcode;

public class SubtractProdAndSum {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
    public static int subtractProductAndSum(int n) {
        String str = n+"";

        char[] array = str.toCharArray();
        int prod=1,sum=0;
        for(int i=0;i<array.length;i++){
            int num = Integer.parseInt(array[i]+"");
            prod *=num;
            sum+=num;
        }

        return prod-sum;
    }
}

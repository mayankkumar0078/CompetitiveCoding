package javageeksforgeeks.leetcode;

public class Solution {

    public static void main(String []args) {
        char arr[] ={'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        //char arr[]={'a','a','b','b','c','c','c'};
        System.out.println(compress(arr));;
        System.out.println();
    }
    public static int compress(char[] chars) {
        int []arr =new int[127];
        for(int i=0;i<chars.length;i++) {
            arr[chars[i]]++;
        }
        
        int sum =0;
        int j=0;
        for(int i=35;i<=126;i++) {
            if(arr[i]==0)
                continue;

            int num= arr[i];
            sum+=num;
            chars[j++]=(char)i;
            if(arr[i]==1){
                continue;
            }
            char [] nums= new char[4];
            int k=0;
            while (num>0) {
                nums[k++] =(char) (num%10+'0');
                num=num/10;
            }
            k--;

            while(k>=0){
                chars[j++]=nums[k--];
            }
        }
        return j;
    }
    
}
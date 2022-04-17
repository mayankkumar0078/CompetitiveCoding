package javageeksforgeeks.leetcode.easy;


/*
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l13 = new ListNode(3,null);
        ListNode l12 = new ListNode(4,l13);
        ListNode l1 = new ListNode(2,l12);

        ListNode l23 = new ListNode(4,null);
        ListNode l22 = new ListNode(6,l23);
        ListNode l2 = new ListNode(5,l22);

        ListNode result =addTwoNumbers(l1,l2);
        System.out.println();
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum=new ListNode(),currentSum;
        ListNode currentList1=l1,currentList2=l2;
        int i=0;
        int carry=0;
        while(currentList1!=null || currentList2 != null) {
            int s = 0;
            if(currentList1 != null && currentList2 !=null) {
                s= currentList1.val+currentList2.val+carry;

                if(i==0){
                    sum.val= s%10;
                    i++;
                } else {
                    currentSum = new ListNode(s%10,null);
                    sum.next=currentSum;
                }
                carry=s/10;

            }
            currentList1=currentList1.next;
            currentList2=currentList2.next;
        }
        return sum;
    }
}


 class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

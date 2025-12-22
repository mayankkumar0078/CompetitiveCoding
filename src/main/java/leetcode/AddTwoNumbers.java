package leetcode;

public class AddTwoNumbers {
/*

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 */
    public static void main(String[] args) {
         ListNode l1 = new ListNode(9);
         ListNode l11 = new ListNode(4);
         l1.next = l11;
        ListNode l12 = new ListNode(3);
        l11.next = l12;

         ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(6);
        l2.next = l21;
        ListNode l22 = new ListNode(4);
        l21.next = l22;

        ListNode result = addTwoNumbers(l1,l2);

        while (result !=null) {
            System.out.println(result.val);
            result = result.next;
        }
    }






    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode sumHead = null,currentSumNode=null;
        int carry = 0;
        while(l1 !=null || l2!= null) {

            int sumVal = 0;
            if(l1!=null && l2!=null) {
                sumVal = l1.val+l2.val+ carry;
                carry =0 ;
                if(sumVal>9) {
                    sumVal = sumVal%10;
                    carry = 1;

                }
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                sumVal = l1.val+ carry;
                carry =0 ;
                if(sumVal>9) {
                    sumVal = sumVal%10;
                    carry = 1;
                }
                l1 =l1.next;
            } else if (l2 !=null) {
                sumVal = l2.val+ carry;
                carry =0 ;
                if(sumVal>9) {
                    sumVal = sumVal%10;
                    carry = 1;
                }
                l2 =l2.next;
            }

            ListNode currentNode = new ListNode(sumVal);
            if(sumHead == null) {
                sumHead = currentNode;
                currentSumNode = currentNode;
            } else {
                currentSumNode.next = currentNode;
                currentSumNode = currentNode;
            }


        }

        return sumHead;
    }




    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}

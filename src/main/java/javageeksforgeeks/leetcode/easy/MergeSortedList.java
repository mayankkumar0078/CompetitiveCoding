package javageeksforgeeks.leetcode.easy;

/**
 * Merge two sorted linked lists and return it as a sorted list.
 * The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * <p>
 * Input: l1 = [1,2,4], l2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 */
public class MergeSortedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        l1.next=l12;
        l12.next=l13;

        ListNode l2 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l2.next=l22;
        l22.next=l23;

        ListNode node = mergeTwoLists(l1,l2);
        System.out.println(node);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode currentL1 = l1, currentL2 = l2;
        ListNode mergedListHead = null, mergedListCurrent=null,mergedListPrevious=null;
        int count = 0;
        while (currentL1 != null && currentL2 != null) {
            mergedListPrevious = mergedListCurrent;
            mergedListCurrent = new ListNode();
            if(mergedListPrevious!=null) {
                mergedListPrevious.next=mergedListCurrent;
            }

            if(currentL1.val<=currentL2.val) {
                mergedListCurrent.val = currentL1.val;
                currentL1 = currentL1.next;
            }else {
                mergedListCurrent.val=currentL2.val;
                currentL2=currentL2.next;
            }

            if(count==0){
                mergedListHead=mergedListCurrent;
                count++;
            }
        }
        if(currentL1 != null) {
            while(currentL1!=null) {
                mergedListPrevious = mergedListCurrent;
                mergedListCurrent = new ListNode();
                mergedListPrevious.next=mergedListCurrent;
                mergedListCurrent.val=currentL1.val;
                currentL1=currentL1.next;
            }
        }

        if(currentL2 != null) {
            while(currentL2!=null) {
                mergedListPrevious = mergedListCurrent;
                mergedListCurrent = new ListNode();
                mergedListPrevious.next=mergedListCurrent;
                mergedListCurrent.val=currentL2.val;
                currentL2=currentL2.next;
            }
        }
        return mergedListHead;
    }

    public static class ListNode {
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
}

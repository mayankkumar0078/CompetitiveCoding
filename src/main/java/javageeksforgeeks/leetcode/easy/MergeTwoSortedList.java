package javageeksforgeeks.leetcode.easy;

public class MergeTwoSortedList {

  public static void main(String[] args) {
    ListNode l1 = new ListNode();
    l1.val = 1;

    ListNode l2 = new ListNode();
    l2.val = 2;
    l1.next = l2;

    ListNode l3 = new ListNode();
    l3.val = 4;
    l2.next = l3;

    ListNode l4 = new ListNode();
    l4.val = 1;

    ListNode l5 = new ListNode();
    l5.val = 3;
    l4.next =l5;

    ListNode l6 = new ListNode();
    l6.val = 4;
    l5.next = l6;

    ListNode result = mergeTwoLists(l1,l4);
    System.out.println();

  }


  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode mergedList = null,mergedListCurrent = null,list1Current = list1,list2Current = list2;

    while (list1Current != null && list2Current != null) {
      ListNode temp =  new ListNode();
      if(mergedList == null) {
        mergedList = temp;
        mergedListCurrent =temp;
      } else {
        mergedListCurrent.next = temp;
        mergedListCurrent =temp;
      }
      if(list1Current.val <= list2Current.val) {
        mergedListCurrent.val = list1Current.val;
        list1Current = list1Current.next;
      } else {
        mergedListCurrent.val = list2Current.val;
        list2Current = list2Current.next;
      }
    }


    if(list1Current != null) {
      while(list1Current != null) {
        ListNode temp  = new ListNode();
        temp.val = list1Current.val;
        mergedListCurrent.next =temp;
        mergedListCurrent=temp;
        list1Current =list1Current.next;
      }
    }

    if(list2Current != null) {
      while(list2Current != null) {
        ListNode temp  = new ListNode();
        temp.val = list2Current.val;
        mergedListCurrent.next =temp;
        mergedListCurrent=temp;
        list2Current =list2Current.next;
      }
    }




    return mergedList;
  }
}

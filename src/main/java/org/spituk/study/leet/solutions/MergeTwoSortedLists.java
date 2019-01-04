package org.spituk.study.leet.solutions;

/**
 * Solution for Leet Code Question "Merge Two Sorted Lists".
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/24/2018
 */
public class MergeTwoSortedLists {

  public static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  /**
   *
   *
   * @param listNode1
   * @param listNode2
   * @return
   */
  public ListNode mergeTwoLists(ListNode listNode1, ListNode listNode2) {
    ListNode headNode = new ListNode(0);
    ListNode node = headNode;
    while (null != listNode1 && null != listNode2) {
      if (listNode1.val < listNode2.val) {
        node.next = listNode1;
        listNode1 = listNode1.next;
      } else {
        node.next = listNode2;
        listNode2 = listNode2.next;
      }
      node = node.next;
    }
    if (null != listNode1) {
      node.next = listNode1;
    }
    if (null != listNode2) {
      node.next = listNode2;
    }
    return headNode.next;
  }

  public static void main(String[] args) {
    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
    ListNode listNode1 = new ListNode(1);
    listNode1.next = new ListNode(3);
    listNode1.next.next = new ListNode(5);
    ListNode listNode2 = new ListNode(2);
    listNode2.next = new ListNode(4);
    listNode2.next.next = new ListNode(6);
    ListNode head = mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);
    while (head != null) {
      System.out.println(head.val);
      head = head.next;
    }
  }
}

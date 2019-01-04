package org.spituk.study.leet.solutions;

/**
 * Solution for Leet Code Question "Add Two Numbers".
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/23/2018
 */
public class AddTwoNumbers {

  public static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  /**
   * Traverse the two linked list till the end of the lists and sum the values of the nodes. Add
   * carry from the previous sum. Carry can be calculated as sum/10
   *
   * @return head ListNode for the sum
   */
  public ListNode addTwoNumbers(ListNode listNode1, ListNode listNode2) {
    ListNode currentNode = null;
    ListNode head = null;
    int carry = 0;
    while (listNode1 != null || listNode2 != null || carry != 0) {
      int value1 = 0;
      int value2 = 0;
      if (listNode1 != null) {
        value1 = listNode1.val;
        listNode1 = listNode1.next;
      }
      if (listNode2 != null) {
        value2 = listNode2.val;
        listNode2 = listNode2.next;
      }

      int sum = value1 + value2 + carry;
      carry = sum / 10;
      sum = sum % 10;

      if (head == null) {
        head = new ListNode(sum);
        currentNode = head;
      } else {
        currentNode.next = new ListNode(sum);
        currentNode = currentNode.next;
      }
    }
    return head;
  }

  public static void main(String[] args) {
    ListNode listNode1 = new ListNode(2);
    listNode1.next = new ListNode(4);
    listNode1.next.next = new ListNode(6);

    ListNode listNode2 = new ListNode(5);
    listNode2.next = new ListNode(6);
    listNode2.next.next = new ListNode(4);

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    ListNode sum = addTwoNumbers.addTwoNumbers(listNode1, listNode2);

    while (sum != null) {
      System.out.print(sum.val + " ");
      sum = sum.next;
    }
  }
}

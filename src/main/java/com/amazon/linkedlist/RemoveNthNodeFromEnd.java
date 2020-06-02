package com.amazon.linkedlist;
/**
 * Remove Nth Node From End of List
 * Solution
 * Given a linked list, remove the n-th node from the end of list and return its head.
 *
 * Example:
 *
 * Given linked list: 1->2->3->4->5, and n = 2.
 *
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 *
 * Given n will always be valid.
 *
 * Follow up:
 *
 * Could you do this in one pass?
 *
 *
 * */
public class RemoveNthNodeFromEnd {
  /**
   * Definition for singly-linked list.
   *
   */
  class Solution {

    /**
     * Get the length of the linked list
     * if length is 5 and remove 2 node from end means
     * remove 5-2 node from beginning.
     *
     * */
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode dummy = new ListNode(0);
      dummy.next = head;

      ListNode first = head;
      int length =0;
      while(first != null) {
        length++;
        first = first.next;
      }

      first = dummy;

      int indexOfElementTobeRemoved = length -n;

      while (indexOfElementTobeRemoved > 0  ) {
        first = first.next;
        indexOfElementTobeRemoved --;
      }

      first.next = first.next.next;
      return dummy.next;




    }
  }
}

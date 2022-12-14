/*
  Given the head of a singly linked list, reverse the list, and return the reversed list.
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 
public class Leetcode206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while(head != null){
            ListNode temp = head.next;
            head.next = prev;

            prev = head;
            head = temp;
        }

        return prev;
    }
}

/*
    Time complexity: O(n)

    Space complexity: O(1)
 */

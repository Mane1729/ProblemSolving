/*
  Given the head of a linked list and an integer val, remove all the nodes of the linked list 
  that has Node.val == val, and return the new head.
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

public class Leetcode203 {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }

        ListNode cur = head;
        while(cur != null){
            if(cur.next != null && cur.next.val == val){
                cur.next = cur.next.next;
            }
            else{
                cur = cur.next;
            }
        }

        return head;
    }
}

/*
    Time complexity: O(n)

    Space complexity: O(1)
 */

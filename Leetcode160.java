/*
  Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
  If the two linked lists have no intersection at all, return null.
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
public class Leetcode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // find length of A
        int lenA = 0;
        ListNode curA = headA;
        while(curA != null){
            lenA++;
            curA = curA.next;
        }
        // find length of B
        int lenB = 0;
        ListNode curB = headB;
        while(curB != null){
            lenB++;
            curB = curB.next;
        }

        // reduce (from the beginning) the larger one between A and B so that they have the same length
        while(lenA > lenB){
            headA = headA.next;
            lenA--;
        }
        while(lenB > lenA){
            headB = headB.next;
            lenB--;
        }

        // find the intersection node
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}

/*
    Time complexity: O(n)
    (assume A has length n and B has length m, then the complexity will be
     O(n + m + max(n, m)) = O(n))

    Space complexity: O(1)
 */

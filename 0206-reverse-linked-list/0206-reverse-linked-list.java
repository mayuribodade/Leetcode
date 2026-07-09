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
class Solution {
    public ListNode reverseList(ListNode head) {
        //initialise 3 nodes
        ListNode prev = null;
        ListNode curr =  head;
        ListNode next;

        while(curr!=null){
            next = curr.next;// upadate next first
            curr.next = prev; // reverse part (linking backward)
            prev = curr;
            curr = next;
        }
        return prev;//since prev points to head now
    }
}
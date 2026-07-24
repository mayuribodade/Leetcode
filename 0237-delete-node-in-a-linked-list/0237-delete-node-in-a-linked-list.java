/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        //list will looks like
        //4 1 1 9 now remove duplicate 1 from node place
        node.next = node.next.next; // 4 1 9
    }
}
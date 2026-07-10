/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

      if(head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                //slow ko head pe le jao
                slow = head;
                while(slow!=fast){
                    //ab dono ko 1-1 step chalao
                    slow = slow.next;
                    fast = fast.next;

                }
                 if(slow == fast){
                        return slow;
               }
            }
        }
        return null;
    }
}
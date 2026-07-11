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
    public ListNode rotateRight(ListNode head, int k) {
      if(k==0 || head == null || head.next == null){
        return head;
       }
      // at least ek node to rahega isliye l=1
       //find tail
       int l = 1;
       ListNode tail = head;
       while(tail.next!=null){
        tail = tail.next;
        l++;
       }//we get where tail is

       //firstly link our old tail to head 
       tail.next = head;
        
        int newK = k % l;
        int remainlen = l- newK;

        ListNode newTail = head;
        for(int i=1 ; i<remainlen ; i++){
            newTail = newTail.next;
        }
        //after loop termination we get newtail
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
        
    }
}
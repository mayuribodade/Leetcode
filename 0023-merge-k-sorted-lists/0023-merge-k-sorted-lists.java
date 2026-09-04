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
    public ListNode mergeKLists(ListNode[] lists) {
        //min heap using lists heads

      PriorityQueue< ListNode > pq = new PriorityQueue<>((a,b)-> a.val - b.val);

       for(ListNode  node : lists){
            if(node!=null)
                pq.offer(node);//it adds all heads of llist in ascending order
       }

      ListNode dummy = new  ListNode (0);
       ListNode  current = dummy;

       while(!pq.isEmpty()){
            ListNode  smaller = pq.poll();
           current.next = smaller;
           current = current.next;

           //see all lists
           if(smaller.next != null){
              pq.offer(smaller.next);//it adds ascendingly order
           }
       }
       return dummy.next;
    }
}
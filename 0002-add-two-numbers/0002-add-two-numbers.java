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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //dummy node
        ListNode res = new ListNode(0);
        ListNode ptr = res;

        int carry = 0;//set default carry

        while(l1!=null || l2!=null){
            int sum = 0 + carry;

            if(l1!=null){
                sum += l1.val;// make sum
                l1 = l1.next;//move pointer
            }
            if(l2!= null){
                sum += l2.val;
                l2 = l2.next;
            }
            //update every time sum and carry
            carry = sum/10;
            sum = sum%10;

            ptr.next  = new ListNode(sum);//assign sum node to list
            ptr = ptr.next;//move pointer
        }
        //in last if carry remains add it directly to list
        if(carry == 1){
            ptr.next  = new ListNode(1);
        }
        return res.next;//returning list after result node because it is dummy node
    }
}
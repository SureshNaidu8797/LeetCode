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
        ListNode NextNode=head;
        ListNode PrevNode=null;
        while(head!=null){
            NextNode=head.next;
            head.next=PrevNode;
            PrevNode=head;
            head=NextNode;
        }
        return PrevNode;
    }
}
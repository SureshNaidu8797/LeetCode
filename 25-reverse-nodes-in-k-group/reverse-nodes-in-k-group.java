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
   public ListNode reverseKGroup(ListNode head, int k) {

        ListNode preTail = null;        // stores the tail node of previous LL.
        ListNode curHead = head;        // stores the head node of current LL
        ListNode curTail = head;        // stores the tail node of current LL

        ListNode nextHead = null;       // stores the head node of next LL

        while(curHead != null)
        {
            int count = 1;
            while(curTail.next != null && count < k) {
                curTail = curTail.next;
                count++;
            }
            if(count != k)
                break;
            nextHead = curTail.next;
            curTail.next = null;
            if(preTail != null)
                preTail.next = null;
            curTail = reverseList(curHead);
            if(preTail != null)
                preTail.next = curTail;
            else
                head = curTail;
            curHead.next = nextHead;
            preTail = curHead;
            curHead = nextHead;
            curTail = nextHead;
        }
        return head;   
    }
}
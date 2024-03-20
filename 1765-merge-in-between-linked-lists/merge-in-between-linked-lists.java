/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode TrackListToA = list1;
        for (int i = 0; i < a - 1; i++)
            TrackListToA = TrackListToA.next;
        ListNode TrackListToB = TrackListToA;
        for(int i=0; i<b-a + 2; i++)
            TrackListToB = TrackListToB.next;
        TrackListToA.next=list2;
        while(TrackListToA.next!=null)
            TrackListToA = TrackListToA.next;
        TrackListToA.next=TrackListToB;
    return list1;
    }
}
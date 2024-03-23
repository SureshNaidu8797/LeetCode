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
    public void reorderList(ListNode head) {
        // Stack<Integer> st=new Stack<>();
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            // stack.push(temp.val);
            arr.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        int s=arr.size()-1;
        for(int i=0;i<s/2+1;i++){
            temp.val=arr.get(i);
            temp=temp.next;
            if(temp!=null){
            temp.val=arr.get(s-i);
            temp=temp.next;}
        }
        // temp=head;
        // while(temp!=null){
        // System.out.println(temp.val);
        // temp=temp.next;}
    }
}
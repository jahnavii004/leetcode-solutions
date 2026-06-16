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
    public int pairSum(ListNode head) {
        Stack<Integer> st=new Stack<>();
        int max = Integer.MIN_VALUE;
        ListNode fast= head, slow=head;
        while(fast != null){
            slow= slow.next;
            fast=fast.next.next;
        }
        while(slow != null){
            st.push(slow.val);
            slow=slow.next;
        }
        fast= head;
        while(!st.isEmpty()){
            int sum = st.pop() + fast.val;
            fast=fast.next;
            max=Math.max(sum,max);
        }
        return max;
    }
}
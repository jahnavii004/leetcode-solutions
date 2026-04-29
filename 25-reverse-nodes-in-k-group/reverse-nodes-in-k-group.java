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
    public ListNode reverseKGroup(ListNode head, int k) {
         Stack<ListNode> st=new Stack<>();
		        ListNode dummy = new ListNode();
		        ListNode temp=dummy;
		        ListNode start = head;
		        while(head != null) {
		        	//k node stack
		        	while(head != null && st.size()<k) {
		        		st.push(head);
		        		head= head.next;
		        	}
		        	if(k == st.size()) {
		        	while(!st.isEmpty()) {
		        		dummy.next = st.pop();
		        		dummy= dummy.next;
		        	}
		        	dummy.next=null;             //to prevent cycle
		        	}
		        	else {
		        		dummy.next = start;
		        	}
		        	start = head;
		        }
		        return temp.next;
    }
}
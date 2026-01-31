class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode dummy=new ListNode(-1);
        ListNode curr=dummy, temp1=list1 , temp2=list2 ;
        
        while(temp1 != null && temp2 !=null){
            if(temp1.val <= temp2.val ){
                curr.next=temp1;
                temp1=temp1.next;
            }
            else if(temp2.val < temp1.val ){
                curr.next=temp2;
                temp2=temp2.next;
            }
            curr=curr.next;
        }
        if(temp1 == null){
            curr.next=temp2;
        }
        else{
            curr.next=temp1;
        }
        return dummy.next;
    }
}

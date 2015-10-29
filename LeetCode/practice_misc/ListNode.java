package practice_misc;

import java.util.List;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { 
		val = x; 
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		int carry = 0;
		ListNode result = new ListNode(0);
		ListNode head = result;
		
		while(l1!=null && l2!=null){
			result.next = new ListNode((l1.val+l2.val+carry)%10);
			carry = (l1.val+l2.val+carry)/10;
			l1=l1.next;
			l2=l2.next;
			result = result.next;
		}
		
		while(l1!=null){
			result.next = new ListNode((l1.val+carry)%10);
			carry = (l1.val+carry)/10;
			l1=l1.next;
			result = result.next;			
		}	
			
		while(l2!=null){
			result.next = new ListNode((l2.val+carry)%10);
			carry = (l2.val+carry)/10;
			l2=l2.next;
			result = result.next;			
		}	

		if(carry==1){
			result.next = new ListNode(carry);
		}
		return head.next;
		
    }

}


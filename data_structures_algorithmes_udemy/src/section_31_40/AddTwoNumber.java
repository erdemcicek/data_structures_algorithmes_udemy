package section_31_40;

public class AddTwoNumber {
	
	
	
	private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		int carry = 0;
		
		ListNode head = null;
		
		while(l1 != null && l2 != null) {
			int sum = l1.val + l2.val + carry;
			ListNode n = new ListNode(sum%10);
			n.next = head;
			head = n;
			carry = sum/10;
			
			l1 = l1.next;
			l2 = l2.next;
		}
		
		while(l1 != null) {
			int sum = l1.val + carry;
			ListNode n = new ListNode(sum%10);
			n.next = head;
			head = n;
			carry = sum/10;
			
			l1 = l1.next;
		}
		
		while(l2 != null) {
			int sum = l2.val + carry;
			ListNode n = new ListNode(sum%10);
			n.next = head;
			head = n;
			carry = sum/10;
			
			l2 = l2.next;
		}
		
		if(carry>0) {
			ListNode n = new ListNode(carry);
			n.next = head;
			head = n;
		}
		
		// Reverse
		ListNode prev = null;
		ListNode curr = head;
		
		while(curr != null) {
			ListNode n = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = n;
		}
		
		head = prev;
		
		return head;
    }

}

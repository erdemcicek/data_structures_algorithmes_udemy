package section_31_40;

public class ReverseLinkedList {

	
	public static void main(String[] args) {
		
	}
	
	private static ListNode reverseListNode(ListNode head) {
		
		ListNode curr = head;
		ListNode prev = null;
		
		while(curr != null) {
			ListNode n = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = n;
		}
		
		return prev;
	}
}

//class ListNode11 {
//	 int val;
//	 ListNode11 next;
//	 ListNode11() {}
//	 ListNode11(int val) { this.val = val; }
//	 ListNode11(int val, ListNode11 next) { this.val = val; this.next = next; }
//}
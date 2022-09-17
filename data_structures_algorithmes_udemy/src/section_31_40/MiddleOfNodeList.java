package section_31_40;

public class MiddleOfNodeList {

	private static ListNode middleNode(ListNode head) {
		var slow = head;
		var fast = head.next;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(fast != null) {
			return slow.next;
		}
		
		return slow;
	}
}

//class ListNode13 {
//	 int val;
//	 ListNode13 next;
//	 ListNode13() {}
//	 ListNode13(int val) { this.val = val; }
//	 ListNode13(int val, ListNode13 next) { this.val = val; this.next = next; }
//}
package section41_50;

import section_31_40.ListNode;

public class CycleDetectionLinkedList {
	
	private static boolean hasCycle(ListNode head) {
		
		ListNode slow = head, fast = head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if(slow == fast) {
				return true;
			}
		}
		
        return false;
    }

}

package section41_50;

import section_31_40.ListNode;

public class PartitionList {
	
	public static void main(String[] args) {
		
	}
	
	private static ListNode partition(ListNode head, int x) {
        
		ListNode lessHead = null, lessTail = null, moreHead = null, moreTail = null;
		
		while(head != null) {
			
			if(head.val < x) {
				if(lessHead == null) {
					lessHead = head;
					lessTail = head;
				} else {
					// insert at tail
					lessTail.next = head;
					lessTail = head;
				}
			} else {
				if(moreHead == null) {
					moreHead = head;
					moreTail = head;
				} else {
					moreTail.next = head;
					moreTail = head;
				}
			}
			
			head = head.next;
		}
		
		if(lessHead != null && moreHead == null) {
			lessTail.next = null;
			return lessHead;
		} else if(lessHead == null && moreHead != null) {
			moreTail.next = null;
			return moreHead;
		} else if(lessHead != null && moreHead != null) {
			moreTail.next = null;
			lessTail.next = moreHead;
			return lessHead;
		}
		return null;
		
    }

}

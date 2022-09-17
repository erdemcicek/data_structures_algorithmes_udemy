package section_31_40;

public class RemoveNthNodeFromEnd {
	
	public static void main(String[] args) {
		
	}
	
	private static ListNode removeNthFromEnd(ListNode head, int n) { 
		
		var node2 = head;
		
		while(n>0) { 
			node2 = node2.next;
			n--;
		}
		
		var node1 = head;
		
		while(node2.next != null) {
			node2 = node2.next;
			node1 = node1.next;
		}
		
		node1.next = node1.next.next;
		
		return head;
	}

}


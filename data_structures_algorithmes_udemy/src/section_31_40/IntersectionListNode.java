package section_31_40;

public class IntersectionListNode {

	public static void main(String[] args) { // 1-2-3
											 // 4-2
		
	}
	
	private static ListNode22 getIntersection(ListNode22 headA, ListNode22 headB)  {
	
		if(headA == headB) return headA;
		int countA = 0, countB = 0;
	
		ListNode22 newNode = headA;
		
		while(newNode != null) {
			newNode = newNode.next;
			countA++; 
		}
		
		newNode = headB;
		
		while(newNode != null) {
			newNode = newNode.next;
			countB++;
		}
		
		int diff = Math.abs(countA-countB);
		int minLength = Math.min(countA, countB);
		
		if(countA>countB) {
			while(diff>0) {
				headA = headA.next;
				diff--;
			}
		} else if(countB>countA){
			while(diff>0) {
				headB = headB.next;
				diff--;
			}
		}
		
		while(minLength>0) {
			if(headA == headB) return headA;
			headA = headA.next;
			headB = headB.next;
		}
		
		
		return null;
	}
}


class ListNode22{
	
    int val;
    ListNode22 next;
    
    ListNode22(int x) {
        val = x;
        next = null;
    }
 }

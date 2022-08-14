package linkedlist_interview;

import java.util.HashMap;
import java.util.Map;

public class IntersectionOfList {
	
	static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
	}
	
	
	
	public static void main(String[] args) {
		ListNode n = new ListNode(1);
		n.next = new ListNode(2);
		n.next.next = new ListNode(3);
		n.next.next.next = new ListNode(4);
	}
	
	// 1. approach ==> Brute Force T = O(m*n) S = O(1)
	ListNode getIntersectionBrutForce(ListNode nodeA, ListNode nodeB) {
		
		while(nodeA != null) {
			ListNode head2 = nodeB;
			while(head2 != null) {
				if(nodeA == head2) {
					return nodeA;
				}
				head2 = head2.next;
			}
			nodeA = nodeA.next;
		}
		
		return null;
	}
	
	// 2. approach ==> Map
	ListNode getIntersectionWithHashMap(ListNode nodeA, ListNode nodeB) {
		Map<ListNode, Boolean> map = new HashMap<>();
		
		while(nodeB != null) {
			map.put(nodeB, true);
			nodeB = nodeB.next;
		}
		
		while(nodeA != null) {
			if(map.containsKey(nodeA)) {
				return nodeA;
			}
			nodeA = nodeA.next;
		}
		
		return null;
	}
	
	// 3. approach taking offset
	
	ListNode getIntersectionOffset(ListNode nodeA, ListNode nodeB) {
		
		int lenA = findLength(nodeA); 
		int lenB = findLength(nodeB);
		
		int diff = Math.abs(lenA-lenB);
		if(lenA > lenB) swap(nodeA, nodeB);
		
		for(int i = 0 ; i < diff ; i++) {
			nodeB = nodeB.next;
		}
		
		while(nodeA != null && nodeB != null) {
			if(nodeA == nodeB) return nodeA;
			
			nodeA = nodeA.next;
			nodeB = nodeB.next;
		}
		
		return null;
	}
	
	void swap(ListNode nodeA, ListNode nodeB) {
		ListNode tempNode = nodeA;
		nodeA = nodeB;
		nodeB = tempNode;
	}
	
	int findLength(ListNode head) {
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

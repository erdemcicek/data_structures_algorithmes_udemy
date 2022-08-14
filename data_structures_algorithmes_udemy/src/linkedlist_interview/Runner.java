package linkedlist_interview;

import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {
//		LinkedList ll = new LinkedList();
//		ll.createLL(1);
//		ll.insertNode(2);
//		ll.insertNode(3);
//		ll.insertNode(2);
//		ll.insertNode(5);
//		ll.insertNode(7);
//		ll.insertNode(4);
//		ll.traversalLL();
//		
//		Questions q = new Questions();
//		//q.deleteDuplicates(ll);
////		ll.traversalLL();
//		//System.out.println(q.nthToLast(ll, 8).value);
//		LinkedList partition = q.partition(ll, 3);
//		partition.traversalLL();
//		
//		LinkedList llA = new LinkedList(); // 617
//		llA.insertNode(7);
//		llA.insertNode(1);
//		llA.insertNode(6);
//		
//		
//		LinkedList llB = new LinkedList(); // 295
//		llB.insertNode(5);
//		//llB.insertNode(9);
//		//llB.insertNode(2);
//		
//		LinkedList resultLL = q.sumLists(llA, llB);
//		resultLL.traversalLL();
		
//		LinkedList llA = new LinkedList();
//		llA.insertNode(3);
//		llA.insertNode(1);
//		llA.insertNode(5);
//		llA.insertNode(9);
//		
//		LinkedList llB = new LinkedList();
//		llB.insertNode(1);
//		llB.insertNode(4);
//		llB.insertNode(9);
//		
//		q.addSameNode(llA, llB, 7);
//		q.addSameNode(llA, llB, 2);
//		q.addSameNode(llA, llB, 1);
//		
//		NodeMyself inter = q.findIntersection(llA, llB);
//		System.out.println(inter.value);
		
		Queue<Integer> q = new LinkedList<>();
		
		
		
	}
	
	static void printNthFromLast(Node head, int n){
	    int i = 0;
	  
	    if (head == null)
	        return;
	    printNthFromLast(head.next, n);
	  
	    if (++i == n)
	        System.out.print(head.value);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

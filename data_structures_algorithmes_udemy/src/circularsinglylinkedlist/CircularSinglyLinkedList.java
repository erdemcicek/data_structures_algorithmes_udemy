package circularsinglylinkedlist;

public class CircularSinglyLinkedList {

	Node head;
	Node tail;
	int size;
	
	Node createCSLL(int nodeValue) {
		Node node = new Node();
		node.value = nodeValue;
		node.next = node;
		head = node;
		tail = node;
		size = 1;
		return head;
	}
	
	void insertCSLL(int nodeValue, int location) {
		Node node = new Node();
		node.value = nodeValue;
		if(head == null) {
			createCSLL(nodeValue);
			return;
		}
		if(location == 0) {
			node.next = head;
			head = node;
			tail.next = head;
		} else if(location >= size) {
			tail.next = node;
			tail = node;
			tail.next = head;
		} else {
			Node tempNode = head;
			int index = 0;
			while(index < location - 1) { 	// ???????
				tempNode = tempNode.next;
				index++;
			}
			node.next = tempNode.next; 		// ???????
			tempNode.next = node;			// ???????
		}
		size++;
	}
	
	void traverseCSLL() {
		if(head != null) {
			Node tempNode = head;
			for(int i = 0 ; i < size ; i++) {
				System.out.print(tempNode.value);
				if(i != size-1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			}
			System.out.println("\n");
		} else {
			System.out.println("\nCSLL does not exist!");
		}
	}
	
	boolean searchNode(int nodeValue) {
		if(head != null) {
			Node tempNode = head;
			for(int i = 0 ; i < size ; i++) {
				if(tempNode.value == nodeValue) {
					System.out.print("Found node at location " + i);
					return true;
				}
				tempNode = tempNode.next;
			}
			System.out.println("Node not found! ");
			return false;
		}
		System.out.println("List does not exist yet");
		return false;
	}
	
	void deleteNode(int location) {
		if(head == null) {
			System.out.println("The CSLL does not exist!");
			return;
		}
		if(location == 0) {			// removes first node
			head = head.next;
			tail.next = head;
			size--;
			// if list contains just one node
			// we set all ref to null
			if(size == 0) {
				tail = null;
				head.next = null;
				head = null;
			}
		} else if(location >= size) { // removes last node
			Node tempNode = head;
			for(int i = 0 ; i < size - 1 ; i++) {
				tempNode =  tempNode.next;
			}
			// if tempNode is still pointing head object
			// that means that we have just one node in the list
			// to remove it, we set all ref to null
			if(tempNode == head) {
				head.next = null;
				tail = head = null;
				size--;
				return;
			}
	// notice the tempNode.next assignment difference:1 & 2
	// removing of last node and that of middle one
			tempNode.next = head; 				// assignment 1
			tail = tempNode;
			size--;
		} else {					  // removes in the middle
			Node tempNode = head;
			for(int i = 0 ; i < location - 1 ; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next; // assignment 2
			size--;
		}
		
	}
	void deleteCSLL() {
		if(head == null) {
			System.out.println("The CSLL does not exist!");
		} else {
			head = null;
			tail.next = null;
			tail = null;
			System.out.println("The CSLL has been deleted!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

class Node{
	int value;
	Node next;
}
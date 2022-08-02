package singlylinkedlist;

/* Node createSinglyLinkedList(int value)
 * void insertInLinkedList(int nodeValue, int location)
 * void traverseSinglyLinkedList()
 * boolean searchNode(int nodeValue)
 * void deletionOfNode(int location)
 * void deleteSLL()
 */

public class SinglyLinkedList {
	// Node => int value, Node next
	 Node head;
	 Node tail;
	 int size;
	 //
	Node createSinglyLinkedList(int nodeValue) {
		//head = new Node();
		Node node = new Node();
		node.next = null;
		node.value = nodeValue;
		head = node;
		tail = node;
		size = 1;
		return head;
	}
	void insertInLinkedList(int nodeValue, int location) {
		Node node = new Node();
		node.value = nodeValue;
		if(head == null) {
			createSinglyLinkedList(nodeValue);
			return;
		}
		if (location == 0) {
			node.next = head;
			head = node;
		} else if (location >= size) {
			node.next = null;
			tail.next = node; // ??????
			tail = node;
		} else {
			Node tempNode = head;
			int index = 0;
			while(index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			Node nextNode = tempNode.next;
			tempNode.next = node;
			node.next = nextNode;
		}
		size++;
	}
	void traverseSinglyLinkedList() {
		if(head == null) {
			System.out.println("SLL does not exist. Consider creating list first");
			return;
		}
		Node tempNode = head;
		for(int i = 0 ; i < size; i++) {
			System.out.print(tempNode.value);
			if(i != size - 1 ) {
				System.out.print(" -> ");
			}
			tempNode = tempNode.next;
		}
		System.out.println("\n");
		
	}
	boolean searchNode(int nodeValue) {
		if(head != null) {
			Node tempNode = head;
			for(int i = 0 ; i < size; i++) {
				if(tempNode.value == nodeValue) {
					System.out.print("Found the node at location " + i + "\n");
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		System.out.print("Node not found! ");
		return false;
	}
	void deletionOfNode(int location) {
		if (head == null) {
			System.out.println("The SSL does not exist");
			return;
		}
		if(location == 0) {
			head = head.next;
			size--;
			if(size == 0) {
				tail = null;
			}
		} else if(location >= size) {
			Node tempNode = head;
			for(int i = 0 ; i < size - 1 ; i++) {
				tempNode = tempNode.next;
			}
			if(tempNode == head) {
				tail = head = null;
				size--;
				return;
			}
			tempNode.next = null;
			tail = tempNode;
			size--;
		} else {
			Node tempNode = head;
			for(int i = 0 ; i < location - 1 ; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			size--;
		}
		
	}
	
	void deleteSLL() {
		head = null;
		tail = null;
		System.out.println("The SLL is deleted successfully");
	}
	
//	public String toString() {
//		return 
//	}

}

class Node{
	
	int value;
	Node next;
	
	public Node() {}
	
	public Node(int value) {this.value = value;}
	
	public String toString() {
		return new StringBuilder("Value: ")
				.append(value)
				.append("\nNext value: ")
				.append(next == null ? "not assigned": next.value)
				.toString();
	}
}

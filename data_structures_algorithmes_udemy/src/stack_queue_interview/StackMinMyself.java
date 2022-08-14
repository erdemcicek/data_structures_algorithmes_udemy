package stack_queue_interview;

public class StackMinMyself {
	
	NodeMyself head;
	NodeMyself tail;
	int min;
	
	public StackMinMyself(int nodeValue) {
		NodeMyself node = new NodeMyself();
		node.value = nodeValue;
		min = nodeValue;
		head.next = node;
		head = node;
		tail.prev = node;
		tail = node;
	}
	
	int min() {
		return min;
	}
	
	void push(int value) {
		NodeMyself node = new NodeMyself();
		node.value = value;
		if(value < min) {
			min = value;
		} 
		
		tail.next = node;
		tail = node;
	}
	
	int pop() {
		int last = tail.next.value;
		tail.prev.next = null;
		tail = tail.prev;
		return last;
	}

}

class NodeMyself{
	NodeMyself next;
	NodeMyself prev;
	int value;
}

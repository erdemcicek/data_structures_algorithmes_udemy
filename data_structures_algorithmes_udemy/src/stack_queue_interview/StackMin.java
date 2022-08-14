package stack_queue_interview;

public class StackMin {
	
	Node top;
	Node min;
	
	public StackMin() {
		top = null;
		min = null;
	}
	
	public static void main(String[] args) {
		StackMin stackmin = new StackMin();
		stackmin.push(3);
		stackmin.push(1);
		stackmin.push(8);
		
		System.out.println(stackmin.min());
	}
	
	int min() {
		return min.value;
	}
	
	void push(int value) {
		if(min == null) {
			min = new Node(value, min);
		} else if (min.value < value) {
			min = new Node(min.value, min);
		} else {
			min = new Node(value, min);
		}
		top = new Node(value, top);
	}
	
	int pop() {
		min = min.next;
		int result = top.value;
		top = top.next;
		return result;
	}

}

class Node{
	int value;
	Node next;
	
	Node(int value, Node next){
		this.value = value;
		this.next = next;
	}
}

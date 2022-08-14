package stack_queue_interview;

import java.util.Stack;

public class QueueViaStack {
	
	Stack<Integer> stackNewest, stackOldest;
	
	public QueueViaStack() {
		stackNewest = new Stack<>();
		stackOldest = new Stack<>();
	}
	
	public static void main(String[] args) {
//		QueueViaStack newQueue = new QueueViaStack();
//		newQueue.enqueue(1);
//		newQueue.enqueue(2);
//		newQueue.enqueue(3);
//		System.out.println(newQueue.dequeue());
//		newQueue.enqueue(4);
//		System.out.println(newQueue.dequeue());
		
	}
	
	
	int size() {
		return stackNewest.size() + stackOldest.size();
	}
	
	void enqueue(int value) {
		stackNewest.push(value);
	}
	
	private void shiftStacks() {
		if(stackOldest.isEmpty()) {
			while(!stackNewest.isEmpty()) {
				int poppedOut = stackNewest.pop();
				stackOldest.push(poppedOut);
			}
		}
	}
	
	int dequeue() {
		shiftStacks();
		return stackOldest.pop();
	}
	
	int peek() {
		shiftStacks();
		return stackOldest.peek();
	}
	
	

}

package stack_queue_interview;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class SetOfStack {
	
	ArrayList<Stack> stacks = new ArrayList<>();
	int capacity;
	
	public SetOfStack(int capacity) {
		this.capacity = capacity;
	}
	
	Stack getLastStack() {
		if(stacks.size() == 0) return null;
		int lastIndex = stacks.size()-1;
		return stacks.get(lastIndex);
	}
	
	void push(int value) {
		Stack last = getLastStack();
		if(last != null && !last.isFull()) {
			last.push(value);
		} else {
			Stack stack = new Stack(capacity);
			stack.push(value);
			stacks.add(stack);
		}
	}
	
	int pop() {
		Stack last = getLastStack();
		if(last == null) throw new EmptyStackException();
		int result = last.pop();
		if(last.size == 0) {
			int lastIndex = stacks.size()-1;
			stacks.remove(lastIndex);
		}
		return result;
	}
	
	// helper function --> leftShift
	int leftShift(int index, boolean removeTop) {
		Stack stack = stacks.get(index);
		int removedItem;
		if(removeTop) {
			removedItem = stack.pop();
		} else {
			removedItem = stack.removeBottom();
		}
		
		if(stack.size == 0) {
			stacks.remove(index);
		} else if(stacks.size() > index + 1) {
			int value = leftShift(index+1, false);
			stack.push(value);
		}
		
		return removedItem;
	}
	
	int popAt(int index) {
		return leftShift(index, true);
	}
	
	

	public static void main(String[] args) {
		SetOfStack newStack = new SetOfStack(3);
		newStack.push(1);
		newStack.push(2);
		newStack.push(3);
		newStack.push(4);
		newStack.push(5);
		System.out.println(newStack.popAt(0));
		System.out.println(newStack.popAt(0));
	}
	
}

class StackNode{
	StackNode above;
	StackNode below;
	int value;
	
	public StackNode(int value) {
		this.value = value;
	}
}

class Stack{
	int capacity;
	StackNode top;
	StackNode bottom;
	int size = 0;
	
	public Stack(int capacity) {
		this.capacity = capacity;
	}
	
	boolean isFull() {
		return capacity == size;
	}
	
	void join(StackNode above, StackNode below) {
		if(below != null) below.above = above;
		if(above != null) above.below = below;
	}
	
	boolean push(int value) {
		if(size >= capacity) return false;
		size++;
		StackNode node = new StackNode(value);
		if(size == 1) bottom = node;
		join(node, top);
		top = node;
		return true;
	}
	
	int pop() {
		if(top == null) throw new EmptyStackException();
		int result = top.value;
		top = top.below;
		size--;
		return result;
	}
	
	int removeBottom() {
		StackNode b = bottom;
		bottom = bottom.above;
		if(bottom != null) {
			bottom.below = null;
		}
		size--;
		return b.value;
		
	}
}

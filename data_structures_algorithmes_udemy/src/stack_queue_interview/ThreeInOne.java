package stack_queue_interview;

// Describe how you could use a single
// Array to implement three stacks
public class ThreeInOne {

	private int numberOfStacks = 3;
	private int stackCapacity;
	private int[] values;
	private int[] sizes;
	
	public static void main(String[] args) {
		ThreeInOne t = new ThreeInOne(3);
		t.push(0, 1);
		t.push(0, 2);
		t.push(1, 4);
		t.push(1, 5);
		t.push(2, 8);
		
		int result = t.pop(0);
		System.out.println(result);
		int result2 = t.peek(0);
		System.out.println(result2);
	}
	
	public ThreeInOne(int stackSize) {
		stackCapacity = stackSize;
		values = new int[stackSize * numberOfStacks];
		sizes = new int[numberOfStacks];
	}
	
	// isFull
	boolean isFull(int stackNum) {
		if(sizes[stackNum] == stackCapacity) {
			return true;
		}
		return false;
	}
	
	// isEmpty
	boolean isEmpty(int stackNum) {
		if(sizes[stackNum] == 0) {
			return true;
		}
		return false;
	}
	
	// indexOfTop
	int indexOfTop(int stackNum) {
		int offset = stackNum * stackCapacity;
		int size = sizes[stackNum];
		return offset + size - 1;
	}
	
	// push
	void push(int stackNum, int value) {
		if(isFull(stackNum)) {
			System.out.println("The Stack is full");
		} else {
			sizes[stackNum]++;
			values[indexOfTop(stackNum)] = value;
			
		}
	}
	
	// pop
	int pop(int stackNum) {
		if(isEmpty(stackNum)) {
			System.out.println("The Stack is Empty");
			return -1;
		} else {
			int topIndex = indexOfTop(stackNum);
			int value = values[topIndex];
			values[topIndex] = 0;
			sizes[stackNum]--;
			return value;
		}
		
	}
	
	int peek(int stackNum) {
		if(isEmpty(stackNum)) {
			System.out.println("The Stack is Empty");
			return -1;
		} 
		return values[indexOfTop(stackNum)];
	}
	
}


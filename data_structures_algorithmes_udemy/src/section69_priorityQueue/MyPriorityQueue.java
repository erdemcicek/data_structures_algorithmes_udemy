package section69_priorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyPriorityQueue {

	List<Integer> pq = new ArrayList<>();
	public MyPriorityQueue() {
		
	}
	
	boolean isEmpty() {
		return pq.size() == 0;
	}
	
	int getSize() {
		return pq.size();
	}
	
	int getMin() {
		return isEmpty() ?  0 : pq.get(0) ;
	}
	
	void insert(int element) {
		pq.add(element); // CBT ok, Heap not satisfied
		int childIndex = pq.size() - 1;
		
		while(childIndex > 0) {
			int parentIndex = (childIndex-1) / 2;
			if(pq.get(childIndex) < pq.get(parentIndex)) {
				Collections.swap(pq, childIndex, parentIndex);
				childIndex = parentIndex;
			} else {
				break;
			}
		}
		
	}
	
	int removeMin() {
		if(isEmpty()) {
			return 0;
		}
		int ans = pq.get(0);
		Collections.swap(pq, 0, getSize()-1);
		pq.remove(getSize()-1);
		
		// CBT ok, Heap NOT
		// Down Heapify
		
		int parentIndex = 0;
		while(true) {
			int leftChildIndex = 2 * parentIndex + 1;
			int rightChildIndex = 2 * parentIndex + 2;
			int minIndex = parentIndex;
			
			if(leftChildIndex < pq.size() && pq.get(leftChildIndex) < pq.get(minIndex)) {
				minIndex = leftChildIndex;
			}
			if(rightChildIndex < pq.size() && pq.get(rightChildIndex) < pq.get(minIndex)) {
				minIndex = rightChildIndex;
			}
			if(minIndex == parentIndex) {
				break;
			}
			Collections.swap(pq, parentIndex, minIndex);
			parentIndex = minIndex;
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		MyPriorityQueue p = new MyPriorityQueue();
		p.insert(100);
		p.insert(10);
		p.insert(15);
		p.insert(4);
		p.insert(17);
		p.insert(21);
		p.insert(67);
		
		System.out.println("Size : " + p.getSize());
		System.out.println("Current min : " + p.getMin());
		
		while(!p.isEmpty()) {
			System.out.print(p.removeMin() + " ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

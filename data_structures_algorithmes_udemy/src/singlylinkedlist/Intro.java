package singlylinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/*
 * Singly Linked List
 * Circular Singly Linked List
 * Doubly Linked List
 * Circular Doubly Linked List
 */

public class Intro {
	
	static List<Integer> linkedList = new LinkedList<>(List.of(2, 4, 6));
	static List<Integer> arrList = new ArrayList<>();
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		callListMethod(linkedList);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
	}
	
	static void callListMethod(List<Integer> list) {
		IntStream.rangeClosed(1, 100).forEach(list::add);
		System.out.println(list.get(72));
		System.out.println(list);
	}

}

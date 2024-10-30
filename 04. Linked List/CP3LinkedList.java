import java.util.NoSuchElementException;
//Lab 2 - Writing Linked List code

/**
 A linked list is a sequence of links with efficient
 element insertion and removal. This class
 contains a subset of the methods of the standard
 java.util.LinkedList class.
 */

public class CP3LinkedList<E> {
	private class Node {
		public E data;
		public Node next;
		public Node prev;  // For Question 5: doubly-linked list
	}
	private Node first;
	private Node last;    // For Question 4: queue implementation

	/**
	 Constructs an empty linked list.
	 */
	public CP3LinkedList()
	{
		first = null;
		last = null;
	}

	/**
	 Adds an element to the front of the linked list.
	 @param element the element to add
	 */
	public void addFirst(E element)
	{
		Node newLink = new Node();
		newLink.data = element;
		newLink.next = first;
		first = newLink;
	}
	// Question 4: Queue implementation
	public void addLast(E element) {
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = null;
		newNode.prev = last;

		if (last != null) {
			last.next = newNode;
		}
		last = newNode;

		if (first == null) {
			first = newNode;
		}
	}
	public E getFirst() {
		if (first == null)
			throw new NoSuchElementException();
		return first.data;
	}

	public E removeFirst() {
		if (first == null)
			throw new NoSuchElementException();
		E element = first.data;
		first = first.next;
		return element;
	}

	// Question 1: Size method
	public int size() {
		int count = 0;
		Node current = first;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	// Question 2: Contains method
	public boolean contains(E element) {
		Node current = first;
		while (current != null) {
			if (current.data != null && current.data.equals(element)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	public void print(){
		//outputs the data on the list
		Node current = first;
		while (current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}
}
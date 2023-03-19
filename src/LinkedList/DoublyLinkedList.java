package LinkedList;

public class DoublyLinkedList<T> {

	// Node inner class for DLL
	public class Node {
		public T data;
		public Node nextNode;
		public Node prevNode;
	}

	public Node headNode;
	public int size;

	public DoublyLinkedList() {
		this.headNode = null;
	}

	// checks if the list is empty
	public boolean isEmpty() {
		if (headNode == null)
			return true; // is empty
		return false; // is not empty
	}

	public void printList() {
		if (isEmpty()) {
			System.out.println("List is Empty!");
			return;
		}

		Node temp = headNode;
		System.out.print("List : null <- ");

		while (temp.nextNode != null) {
			System.out.print(temp.data.toString() + " <-> ");
			temp = temp.nextNode;
		}

		System.out.println(temp.data.toString() + " -> null");
	}

	public int length() {
		int count = 0;
		if (isEmpty()) {
			return 0;
		}
		Node currentNode = this.headNode;
		while (currentNode != null) {
			currentNode = currentNode.nextNode;
			count++;
		}
		return count;
	}

	public void insertAtHead(T data) {
		// create node and put in the data
		Node newNode = new Node();
		newNode.data = data;
		// Make next of new node as head and previous as NULL
		newNode.nextNode = this.headNode;
		newNode.prevNode = null;
		// Change previous of head node to new node
		if (headNode != null)
			headNode.prevNode = newNode;
		this.headNode = newNode;
		size++;
	}

	// Returns last node
	public Node getTailNode() {
		Node tail = this.headNode;
		while (tail.nextNode != null) {
			tail = tail.nextNode;
		}
		return tail;
	}

}
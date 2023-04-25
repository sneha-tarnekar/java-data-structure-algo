package Queue;

public class QueueUsingLinkedList {
	private Node front;
	private Node rear;
	
	public boolean isEmpty() {
		return front == null;
	}
	
	//insert elements(new Node) at rear
	void enqueue(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			front = rear = newNode;
			return;
		}
		rear.nextNode = newNode;
		rear = newNode;
	}
	
	int dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		int result = front.data;
		front = front.nextNode;
		return result;
	}
}

class Node {
	public int data;
	public Node nextNode;
	
	public Node(int data) {
		this.data = data;
	}
}
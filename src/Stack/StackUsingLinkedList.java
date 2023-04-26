package Stack;

public class StackUsingLinkedList {
	
	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(5);
		stack.push(3);
		stack.push(7);
		stack.push(1);
		while(!stack.isEmpty()) {
			System.out.println(stack.peak());
			stack.pop();
		}		
	}

	Node head;
	int size;

	public StackUsingLinkedList() {
		head = null;
		size = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void push(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.nextNode = head;
		size++;
		head = temp;
	}

	public int peak() {
		if (isEmpty()) {
			throw new RuntimeException("Stack underflow");
		}
		return head.data;
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack underflow");
		}
		int response = head.data;
		head = head.nextNode;
		size--;
		return response;
	}

	public int size() {
		return size;
	}

}

class Node {
	public int data;
	public Node nextNode;
}

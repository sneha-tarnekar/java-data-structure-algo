package Queue;

import Stack.Stack;

public class QueueUsingStack<V> {
	Stack<V> stack1;
	Stack<V> stack2;
	
	public QueueUsingStack(int size) {
		stack1 = new Stack<V>(size);
		stack2 = new Stack<V>(size);
	}
	
	public boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}
	
	public void enqueue(V data) {
		stack1.push(data);
	}
	
	public V dequeue() {
		if(isEmpty()) {
			return null;
		} else if(stack2.isEmpty()) {
			// put all stack1 elements into stack2
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			return stack2.pop();
		} else {
			return stack2.pop();
		}
	}

	public static void main(String[] args) {		
		QueueUsingStack<Integer> queue = new QueueUsingStack<Integer>(5);
		
		queue.enqueue(9);
		queue.enqueue(6);
		queue.enqueue(4);
		queue.enqueue(7);
		queue.enqueue(8);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}

	}

}

package Stack;

public class Stack<V> {
	private int maxSize;
	private int top;
	private V array[];

	/*
	 * Java does not allow generic type arrays. So we have used an array of
	 * Object type and type-casted it to the generic type V. This type-casting
	 * is unsafe and produces a warning.
	 */
	@SuppressWarnings("unchecked")
	public Stack(int max_size) {
		this.maxSize = max_size;
		this.top = -1;
		array = (V[]) new Object[max_size];
	}

	public int getCapacity() {
		return maxSize;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize-1;
	}
	
	public V top() {
		if(isEmpty())
			return null;
		return array[top];
	}
	
	public void push(V value) {
		if(isFull()){
			System.out.println("Stack is Full!");
			return;
		}
		array[++top] = value;
	}
	
	public V pop() {
		if(isEmpty()) {
			return null;
		}
		return array[top--];
	}

}

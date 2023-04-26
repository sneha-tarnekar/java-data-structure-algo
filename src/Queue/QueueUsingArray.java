 package Queue;

// Time Complexity:
//	 dqueue --> O(n)
//	 enqueue --> O(1)
 
public class QueueUsingArray<V> {
	V[] arr;
	int capacity;
	int rear;
	
    @SuppressWarnings("unchecked")
	public QueueUsingArray(int n) {
		capacity = n;
		arr = (V[]) new Object[capacity];
		rear = -1;
	}
	
	public boolean isFull() {
		return rear == capacity-1;
	}
	
	public boolean isEmpty() {
		return rear == -1;
	}
	
	public void enqueue(V data) {
		if(isFull()) {
			throw new RuntimeException("Queue is full.");
		}
		rear++;
		arr[rear] = data;
	}
	
	public V dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty.");
		}
		V result = arr[0];
		for(int i=0; i<rear; i++) {
			arr[i] = arr[i+1];
		}
		rear--;
		return result;
	}
	
}

package LinkedList;

public class NthElementFromEnd {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.insertAtHead(8);
		list.insertAtHead(7);
		list.insertAtHead(5);
		list.insertAtHead(6);
		list.insertAtHead(3);
		System.out.print("List : ");
		list.printList();
		Object result = nthElementFromEnd(list, 2);
		System.out.println("Result Element : " + result);
	}
	
	public static <T> Object nthElementFromEnd(SinglyLinkedList<T> list, int n) {
		int size = list.length();
        n = size - n + 1; //we can use the size variable to calculate distance from start
        if (size == 0 || n > size) {
            return null; //returns null if list is empty or n is greater than size
        }
        SinglyLinkedList<T>.Node current = list.headNode;
        int nodeIndex = 1;
        while(current != null) {
            if(nodeIndex == n)
                return current.data;
            nodeIndex++;
			current = current.nextNode;
		}

		return null;
	}

}

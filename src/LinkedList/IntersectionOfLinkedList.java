package LinkedList;

public class IntersectionOfLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> list1 = new SinglyLinkedList<Integer>();
		list1.insertAtHead(5);
		list1.insertAtHead(4);
		list1.insertAtHead(3);
		list1.insertAtHead(2);
		list1.insertAtHead(1);

		SinglyLinkedList<Integer> list2 = new SinglyLinkedList<Integer>();
		list2.insertAtHead(8);
		list2.insertAtHead(7);
		list2.insertAtHead(5);
		list2.insertAtHead(6);
		list2.insertAtHead(3);

		SinglyLinkedList<Integer> result = intersection(list1, list2);
		result.printList();
	}

	// performs intersection between list
	public static <T> SinglyLinkedList<T> intersection(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
		SinglyLinkedList<T> result = new SinglyLinkedList<T>();

		if (list1.isEmpty())
			return list2;
		if (list2.isEmpty())
			return list1;

		SinglyLinkedList<T>.Node current = list1.headNode;
		while (current != null) {
			if (contains(list2, current.data)) {
				result.insertAtHead(current.data);
			}
			current = current.nextNode;
		}

		return result;
	}

	public static <T> boolean contains(SinglyLinkedList<T> list2, T data) {
		SinglyLinkedList<T>.Node current = list2.headNode;

		while (current != null) {
			if (data.equals(current.data))
				return true;
			current = current.nextNode;
		}
		return false;
	}

}

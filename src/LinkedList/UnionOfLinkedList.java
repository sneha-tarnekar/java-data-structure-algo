package LinkedList;

public class UnionOfLinkedList {

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
        
		union(list1, list2);
		list1.printList();
	}

	public static <T> SinglyLinkedList<T> union(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
		
		if (list1.isEmpty())
			return list2;
		if (list2.isEmpty())
			return list1;
		
		SinglyLinkedList<T>.Node last = list1.headNode;
		while(last.nextNode != null) {
			last = last.nextNode;
		}
		last.nextNode = list2.headNode;
		RemoveDuplicates.removeDuplicates(list1);
		
		return list1;
	}
	   
}

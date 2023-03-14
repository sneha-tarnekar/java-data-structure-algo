package LinkedList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtHead(1);
        list.insertAtHead(3);
        System.out.print("Before: ");
        list.printList();
        removeDuplicates(list);
        System.out.print("After: ");
        list.printList();
	}
	
	public static <T> void removeDuplicates(SinglyLinkedList<T> list) {
        SinglyLinkedList<T>.Node current = list.headNode;
        SinglyLinkedList<T>.Node compare = null;

        while(current != null && current.nextNode != null) {
            compare = current;
            while(compare.nextNode != null) {
                if(current.data.equals(compare.nextNode.data)) {
                    compare.nextNode = compare.nextNode.nextNode;
                } else {
                    compare = compare.nextNode;
                }
            }
            current = current.nextNode;
        }
    }

}

package LinkedList;

public class PalindromDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> list1 = new DoublyLinkedList<Integer>();
		list1.insertAtHead(1);
		list1.insertAtHead(2);
		list1.insertAtHead(2);
		list1.insertAtHead(1);
		System.out.print("1st ");
		list1.printList();

		DoublyLinkedList<Integer> list2 = new DoublyLinkedList<Integer>();
		list2.insertAtHead(6);
		list2.insertAtHead(8);
		list2.insertAtHead(6);
		list2.insertAtHead(6);
		System.out.print("2nd ");
		list2.printList();

		System.out.println("Is 1st list a palindrome?  " + isPalindrome(list1));
		System.out.println("Is 2nd list a palindrome?  " + isPalindrome(list2));
	}

	public static <T> boolean isPalindrome(DoublyLinkedList<T> list) {
		DoublyLinkedList<T>.Node start = list.headNode;
		DoublyLinkedList<T>.Node end = list.getTailNode();
		if (start == null) { // if list is empty, it is a palindrome
			return true;
		}
		while (start != null) {
			if (start.data != end.data) {
				return false;
			}
			start = start.nextNode;
			end = end.prevNode;
		}
		return true;
	}

}

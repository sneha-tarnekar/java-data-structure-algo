package LinkedList;

public class MiddleNodeOfLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(123);
        list.insertAtHead(101);
        list.insertAtHead(61);
        Object mid = findMiddle(list);
        System.out.println("Middle of Node = "+ mid);
	}
	
	// Here we are using the approach of fast node and slow node,
    // while fast node travels two nodes at the same time slow node travels only one node
    // Ex. If first person covering distance by speed of 10km/h, and second person by 5km/h (half od first one)
    //     hence when the first person touches finish line at the moment second person would have been reached to middle.
    
    public static <T> Object findMiddle(SinglyLinkedList<T> list) {
      
      if(list.isEmpty())
        return null;

      SinglyLinkedList.Node slow = list.headNode;
      SinglyLinkedList.Node fast = list.headNode;

      while(fast != null && fast.nextNode != null) {
        fast = fast.nextNode.nextNode;
        if(fast != null)
          slow = slow.nextNode;
      }

      return slow.data;
    }

}

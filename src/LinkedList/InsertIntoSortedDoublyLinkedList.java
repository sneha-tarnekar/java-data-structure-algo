package LinkedList;

public class InsertIntoSortedDoublyLinkedList {

    class DoublyLinkedListNode {

        int data;
        DoublyLinkedListNode next;
        DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int data) {
            this.data = data;
        }

    }

    public DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {

        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

        if (llist == null) {
            return newNode;
        }

        if (data <= llist.data) {
            newNode.next = llist;
            llist.prev = newNode;
            return newNode;
        }

        DoublyLinkedListNode headNode = llist;

        while (llist != null) {
            if (llist.data >= data) {
                newNode.next = llist;
                newNode.prev = llist.prev;
                llist.prev.next = newNode;
                llist.prev = newNode;
                return headNode;
            }

            if (llist.next == null) {
                break;
            }

            llist = llist.next;
        }

        llist.next = newNode;
        newNode.prev = llist;

        return headNode;

    }

}

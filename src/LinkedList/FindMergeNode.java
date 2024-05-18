package LinkedList;

public class FindMergeNode {

    int findMergeNode(ListNode head1, ListNode head2) {

        while(head2 != null) {
            ListNode temp = head1;
            while(temp != null) {
                if(temp == head2) {
                    return head2.val;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }

        return 0;

    }

}

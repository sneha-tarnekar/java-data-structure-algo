package LinkedList;

//  Given the head of a linked list, return the list after sorting it in ascending order.
public class SortList {

    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode list1 = sortList(head);
        ListNode list2 = sortList(mid);

        return merge(list1, list2);
    }

    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }

        tail.next = list1 != null ? list1 : list2;

        return dummyHead.next;
    }

    public ListNode getMid(ListNode head) {
        ListNode midPrev = null;

        while (head != null && head.next != null) {
            midPrev = midPrev == null ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;

        return mid;
    }

}

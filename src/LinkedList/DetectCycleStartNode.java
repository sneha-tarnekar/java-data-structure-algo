package LinkedList;

public class DetectCycleStartNode {

    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        int cycleLength = 0;

        ListNode temp = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                temp = slow;

                do {
                    temp = temp.next;
                    cycleLength++;
                } while (temp != slow);
                break;
            }
        }

        if (cycleLength == 0)
            return null;

        ListNode first = head;

        while (first != temp) {
            first = first.next;
            temp = temp.next;
        }

        return first;
    }

}

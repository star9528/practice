class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if (pHead == null) {
            return null;
        }
        if (pHead.next == null) {
            return pHead;
        }
        ListNode maxHead;
        ListNode minHead;
        ListNode max,min;
        for (ListNode cur = pHead.next;cur.next != null;cur = cur.next) {
            if (cur.val < x) {
                min = cur;
                min = min.next;
            } else {
                max = cur;
                max = max.next;
            }
        }
        max = null;
        min = maxHead.next;
        pHead = minHead.next;
        return pHead;
    }
}

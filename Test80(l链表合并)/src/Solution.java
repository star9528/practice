
class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }


}

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur = new ListNode(-1);
        ListNode Head = cur;
        while(l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            cur.next = l2;
        }
        if (l2 == null) {
            cur.next = l1;
        }
        return Head.next;
    }

    public static void main(String[] args) {
        ListNode a = null;
        ListNode b = null;
        ListNode c = null;
        ListNode d = null;
        ListNode e = null;
        ListNode f = null;
        a.val = 1;
        b.val = 2;
        c.val = 3;
        d.val = 4;
        e.val = 5;
        f.val = 6;
        a.next = c;
        c.next = e;

        b.next = d;
        d.next = f;
        Solution s = new Solution();
        System.out.println(s.mergeTwoLists(a,b));
    }
}

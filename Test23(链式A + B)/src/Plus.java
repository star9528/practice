import java.util.*;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Plus {
    public static ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode head = new ListNode(1);
        ListNode next = head;
        int s = 0;
        while (a != null && b != null) {
            if (a == null && b!=null) {
                next.next = b;
                return head;
            }
            if (a != null && b == null) {
                next.next = a;
                return head;
            }
            int temp = a.val + b.val;
            s = s / 10;
            if (temp + s < 10) {
                ListNode node  = new ListNode(temp + s);
                next = next.next;
                next = node;
            } else {
                ListNode node  = new ListNode((temp + s) % 10);
                next = next.next;
                next = node;
            }
            a = a.next;
            b = b.next;
        }
        return head.next;
    }
    public static void main (String[] args) {
        //创建链表a,b
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(5);
        ListNode a3 = new ListNode(6);
        a1.next = a2;
        a2.next = a3;
        a3.next = null;

        ListNode b1 = new ListNode(7);
        ListNode b2 = new ListNode(8);
        ListNode b3 = new ListNode(9);
        b1.next = b2;
        b2.next = b3;
        b3.next = null;

        // ListNode c = plusAB(a1, b1);
        // System.out.println(c);
        System.out.println(plusAB(a1, b1));


    }
}

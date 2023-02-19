package labuladong;

import lzx.ListNode;


public class LC86 {
    public static void main(String[] args) {
        int[] a = {1,4,3,2,5,2};
        ListNode head = TestNode.createLinkList(a);
        ListNode l2 = partition(head, 3);

        while (l2!=null){
            System.out.print(l2.val);
            l2 = l2.next;
        }
    }

    public static ListNode partition(ListNode head, int x) {

        ListNode small = new ListNode(-1);
        ListNode big = new ListNode(-1);
        ListNode p0 = head,p1 =small,p2 = big;

        while (p0 != null){
            if(p0.val >= x){
                big.next = p0;
                big = big.next;
            }else {
                small.next = p0;
                small = small.next;
            }
            p0 = p0.next;
        }
        big.next = null;
        small.next = p2.next;
        return p1.next;
    }

}

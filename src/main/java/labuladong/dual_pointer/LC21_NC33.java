package labuladong.dual_pointer;

import lzx.ListNode;
// 合并两个有序链表
public class LC21_NC33 {
    public ListNode mergeTwoList(ListNode l1,ListNode l2){
        //空结点
        ListNode p0 = new ListNode(-1);
        ListNode dummy = p0;
        ListNode p1 = l1;
        ListNode p2 = l2;
        while (p1 !=null && p2 !=null){
            if (p1.val > p2.val){
                dummy.next = p1;
                p1 = p1.next;
            }else {
                dummy.next = p2;
                p2 = p2.next;
            }
            dummy = dummy.next;
        }
        if (p1!=null) dummy.next = p1;
        if (p2!=null) dummy.next = p2;

        return p0.next;
    }
    public static void main(String[] args) {

    }
}

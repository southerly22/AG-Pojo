package labuladong.dual_pointer;

import lzx.ListNode;

/**
 * 环形链表||
 *
 * @author lzx
 * @date 2023/02/18 16:56
 **/
public class LC142 {
    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {
        if (head==null) return null;
        ListNode slow = head,fast = head;

        //有环判断
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }

        //不是环形链表
        if (fast ==null || fast.next==null) return null;

        //找出 环的开头
        slow = head;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

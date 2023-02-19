package labuladong;

import lzx.ListNode;

/**
 * 链表的中间节点
 *
 * @author lzx
 * @date 2023/02/18 14:39
 **/
public class LC876 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3,4};
        ListNode node = TestNode.createLinkList(a);
        ListNode middleNode = middleNode(node);
        System.out.println(middleNode.val);
    }

    public static ListNode middleNode(ListNode head) {
        if (head.next == null) return null;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

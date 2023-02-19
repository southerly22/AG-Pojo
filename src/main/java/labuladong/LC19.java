package labuladong;

import lzx.ListNode;

/**
 * 删除单链表的倒数第K个节点
 *
 * @author lzx
 * @date 2023/02/18 10:24
 **/
public class LC19 {
    public static void main(String[] args) {
        int[] a = {1};
        ListNode node = TestNode.createLinkList(a);
        ListNode node1 = removeNthFromEnd(node, 1);
        while (node1!=null){
            System.out.println(node1.val);
            node1 = node1.next;
        }
    }

    // 双指针法 ，时间复杂度：0（n）
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        //防止 删除第一个节点
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p1 = dummy, p2 = dummy;

        for (int i = 0; i <= n; i++) {
            p1 = p1.next;
        }
        while (p1!=null){
            p2 = p2.next;
            p1 = p1.next;
        }
        // p2此时是 要删除节点的前一个节点
        p2.next = p2.next.next;
        return dummy.next;
    }
}

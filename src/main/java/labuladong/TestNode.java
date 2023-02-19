package labuladong;

import lzx.ListNode;

/**
 * 测试ListNode
 *
 * @author lzx
 * @date 2023/02/17 10:27
 **/
public class TestNode {
    public static void main(String[] args) {
        //int[] a = {1,4,3,2,5,2};
        //ListNode dummy = createLinkList(a);
        ////输出
        //while (dummy!=null){
        //    System.out.println("dummy.val = " + dummy.val);
        //    dummy = dummy.next;
        //}
    }

    public static ListNode createLinkList(int[] a){
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        for (int i = 0; i < a.length; i++) {
            ListNode l1 = new ListNode(a[i]);
            head.next = l1;
            head = head.next;
        }
        return dummy.next;
    }
}

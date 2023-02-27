package labuladong.dual_pointer;

import lzx.ListNode;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * LC_23_2
 *
 * @author lzx
 * @date 2023/02/17 21:59
 **/
public class LC23_2 {
    public static void main(String[] args) {

    }
    public static ListNode mergeKLists(ListNode[] lists) {

        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;

        //构建小顶堆
        TreeSet<ListNode> treeSet = new TreeSet<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });

        for (ListNode head : lists) {
            if (head!=null) treeSet.add(head);
        }

        while (!treeSet.isEmpty()){
            ListNode node = treeSet.pollFirst();
            p.next = node;
            if (node.next!=null){
                treeSet.add(node.next);
                node = node.next;
            }
            p = p.next;
        }

        return dummy.next;
    }
}

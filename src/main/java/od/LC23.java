package od;

import lzx.ListNode;

import java.util.PriorityQueue;

/**
 * LC23
 *
 * @author lzx
 * @date 2023/02/17 16:01
 **/
public class LC23 {
    public static void main(String[] args) {

    }
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;

        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);

        // 把每个堆里面的head节点 放入小根堆，得到K组链表中 最小的那个head节点
        for (ListNode node : lists) {
            if (node !=null) pq.add(node);
        }

        while (!pq.isEmpty()){
            //弹出并删除
            ListNode head = pq.poll();
            p.next = head;
            if (head !=null){ //如果当前链表还有值 继续加入堆里面进行比较
                pq.add(head.next);
            }
            p = p.next;
        }

        return dummy.next;
    }
}

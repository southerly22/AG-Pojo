package labuladong.dual_pointer;

import lzx.ListNode;

import java.util.HashSet;

/**
 * 判断链表是否有环
 *
 * @author lzx
 * @date 2023/02/18 15:11
 **/
public class LC141 {
    public static void main(String[] args) {

    }
    // 快慢指针
    public boolean hasCycle(ListNode head) {
        ListNode fast = head,slow = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    //哈希表
    public boolean hasCycle2(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        while (head!=null){
            if (!hashSet.add(head)){  //hashset.add ：如果Set已经包含此元素 返回false
                return true;
            }
            head = head.next;
        }
        return false;
    }
}

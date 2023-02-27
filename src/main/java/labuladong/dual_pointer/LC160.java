package labuladong.dual_pointer;

import lzx.ListNode;

import java.util.HashSet;

/**
 * 链表是否相交
 *
 * @author lzx
 * @date 2023/02/19 16:30
 **/
public class LC160 {
    public static void main(String[] args) {

    }
    // hash表方法：空间复杂度O(n) ，n：是链表A的长度。时间复杂度O(m+n)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA ==null|| headB ==null) return null;

        HashSet<ListNode> hashSet = new HashSet<>();
        while (headA != null){
            hashSet.add(headA);
            headA = headA.next;
        }
        while (headB != null){
            if (!hashSet.add(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}

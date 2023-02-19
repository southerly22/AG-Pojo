package labuladong;

import lzx.ListNode;

import java.util.HashSet;

/**
 * 链表是否相交
 *
 * @author lzx
 * @date 2023/02/19 16:30
 **/
public class LC160_2 {
    public static void main(String[] args) {

    }

    // 长度法：空间复杂度O(1)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA ==null|| headB ==null) return null;
        ListNode p1 ,p2 ;
        int lenA = 0,lenB = 0;
        for (p1 = headA;p1!=null;p1 = p1.next) lenA ++;
        for (p2 = headB;p2!=null;p2 = p2.next) lenB ++;

        // 将两个链表设置到同一起点
        if (lenA > lenB){
            for (int i = 0; i < lenA - lenB; i++) {
                headA = headA.next;
            }
        }else {
            for (int i = 0; i < lenB - lenA; i++) {
                headB = headB.next;
            }
        }
        // 齐头并进
        while (headA!=headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}

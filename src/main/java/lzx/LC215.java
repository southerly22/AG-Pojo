package lzx;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 * @author lzx
 * @date 2023/7/27 16:50
 * @description: TODO 数组中第 k 大的元素
 * 输入: [3,2,1,5,6,4] 和 k = 2 输出: 5
 */
public class LC215 {
    public static void main(String[] args) {
        // int[] nums = {3,2,1,5,6,4};
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 1;
        System.out.println(findKthLargest(nums, k));


    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b.compareTo(a));
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
        }
        for (int i = 1; i < k; i++) {
            queue.remove(queue.peek());
        }
        return queue.peek();
    }
}

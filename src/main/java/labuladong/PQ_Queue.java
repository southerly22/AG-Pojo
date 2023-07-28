package labuladong;

import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 * 优先队列
 *
 * @author lzx
 * @date 2023/02/17 17:06
 **/
public class PQ_Queue {
    public static void main(String[] args) {
        // 创建优先级队列
        PriorityQueue<Integer> numbers = new PriorityQueue<>(3,(a,b)->a-b);
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.println("PriorityQueue: " + numbers);

        TreeSet<Integer> treeSet2 = new TreeSet<>((a,b)->a.compareTo(b));
        treeSet2.add(4);
        treeSet2.add(7);
        treeSet2.add(2);
        System.out.println("treeSet2 = " + treeSet2);

        // 大根堆
        TreeSet<Integer> treeSet = new TreeSet<>((a,b)->b.compareTo(a));

        treeSet.add(4);
        treeSet.add(7);
        treeSet.add(2);
        System.out.println(treeSet);

        Integer last = treeSet.last();
        System.out.println(treeSet.first());
        System.out.println(last);
        System.out.println(treeSet);

        treeSet.pollLast();
        System.out.println(treeSet);

    }
}

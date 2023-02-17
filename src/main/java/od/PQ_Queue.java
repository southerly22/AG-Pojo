package od;

import java.util.PriorityQueue;

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
    }
}

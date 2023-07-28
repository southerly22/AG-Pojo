package lzx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author lzx
 * @date 2023/7/20 13:37
 * @description: TODO
 *      输入：nums = [10,6,5,8]  [1,3,5,3]
 *      输出：[10,8]           输出：[1,5]
 */
public class LC2150 {
    public static void main(String[] args) {
        // int[] nums = {10,6,5,8};
        int[] nums = {1,3,5,3};
        findLonely(nums);
    }

    public static List<Integer> findLonely(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int length = nums.length;
        if (length == 0) return null;

        for (int num : nums) {
            hashMap.putIfAbsent(num,0);
            hashMap.put(num,hashMap.get(num)+1);
        }

        hashMap.forEach((k,v)->{
            System.out.println(k+","+v);
        });

        for (Integer num : hashMap.keySet()) {
            if (hashMap.get(num)==1 && !hashMap.containsKey(num-1) && !hashMap.containsKey(num+1))
                    list.add(num);
        }
        list.forEach(System.out::println);
        return list;
    }
}

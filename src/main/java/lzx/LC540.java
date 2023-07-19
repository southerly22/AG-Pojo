package lzx;

import java.util.HashSet;

/**
 * @author lzx
 * @date 2023/7/19 14:42
 * @description: TODO
 */
public class LC540 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        HashSet<Integer> hashSet = new HashSet<>(1);
        for (int num : nums) {
            if (hashSet.contains(num)) {
                hashSet.remove(num);
            }else {
                hashSet.add(num);
            }
        }
        System.out.println(hashSet.stream().findFirst().orElse(0));
        System.out.println("----------------- bitCompute ---------------------");
        bitCompute(nums);
    }

    public static int bitCompute(int[] nums){
        int res = 0;
        for (int num : nums) {
            System.out.println(num +" ^ "+res);
            res = num ^ res;
            System.out.println("res = " + res);
        }
        return res;
    }
}

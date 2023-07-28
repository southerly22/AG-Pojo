package labuladong;

import lzx.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 两数之和
 *
 * @author lzx
 * @date 2023/02/19 21:52
 **/
public class LC1 {
    public static void main(String[] args) {
        int[] a = {3,3,2,3,6};
        int[] ints = twoSum2(a, 10);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                res[0] = hashMap.get(target - nums[i]);
                res[1] = i;
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return res;
    }

    public static int[] twoSum2(int[] nums,int target){
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                res[0] = map.get(target - nums[i]);
                res[1] = i;
            }else {
                map.put(nums[i],i);
            }
        }
        return res;
    }

}

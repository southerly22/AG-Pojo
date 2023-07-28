package lzx;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author lzx
 * @date 2023/7/19 16:45
 * @description: TODO
 *      输入：nums = [4,3,2,7,8,2,3,1]
 *      输出：[2,3]
 */
public class LC442 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        // int[] nums = {2, 3, 2};
        // 输出：[2,3]

        List<Integer> list = findDuplicates(nums);
        System.out.println(Arrays.toString(list.toArray()));
        // List<Integer> list2 = findDuplicates2(nums);
        // System.out.println(Arrays.toString(list2.toArray()));
    }

    // 原地hash
    public static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        if (nums.length == 1) {
            list.add(nums[0]);
            return list;
        }
        // 交换
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
                System.out.println("交换后："+i+"，"+Arrays.toString(nums));
            }
        }
        // 取值
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 != i) list.add(nums[i]);
        }
        return list;
    }

    public static int[] swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
        return nums;
    }

    // 负数下标
    public static List<Integer> findDuplicates2(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int index = Math.abs(num) -1;
            if (nums[index] > 0){
                nums[index] = -nums[index];
            }else {
                list.add(index + 1);
            }
        }
        return list;
    }

    public static List<Integer> findDuplicates3(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) hashSet.add(nums[i]);
        }
        return new ArrayList<>(hashSet);
    }

}

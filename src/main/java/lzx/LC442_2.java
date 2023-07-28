package lzx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author lzx
 * @date 2023/7/19 16:45
 * @description: TODO
 * 输入：nums = [4,3,2,7,8,2,3,1]
 * 输出：[2,3]
 */
public class LC442_2 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> list = findDuplicates(nums);
        System.out.println(Arrays.toString(list.toArray()));
    }

    // 原地hash
    public static List<Integer> findDuplicates(int[] nums) {
        //1.交换
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i] - 1) {
                arrayList.add(nums[i]);
            }
        }
        return arrayList;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = 0;
        tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}

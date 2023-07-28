package lzx;

import java.util.Arrays;

/**
 * @author lzx
 * @date 2023/7/20 14:39
 * @description: TODO
 * 输入: nums = [4,2,3,4]
 * 输出: 4
 */
public class LC611 {
    public static void main(String[] args) {
        // int[] nums = {4, 2, 3, 4};
        int[] nums = {2, 2, 3, 4};
        // int[] nums = {1,1,3,4};
        triangleNumber(nums);
    }

    public static int triangleNumber(int[] nums) {
        int flag = 0;
        int n = nums.length;
        if (n < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int max = n - 1, mid = n - 2, min = n - 3;
        while (max >= 2) {
            if (nums[max] - nums[mid] < nums[min] && nums[min] + nums[mid] > nums[max]) {
                flag++;
                if (min == 0) {
                    if (mid == 1) {
                        max--;
                    } else {
                        mid--;
                    }
                } else {
                    min--;
                }
            }else {
                max--;
                mid--;
                min--;
            }
        }
        System.out.println(flag);
        return flag;
    }
}

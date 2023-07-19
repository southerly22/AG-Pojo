package lzx;

import java.util.Arrays;

/**
 * @author lzx
 * @date 2023/7/19 14:23
 * @description: TODO
 */
public class LC976 {
    public static void main(String[] args) {
        int[] nums = {3,2,3,4};

    }
    public static int largestPerimeter(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        while (n >= 3) {
            int max = nums[n - 1];
            int middle = nums[n - 2];
            int min = nums[n - 3];

            if (min + middle > max && max - min < middle) {
                return (max + middle + min);
            }else {
                n--;
            }
        }
        return 0;
    }
}

package lzx;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author lzx
 * @date 2023/7/20 11:27
 * @description: 输入：nums = [0,0,1,1,1,2,2,3,3,4]
 *               输出：5, nums = [0,1,2,3,4]
 *               快慢指针
 */
public class LC26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        // System.out.println(removeDuplicates(nums));
        int len = removeDuplicates2(nums);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length ==0) {
            return 0;
        }
        int slow = 1,fast =1;
        while (fast < length){
            if (nums[fast] != nums[fast -1]){
                nums[slow] = nums[fast];
                slow ++;
            }
            fast ++;
        }
        // System.out.println(Arrays.toString(nums));
        return slow;
    }
    // nums = [0,0,1,1,1,2,2,3,3,4]
    public static int removeDuplicates2(int[] nums) {
        int len = nums.length;
        int slow=1,fast=1;

        while (fast < len){
            if (nums[fast] != nums[fast - 1]){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}

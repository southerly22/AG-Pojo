package labuladong;

/**
 * @author lzx
 * @date 2023/2/21 11:53
 * @description: TODO 整数反转
 */
public class LC7 {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(reverse(a));
        System.out.println(reverse2(a));
        // int b = 123;

    }
    // 字符串 解法执【行耗时:2 ms,击败了16.86% 的Java用户】
    public static int reverse(int x) {
        long res = 0L;
        if (x > 0) {
            StringBuilder s1 = new StringBuilder(String.valueOf(x));
            res = Long.parseLong(s1.reverse().toString());
        }
        if(x < 0) {
            StringBuilder s1 = new StringBuilder(String.valueOf(x));
            res = Long.parseLong(s1.replace(0, 1, "").reverse().toString()) * (-1);
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return 0;
        else return (int) res;
    }
    // 余数 解法【推荐】
    public static int reverse2(int x){
        long res = 0L;
        while (x != 0) {
            int tmp = x % 10;
            res = res * 10 + tmp;
            x /= 10;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return 0;
        return (int) res;
    }




}

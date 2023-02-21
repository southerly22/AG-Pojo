package labuladong;

/**
 * @author lzx
 * @date 2023/2/21 15:22
 * @description: TODO 回文数
 * -2^31 <= x <= 2^31 - 1
 */
public class LC9 {
    public static void main(String[] args) {
        int a = -121;
        System.out.println(isPalindrome(123454321));
        System.out.println(isPalindrome(a));
        System.out.println(Integer.MAX_VALUE);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        long res = 0L;
        int a = x;
        while (x != 0 ){
            int tmp = x % 10;
            res = res * 10 + tmp;
            x /= 10;
        }
        if (res == a) return true;
        return false;
    }
}

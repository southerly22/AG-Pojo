package labuladong;

import java.util.Arrays;
import java.util.Stack;

/**
 * 整数反转
 *
 * @author lzx
 * @date 2023/02/20 21:53
 **/
public class LC7 {
    public static void main(String[] args) {
        int a = 1234;

        String lzx = new StringBuffer("lzx").reverse().toString();
        System.out.println(lzx);

        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        System.out.println(integerStack.pop());

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(2);
        stringBuilder.append(3);
        System.out.println(Integer.parseInt(stringBuilder.toString()));

        //int[] transfer = transfer(a);
        //System.out.println(Arrays.toString(transfer));
    }
    public static int[] transfer(int a){
        String str = null;
        str = Integer.toString(a);
        int[] res = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String s = String.valueOf(c);
            res[i] = Integer.parseInt(s);
        }
        return res;
    }
    //方法2：取余数。时间复杂度最低
    public static int reverse(int x) {
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

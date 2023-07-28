package labuladong;

import lzx.Str;

import java.util.Arrays;

/**
 * @author lzx
 * @date 2023/2/21 14:32
 * @description: TODO
 */
public class test {
    public static void main(String[] args) {
        int a = 83648;
        // System.out.println(transer(a));

        String str = "83648";
        char[] chars = new char[str.length()];
        char[] res = new char[str.length()];
        int j = 0;
        for (int i = chars.length-1; i >= 0; i--) {
            char c = str.charAt(i);
            res[j] = c;
            j+=1;
        }

        System.out.println(Arrays.toString(res));
    }
    public static int transer(int a){
        long res = 0L;
        while (a > 0){
            int tmp = a % 10;
            res = res * 10 + tmp;
            a /= 10;
        }
        return (int) res;
    }
}

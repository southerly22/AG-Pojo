package labuladong;

import java.util.Arrays;

/**
 * @author lzx
 * @date 2023/2/22 11:56
 * @description: TODO 字符串转数字
 */
public class LC8 {
    public static void main(String[] args) {
        String s1 = "with words 4193";
        String s2 = "     -42";
        System.out.println(myAtoi(s1));
    }

    public static int myAtoi(String s) {
        char[] chars = s.toCharArray();
        int len = s.length();
        int index = 0;
        //1.去空格
        while (index < len && chars[index]==' '){
            index ++;
        }
        //2.排除极端
        if (index == len) return 0;

        //3.判断正负
        int sign = 1;
        if (chars[index] == '-'){
            index ++;
            sign = -1;
        }else if (chars[index] == '+'){
            index ++;
            sign = 1;
        }
        //4.判断
        int res = 0,last = 0;
        while (index < len){
            char currentChar = chars[index];
            if (currentChar < '0' || currentChar >'9'){
                break;
            }
            int tmp = currentChar - '0';
            last = res;
            res = res * 10 + tmp;
            if (last != res/10) { //溢出判断
                return (sign == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            index ++;
        }
        return res * sign;
    }
}

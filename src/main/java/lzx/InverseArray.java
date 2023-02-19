package lzx;

import java.util.Arrays;

/**
 * 反转数组
 *
 * @author lzx
 * @date 2023/02/19 22:50
 **/
public class InverseArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(Arrays.toString(inverseArray(a)));
    }
    public static int[] inverseArray(int[] a){
        int tmp = 0;
        int lenA = a.length;
        for (int i = 0; i < lenA / 2; i++) {
            tmp =  a[i];
            a[i] = a[lenA - 1 - i];
            a[lenA -1 -i] = tmp;
        }
        return a;
    }
}

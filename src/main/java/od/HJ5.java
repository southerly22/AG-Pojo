package od;

import java.util.Scanner;
// 十六进制 转十进制
public class HJ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next().substring(2);
        int aa = Integer.parseInt(str, 16);
        System.out.println(aa);
    }
}

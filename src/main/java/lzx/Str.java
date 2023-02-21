package lzx;

/**
 * StringBuilder
 *
 * @author lzx
 * @date 2023/02/21 08:46
 **/
public class Str {
    public static void main(String[] args) {

        String str = null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder);

        System.out.println(str.length());

        StringBuilder s2 = new StringBuilder(str);
        System.out.println(s2);
    }
}

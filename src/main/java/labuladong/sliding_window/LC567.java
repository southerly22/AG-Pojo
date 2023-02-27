package labuladong.sliding_window;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 字符串的排列
 *
 * @author lzx
 * @date 2023/02/25 21:21
 **/
public class LC567 {
    public static void main(String[] args) {
        String s1 = "abcdxabcde";
        String s2 = "abcdeabcdx";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        //增加右窗口
        while (right < s2.length()) {
            char c = s2.charAt(right);
            right++;
            if (need.containsKey(c)){
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (need.get(c).equals(window.get(c))) {
                    ++count;
                }
            }
            //收缩左窗口 和增加窗口逻辑相反
           while (right - left == s1.length()){  //开了长度为need.size()的窗口
               //找到了窗口内的合法子串
               if (count == need.size()){
                   return true;
               }
               char d = s2.charAt(left);
               left ++;

               //窗口内的一些列更新
               if (need.containsKey(d)){
                   if (need.get(d).equals(window.get(d))){
                       -- count;
                   }
                   window.put(d,window.get(d) - 1);
               }
           }
        }
       return false;
    }
}

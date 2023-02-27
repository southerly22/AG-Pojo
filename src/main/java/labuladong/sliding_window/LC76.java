package labuladong.sliding_window;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 最小覆盖子串
 *
 * @author lzx
 * @date 2023/02/26 08:40
 **/
public class LC76 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String s1 = "ABAACBAB";
        String t = "ABC";
        System.out.println(minWindow(s1, t));
    }

    // 滑动窗口
    public static String minWindow(String s, String t) {
        int left = 0, right = 0; //双指针
        int count = 0;
        int start = 0; //子串起始位置
        int len = Integer.MAX_VALUE; //记录子串的最小长度
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        //处理t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        //处理s
        while (right < s.length()) {
            char c = s.charAt(right);
            right++; //窗口扩展
            if (need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0) + 1); //窗口装入值
                if (need.get(c).equals(window.get(c)))
                    ++count; //符合条件的字符串个数
            }

            //收缩窗口 寻找最优子解
            while (count == need.size()){

                //构建最优解
                if (right - left < len){
                    len = right - left;
                    start = left;
                }

                char d = s.charAt(left);
                left++;

                if (need.containsKey(d)){
                    if (need.get(d).equals(window.get(d))){
                        --count; //破坏，先找下一个解
                    }
                    window.put(d,window.get(d) - 1);
                }
            }
        }

        return len == Integer.MAX_VALUE ? "" : s.substring(start,start+len); // substring 左闭右开
    }

    //检查两个map里的字段是否相等
    public static boolean check(HashMap<Character, Integer> maps, HashMap<Character, Integer> mapt) {
        Iterator<Map.Entry<Character, Integer>> entryIter = mapt.entrySet().iterator();
        while (entryIter.hasNext()) {
            Map.Entry<Character, Integer> entry = entryIter.next();
            Integer valueT = mapt.getOrDefault(entry.getKey(), 0);
            Integer valueS = maps.getOrDefault(entry.getKey(), 0);
            if (!valueS.equals(valueT)) {
                return false;
            }
        }
        return true;
    }
}

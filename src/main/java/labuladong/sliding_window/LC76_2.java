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
public class LC76_2 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String s1 = "ABAACBAB";
        String t = "ABC";
        System.out.println(minWindow(s1, t));
    }

    // 滑动窗口
    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>(); //储存需要的字符以及对应的数量

        int left=0,right=0; //双指针
        int count = 0;//记录当前窗口中符合need要求的字符数量，当count==need.size时即可收缩窗口
        int start = 0;//表示符合最优解的子串的起始位序
        int len = Integer.MAX_VALUE; // 用来记录窗口的长度，并且以len作比较选出，最小的子串长度

        // 处理 t，初始化need
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            need.put(c,need.getOrDefault(c,0) + 1);
        }

        //处理 s，开窗
        while (right < s.length()){
            char c = s.charAt(right);
            right ++;
            if (need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0) + 1);
                if (need.get(c).equals(window.get(c))){
                    count ++;
                }
            }
            System.out.println(window.toString());
            //收缩窗口，找出最优解
            while (count == need.size()){
                System.out.println(left+","+right);
                if (right - left < len){
                    len = right - left;
                    start = left;
                }
                 char d = s.charAt(left);
                 left++; //缩小窗口
                if (need.containsKey(d)){
                    if (need.get(d).equals(window.get(d))){
                        count --;
                    }
                    window.put(d,window.get(d) -1);
                }
            }
        }

        return len == Integer.MAX_VALUE ? "":s.substring(start,start + len);
    }

    //检查两个map里的字段是否相等
    public static boolean check(HashMap<Character,Integer> maps,HashMap<Character,Integer> mapt){
        Iterator<Map.Entry<Character, Integer>> entryIter = mapt.entrySet().iterator();
        while (entryIter.hasNext()){
            Map.Entry<Character, Integer> entry = entryIter.next();
            Integer valueT = mapt.getOrDefault(entry.getKey(), 0);
            Integer valueS = maps.getOrDefault(entry.getKey(), 0);
            if (!valueS.equals(valueT)){
                return false;
            }
        }
        return true;
    }
}

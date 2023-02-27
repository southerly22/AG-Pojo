package labuladong.sliding_window;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author lzx
 * @date 2023/2/22 16:06
 * @description: TODO 最长无重复子串
 * 输入: s = "abcabcbb" 输出: 3 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 输入: s = "pwwkew" 输出: 3 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class LC3 {

    public static void main(String[] args) {
        String str = "pwwkew";
        String str1 = "abcabcbb";
        String str2 = "BBBBB";
        System.out.println(str2);
        System.out.println(lengthOfLongestSubstring(str1));
    }

    //套路：滑动窗口
    /**
     1、首先，判断当前字符是否包含在map中，如果不包含，将该字符添加到map（字符，字符在数组下标）,
     此时没有出现重复的字符，左指针不需要变化。此时不重复子串的长度为：i-left+1，与原来的maxLen比较，取最大值；

     2、如果当前字符 ch 包含在 map中，此时有2类情况：
     1）当前字符包含在当前有效的子段中，如：abca，当我们遍历到第二个a，当前有效最长子段是 abc，我们又遍历到a，
     那么此时更新 left 为 map.get(a)+1=1，当前有效子段更新为 bca；
     2）当前字符不包含在当前最长有效子段中，如：abba，我们先添加a,b进map，此时left=0，我们再添加b，发现map中包含b，
     而且b包含在最长有效子段中，就是1）的情况，我们更新 left=map.get(b)+1=2，此时子段更新为 b，而且map中仍然包含a，map.get(a)=0；
     随后，我们遍历到a，发现a包含在map中，且map.get(a)=0，如果我们像1）一样处理，就会发现 left=map.get(a)+1=1，实际上，left此时
     应该不变，left始终为2，子段变成 ba才对。

     为了处理以上2类情况，我们每次更新left，left=Math.max(left , map.get(ch)+1).
     另外，更新left后，不管原来的 s.charAt(i) 是否在最长子段中，我们都要将 s.charAt(i) 的位置更新为当前的i，
     因此此时新的 s.charAt(i) 已经进入到 当前最长的子段中！
     */
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int maxLen = 0; //用来记录最大不重复子串
        int left = 0; //用来记录左指针

        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))){
                left = Math.max(left,hashMap.get(s.charAt(i)) + 1);
            }
            hashMap.put(s.charAt(i),i);
            maxLen = Math.max(maxLen,i-left + 1);
        }
        return maxLen;
    }
    //滑动窗口 公式
   /**
    *         int left = 0,right = 0;
    *         unordered_map<char, int> window;
    *
    *         while (right < s.length()){
    *             增大窗口
    *             window.add(s.charAt(right))
    *             right++;
    *
    *             while (窗口需要收缩){
    *                 window.remove(s.chatAt(left))
    *                 left++;
    *             }
    *        }
    */
}

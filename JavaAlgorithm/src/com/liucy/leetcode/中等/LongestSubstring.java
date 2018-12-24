package com.liucy.leetcode.中等;

public class LongestSubstring {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s == null) {
                return 0;
            }
            String oldmaxstring = "";
            String curstring = "";
            for (int i = 0; i < s.length(); i++) {
                int index = curstring.indexOf(String.valueOf(s.charAt(i)));
                if (index >= 0) {
                    // 存在重复字符'
                    if (curstring.length() > oldmaxstring.length()) {
                        oldmaxstring = curstring;
                    }
                    // 问题出在这里
                    curstring = curstring.substring(index + 1);
                } else {
                    // do nothing
                }
                curstring += s.charAt(i);
            }
            return oldmaxstring.length() > curstring.length() ? oldmaxstring.length() : curstring.length();
        }
    }
}

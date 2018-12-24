package com.liucy.leetcode.中等;

public class ZigZagConversion {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    static class Solution {
        public String convert(String s, int numRows) {
            if (numRows < 2) {
                return s;
            }
            StringBuilder builder = new StringBuilder(s.length());
            int index = 0, indexpre = 0;
            int detal = numRows + numRows - 2;
            int j = 0;
            for (int i = 0; i < numRows; i++) {
                j = 0;
                while (true) {
                    index = i + j;
                    if (i > 0 && i < numRows - 1) {
                        indexpre = j - i;
                        if (indexpre >= 0 && indexpre < s.length()) {
                            builder.append(s.charAt(indexpre));
                        }
                    }
                    if (index >= 0 && index < s.length()) {
                        builder.append(s.charAt(index));
                    } else {
                        break;
                    }
                    j += detal;
                }
            }
            return builder.toString();
        }
    }
}

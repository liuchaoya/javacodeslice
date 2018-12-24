package com.liucy.leetcode.中等;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    static class Solution {
        public String longestPalindrome(String s) {
            String longest = String.valueOf(s.charAt(0));
            int leftEven = 0, rightEven = 0, lengthEven = 0;
            int leftOdd = 0, rightOdd = 0, lengthOdd = 0;
            for (int i = 1; i < s.length(); i++) {
                // 偶数的回文
                leftEven = i - 1;
                rightEven = i;
                lengthEven = 0;
                while (leftEven >= 0 && rightEven < s.length()) {
                    if (s.charAt(leftEven) == s.charAt(rightEven)) {
                        lengthEven = rightEven - leftEven + 1;
                        leftEven--;
                        rightEven++;
                    } else {
                        break;
                    }
                }

                // 奇数的回文
                leftOdd = i;
                rightOdd = i;
                lengthOdd = 1;
                while (leftOdd >= 0 && rightOdd < s.length()) {
                    if (s.charAt(leftOdd) == s.charAt(rightOdd)) {
                        lengthOdd = rightOdd - leftOdd + 1;
                        leftOdd--;
                        rightOdd++;
                    } else {
                        break;
                    }
                }

                // 判断长度
                if (lengthEven > lengthOdd && lengthEven > longest.length()) {
                    longest = s.substring(leftEven + 1, rightEven - 1 + 1);
                }

                if (lengthOdd > lengthEven && lengthOdd > longest.length()) {
                    longest = s.substring(leftOdd + 1, rightOdd - 1 + 1);
                }
            }
            return longest;
        }
    }
}

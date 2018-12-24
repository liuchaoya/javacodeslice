package com.liucy.leetcode.简单;

public class TwoSum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        int[] ret = new Solution().twoSum(nums, target); // [0, 1]
        for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i]);
        }
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < (nums.length - 1); i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        int[] result = new int[] { i, j };
                        return result;
                    }
                }
            }
            return nums;
        }
    }
}

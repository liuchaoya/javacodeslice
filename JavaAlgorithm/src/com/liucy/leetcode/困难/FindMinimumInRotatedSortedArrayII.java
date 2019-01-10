package com.liucy.leetcode.困难;

// https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/
public class FindMinimumInRotatedSortedArrayII {

    public static void main(String[] args) {

//        int[] nums = new int[] { 1, 3, 5 }; // 1
//        int[] nums = new int[] { 2, 2, 2, 0, 1 }; // 0
//        int[] nums = new int[] { 1, 1 }; // 1
//        int[] nums = new int[] { 3, 3, 1, 3 }; // 1
//        int[] nums = new int[] { 10, 1, 10, 10, 10 }; // 1
        int[] nums = new int[] { 4, 5, 6, 7, 0, 1, 2 }; // 0
        System.out.println(new Solution().findMin(nums));
    }

    static class Solution {

        public int findMin(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int mid = (left + right) / 2;
                if (nums[right] < nums[mid]) {
                    left = mid + 1;
                } else if (nums[mid] < nums[left]) {
                    right = mid;
                } else {
                    right -= 1;
                }
            }
            return nums[left];
        }

        public int findMinOld(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            if (nums.length == 1) {
                return nums[0];
            }
            int left = 0, right = nums.length - 1;
            if (nums[left] < nums[right]) {
                return nums[left];
            }
            int min = nums[right];
            while (left < right) {
                if (nums[left] == nums[left + 1]) {
                    left++;
                    continue;
                }
                if (nums[right] == nums[right - 1]) {
                    right--;
                    continue;
                }

                int middle = (left + right) / 2;
                if (nums[middle] >= min) {
                    left = middle + 1;
                    if (nums[left] < min) {
                        min = nums[left];
                    }
                } else if (nums[middle] < min) {
                    right = middle - 1;
                    min = nums[middle];
                }
            }
            return min;
        }
    }
}

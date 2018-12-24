package com.liucy.leetcode.困难;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] newnums = new int[nums1.length + nums2.length];

            int i1 = 0, i2 = 0;
            boolean is1 = false;
            while (i1 < nums1.length || i2 < nums2.length ) {
                if (i1 == nums1.length) {
                    is1 = false;
                } else if (i2 == nums2.length) {
                    is1 = true;
                } else {
                    if (nums1[i1] < nums2[i2]) {
                        is1 = true;
                    } else {
                        is1 = false;
                    }
                }
                if (is1) {
                    newnums[i1 + i2] = nums1[i1];
                    i1 = i1 < nums1.length ? i1 + 1 : i1;
                } else {
                    newnums[i1 + i2] = nums2[i2];
                    i2 = i2 < nums2.length ? i2 + 1 : i2;
                }
            }

            if (newnums.length % 2 == 1) {
                return newnums[newnums.length / 2];
            } else {
                int index = newnums.length / 2;
                return (newnums[index - 1] + newnums[index]) / 2.0;
            }
        }
    }
}

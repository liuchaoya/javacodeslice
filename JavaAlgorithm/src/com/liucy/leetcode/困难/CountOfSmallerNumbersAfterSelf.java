package com.liucy.leetcode.困难;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountOfSmallerNumbersAfterSelf {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    static class Solution {
        public List<Integer> countSmaller(int[] nums) {
            List<Integer> res = new ArrayList<>(nums.length);
            List<Integer> sortnums = new ArrayList<>(nums.length);
            for (int i = nums.length - 1; i >= 0; i--) {
                // insert into an array and get index
                res.add(insertIntoArray(sortnums, nums[i]));
            }
            Collections.reverse(res);
            return res;
        }

        //     insertIntoArray sortnums [1, 1, 2, 6], num = 1
        // end insertIntoArray sortnums [1, 1, 1, 2, 6], num = 1index = 1
        public static int insertIntoArray(List<Integer> sortnums, int num) {
//            System.out.println(sortnums + ", num = " + num);
            if (sortnums.size() == 0) {
                sortnums.add(num);
//                System.out.println("end " + sortnums + ", num = " + num + ", i = " + 0);
                return 0;
            }
            int begin = 0, end = sortnums.size() - 1, middle = 0;
            int insertindex = -1;
            while (begin < end) {
//                System.out.println("begin = " + begin + ", end = " + end);

                middle = begin + (end - begin) / 2;
                if (sortnums.get(middle) > num) {
                    // 注意边界处理
                    end = middle - 1 > begin ? middle -1 : begin;
                } else if (sortnums.get(middle) < num) {
                    begin = middle + 1;
                } else {
                    while (middle >= 0 && sortnums.get(middle) == num) {
                        insertindex = middle;
                        middle--;
                    }
                    break;
                }
            }

            if (begin == end) {
                if (sortnums.get(begin) > num) {
                    insertindex = begin;
                } else if (sortnums.get(begin) < num) {
                    insertindex = begin + 1;
                } else {
                    while (begin >= 0 && sortnums.get(begin) == num) {
                        insertindex = begin;
                        begin--;
                    }
                }
//                break;
            }

            if (insertindex < 0) {
                insertindex = 0;
            }
            if (insertindex >= sortnums.size()) {
                sortnums.add(num);

//                System.out.println("end insertIntoArray sortnums " + sortnums + ", num = " + num + ", i = " + (sortnums.size() - 1));
                return sortnums.size() - 1;
            } else {
                sortnums.add(insertindex, num);

//                System.out.println("end insertIntoArray sortnums " + sortnums + ", num = " + num + ", i = " + insertindex);
                return insertindex;
            }
        }
    }
}

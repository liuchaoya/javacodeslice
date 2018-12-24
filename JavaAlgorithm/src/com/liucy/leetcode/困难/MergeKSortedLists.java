package com.liucy.leetcode.困难;

public class MergeKSortedLists {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists.length == 0) {
                return null;
            }
            if (lists.length == 1) {
                return lists[0];
            }
            ListNode res = null;
            int length = lists.length / 2;
            if (lists.length % 2 == 1) {
                length += 1;
            }
            ListNode[] listsres = new ListNode[length];
            int index = 0;
            for (int i = 0; i < length; i++) {
                index = i * 2;
                if (index + 1 >= lists.length) {
                    listsres[i] = lists[index];
                } else {
                    listsres[i] = mergeTwo(lists[index], lists[index + 1]);
                }
            }
            return mergeKLists(listsres);
        }

        public static ListNode mergeTwo(ListNode left, ListNode right) {
            ListNode res = null;
            ListNode first = null;
            if (left == null) {
                return right;
            }
            if (right == null) {
                return left;
            }
            if (left.val < right.val) {
                res = left;
                left = left.next;
            } else {
                res = right;
                right = right.next;
            }
            first = res;

            while (left != null || right != null) {
                if (left == null) {
                    res.next = right;
                    break;
                }
                if (right == null) {
                    res.next = left;
                    break;
                }
                if (left.val < right.val) {
                    res.next = left;
                    res = res.next;
                    left = left.next;
                } else {
                    res.next = right;
                    res = res.next;
                    right = right.next;
                }
            }
            return first;
        }
    }
}

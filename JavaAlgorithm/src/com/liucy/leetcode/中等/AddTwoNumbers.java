package com.liucy.leetcode.中等;

public class AddTwoNumbers {

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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null || l2 == null) {
                return null;
            }
            ListNode first = null;
            ListNode current = first;
            int jinweishu = 0;
            while (l1 != null || l2 != null) {
                int curint = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + jinweishu;
                if (curint < 10) {
                    jinweishu = 0;
                } else {
                    curint = curint - 10;
                    jinweishu = 1;
                }
                if (first == null) {
                    // 初始化
                    first = new ListNode(curint);
                    current = first;
                } else {
                    // 正常处理
                    current.next = new ListNode(curint);
                    current = current.next;
                }
                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
            }
            if (jinweishu > 0) {
                current.next = new ListNode(jinweishu);
            }

            return first;
        }
    }
}

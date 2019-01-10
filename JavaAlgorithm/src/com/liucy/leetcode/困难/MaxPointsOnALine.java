package com.liucy.leetcode.困难;

// https://leetcode-cn.com/problems/max-points-on-a-line/
public class MaxPointsOnALine {

    public static void main(String[] args) {

        // TODO 这种情况，本解法不适用，这个斜线，有无数个方向，，，我只考虑了45度角的
//        [[1,1],[1,1],[2,3]]
        Point[] points = new Point[3]; // out = 3
        points[0] = new Point(1, 1);
        points[1] = new Point(1, 1);
        points[2] = new Point(2, 3);

        // 有不连续的
//        Point[] points = new Point[3]; // out = 3
//        points[0] = new Point(0, 0);
//        points[1] = new Point(-1, -1);
//        points[2] = new Point(2, 2);

        // 有重复的
//        Point[] points = new Point[2]; // out = 2
//        points[0] = new Point(0, 0);
//        points[1] = new Point(0, 0);

//        Point[] points = new Point[3]; // out = 3
//        points[0] = new Point(1, 1);
//        points[1] = new Point(2, 2);
//        points[2] = new Point(3, 3);

        // 有负数
//        Point[] points = new Point[3]; // out = 2
//        points[0] = new Point(0, 0);
//        points[1] = new Point(1, 1);
//        points[2] = new Point(1, -1);

//        Point[] points = new Point[6]; // out = 4
//        points[0] = new Point(1, 1);
//        points[1] = new Point(3, 2);
//        points[2] = new Point(5, 3);
//        points[3] = new Point(4, 1);
//        points[4] = new Point(2, 3);
//        points[5] = new Point(1, 4);

        int result = new Solution().maxPoints(points);
        System.out.println("result = " + result);

//        System.out.println(0b10);
//        System.out.println(0b1);
    }

    static class Solution {
        static final int s_null = 0b1; // 没有查找过
        static final int s_heng = 0b10; // 查找过横线
        static final int s_shu = 0b100; // 查找过竖线
        static final int s_downxian = 0b1000; // 查找过下斜线，斜线从左下角到右上角
        static final int s_upxian = 0b10000; // 查找过上斜线，斜线从左上角到右下角

        int xx = 0;
        int yy = 0;
        int fux = 0;
        int fuy = 0;

        public int maxPoints(Point[] points) {
            for (int i = 0; i < points.length; i++) {
                if (points[i].x > xx) {
                    xx = points[i].x;
                }
                if (points[i].y > yy) {
                    yy = points[i].y;
                }
                // 有负数
                if (points[i].x < fux) {
                    fux = points[i].x;
                }
                if (points[i].y < fuy) {
                    fuy = points[i].y;
                }
            }
            xx += 1;
            yy += 1;
            if (fux < 0) {
                fux = -fux;
            } else {
                fux = 0;
            }
            if (fuy < 0) {
                fuy = -fuy;
            } else {
                fuy = 0;
            }
            xx += fux;
            yy += fuy;
            System.out.println(xx + ", " + yy);
            int[][] arrays = new int[xx][yy]; // 点数
            int[][] flagArrays = new int[xx][yy]; // 是否搜索过
            for (int i = 0; i < points.length; i++) {
                int x = points[i].x + fux;
                int y = points[i].y + fuy;
                flagArrays[x][y] = s_null;
                arrays[x][y] += 1;
            }

            int cur_max_length = 0;
            for (int i = 0; i < points.length; i++) {
                int x = points[i].x + fux;
                int y = points[i].y + fuy;
                int value = flagArrays[x][y];

//                System.out.println("x:" + x + ", y:" + y + ", value = " + value + ", cur_max_length = " + cur_max_length);

                if ((value & s_heng) == 0) {
                    int heng = doHeng(arrays, flagArrays, x, y);
                    if (heng > cur_max_length) {
                        cur_max_length = heng;
                    }
                    value = value | s_heng;
                }
                if ((value & s_shu) == 0) {
                    int shu = doShu(arrays, flagArrays, x, y);
                    if (shu > cur_max_length) {
                        cur_max_length = shu;
                    }
                    value = value | s_shu;
                }
                if ((value & s_downxian) == 0) {
                    int downxian = doDownXian(arrays, flagArrays, x, y);
                    if (downxian > cur_max_length) {
                        cur_max_length = downxian;
                    }
                    value = value | s_downxian;
                }
                if ((value & s_upxian) == 0) {
                    int upxian = doUpXian(arrays, flagArrays, x, y);
                    if (upxian > cur_max_length) {
                        cur_max_length = upxian;
                    }
                    value = value | s_upxian;
                }
            }
            return cur_max_length;
        }

        // 横向查找
        private int doHeng(int[][] arrays, int[][] flagArrays, final int x, final int y) {
            int length = arrays[x][y];
            // y 不变，x递增
            int xUp = x;
            while (xUp + 1 < xx) {
                flagArrays[xUp + 1][y] |= s_heng;
                length += arrays[xUp + 1][y];
                xUp++;
            }
            // y 不变，x递减
            int xDown = x;
            while (xDown - 1 >= 0) {
                flagArrays[xDown - 1][y] |= s_heng;
                length += arrays[xDown - 1][y];
                xDown--;
            }
            return length;
        }

        // 竖向查找
        private int doShu(int[][] arrays, int[][] flagArrays, final int x, final int y) {
            int length = arrays[x][y];
            // x 不变，y递增
            int yUp = y;
            while (yUp + 1 < yy) {
                flagArrays[x][yUp + 1] |= s_shu;
                length += arrays[x][yUp + 1];
                yUp++;
            }
            // x 不变，y递减
            int yDown = y;
            while (yDown - 1 >= 0) {
                flagArrays[x][yDown - 1] |= s_shu;
                length += arrays[x][yDown - 1];
                yDown--;
            }
            return length;
        }

        // 下斜线，斜线从左下角到右上角
        private int doDownXian(int[][] arrays, int[][] flagArrays, final int x, final int y) {
            int length = arrays[x][y];
            // x和y同时递增
            int xUp = x;
            int yUp = y;
            while (xUp + 1 < xx && yUp + 1 < yy) {
                flagArrays[xUp + 1][yUp + 1] |= s_downxian;
                length += arrays[xUp + 1][yUp + 1];
                xUp++;
                yUp++;
            }
            // x和y同时递减
            int xDown = x;
            int yDown = y;
            while (xDown - 1 >= 0 && yDown - 1 >= 0) {
                flagArrays[xDown - 1][yDown - 1] |= s_downxian;
                length += arrays[xDown - 1][yDown - 1];
                xDown--;
                yDown--;
            }
            return length;
        }

        // 上斜线，斜线从左上角到右下角
        private int doUpXian(int[][] arrays, int[][] flagArrays, final int x, final int y) {
            int length = arrays[x][y];
            // x递增，y递减
            int xUp = x;
            int yDown = y;
            while (xUp + 1 < xx && yDown - 1 >= 0) {
                flagArrays[xUp + 1][yDown - 1] |= s_upxian;
                length += arrays[xUp + 1][yDown - 1];
                xUp++;
                yDown--;
            }
            // x递减，y递增
            int xDown = x;
            int yUp = y;
            while (xDown - 1 >= 0 && yUp + 1 < yy) {
                flagArrays[xDown - 1][yUp + 1] |= s_upxian;
                length += arrays[xDown - 1][yUp + 1];
                xDown--;
                yUp++;
            }
            return length;
        }
    }

    /**
     * 限于理解题目的问题，只解决了0度，90度，45度和135度角度直线问题
     */
    static class SolutionOld {
        static final int s_null = 0b1; // 没有查找过
        static final int s_heng = 0b10; // 查找过横线
        static final int s_shu = 0b100; // 查找过竖线
        static final int s_downxian = 0b1000; // 查找过下斜线，斜线从左下角到右上角
        static final int s_upxian = 0b10000; // 查找过上斜线，斜线从左上角到右下角

        int xx = 0;
        int yy = 0;
        int fux = 0;
        int fuy = 0;

        public int maxPoints(Point[] points) {
            for (int i = 0; i < points.length; i++) {
                if (points[i].x > xx) {
                    xx = points[i].x;
                }
                if (points[i].y > yy) {
                    yy = points[i].y;
                }
                // 有负数
                if (points[i].x < fux) {
                    fux = points[i].x;
                }
                if (points[i].y < fuy) {
                    fuy = points[i].y;
                }
            }
            xx += 1;
            yy += 1;
            if (fux < 0) {
                fux = -fux;
            } else {
                fux = 0;
            }
            if (fuy < 0) {
                fuy = -fuy;
            } else {
                fuy = 0;
            }
            xx += fux;
            yy += fuy;
            System.out.println(xx + ", " + yy);
            int[][] arrays = new int[xx][yy]; // 点数
            int[][] flagArrays = new int[xx][yy]; // 是否搜索过
            for (int i = 0; i < points.length; i++) {
                int x = points[i].x + fux;
                int y = points[i].y + fuy;
                flagArrays[x][y] = s_null;
                arrays[x][y] += 1;
            }

            int cur_max_length = 0;
            for (int i = 0; i < points.length; i++) {
                int x = points[i].x + fux;
                int y = points[i].y + fuy;
                int value = flagArrays[x][y];

//                System.out.println("x:" + x + ", y:" + y + ", value = " + value + ", cur_max_length = " + cur_max_length);

                if ((value & s_heng) == 0) {
                    int heng = doHeng(arrays, flagArrays, x, y);
                    if (heng > cur_max_length) {
                        cur_max_length = heng;
                    }
                    value = value | s_heng;
                }
                if ((value & s_shu) == 0) {
                    int shu = doShu(arrays, flagArrays, x, y);
                    if (shu > cur_max_length) {
                        cur_max_length = shu;
                    }
                    value = value | s_shu;
                }
                if ((value & s_downxian) == 0) {
                    int downxian = doDownXian(arrays, flagArrays, x, y);
                    if (downxian > cur_max_length) {
                        cur_max_length = downxian;
                    }
                    value = value | s_downxian;
                }
                if ((value & s_upxian) == 0) {
                    int upxian = doUpXian(arrays, flagArrays, x, y);
                    if (upxian > cur_max_length) {
                        cur_max_length = upxian;
                    }
                    value = value | s_upxian;
                }
            }
            return cur_max_length;
        }

        // 横向查找
        private int doHeng(int[][] arrays, int[][] flagArrays, final int x, final int y) {
            int length = arrays[x][y];
            // y 不变，x递增
            int xUp = x;
            while (xUp + 1 < xx) {
                flagArrays[xUp + 1][y] |= s_heng;
                length += arrays[xUp + 1][y];
                xUp++;
            }
            // y 不变，x递减
            int xDown = x;
            while (xDown - 1 >= 0) {
                flagArrays[xDown - 1][y] |= s_heng;
                length += arrays[xDown - 1][y];
                xDown--;
            }
            return length;
        }

        // 竖向查找
        private int doShu(int[][] arrays, int[][] flagArrays, final int x, final int y) {
            int length = arrays[x][y];
            // x 不变，y递增
            int yUp = y;
            while (yUp + 1 < yy) {
                flagArrays[x][yUp + 1] |= s_shu;
                length += arrays[x][yUp + 1];
                yUp++;
            }
            // x 不变，y递减
            int yDown = y;
            while (yDown - 1 >= 0) {
                flagArrays[x][yDown - 1] |= s_shu;
                length += arrays[x][yDown - 1];
                yDown--;
            }
            return length;
        }

        // 下斜线，斜线从左下角到右上角
        private int doDownXian(int[][] arrays, int[][] flagArrays, final int x, final int y) {
            int length = arrays[x][y];
            // x和y同时递增
            int xUp = x;
            int yUp = y;
            while (xUp + 1 < xx && yUp + 1 < yy) {
                flagArrays[xUp + 1][yUp + 1] |= s_downxian;
                length += arrays[xUp + 1][yUp + 1];
                xUp++;
                yUp++;
            }
            // x和y同时递减
            int xDown = x;
            int yDown = y;
            while (xDown - 1 >= 0 && yDown - 1 >= 0) {
                flagArrays[xDown - 1][yDown - 1] |= s_downxian;
                length += arrays[xDown - 1][yDown - 1];
                xDown--;
                yDown--;
            }
            return length;
        }

        // 上斜线，斜线从左上角到右下角
        private int doUpXian(int[][] arrays, int[][] flagArrays, final int x, final int y) {
            int length = arrays[x][y];
            // x递增，y递减
            int xUp = x;
            int yDown = y;
            while (xUp + 1 < xx && yDown - 1 >= 0) {
                flagArrays[xUp + 1][yDown - 1] |= s_upxian;
                length += arrays[xUp + 1][yDown - 1];
                xUp++;
                yDown--;
            }
            // x递减，y递增
            int xDown = x;
            int yUp = y;
            while (xDown - 1 >= 0 && yUp + 1 < yy) {
                flagArrays[xDown - 1][yUp + 1] |= s_upxian;
                length += arrays[xDown - 1][yUp + 1];
                xDown--;
                yUp++;
            }
            return length;
        }
    }

    static class Point {
        int x;
        int y;

        Point() {
            x = 0;
            y = 0;
        }

        Point(int a, int b) {
            x = a;
            y = b;
        }
    }
}

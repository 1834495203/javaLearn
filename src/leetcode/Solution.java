package leetcode;

import leetcode.model.ListNode;

public interface Solution {

    /**
     * 统计同位异构字符串数目
     * 比方说，"acb dfe" 是 "abc def" 的同位异构字符串，但是 "def cab" 和 "adc bef" 不是。
     * @param s 给你一个字符串 s ，它包含一个或者多个单词。单词之间用单个空格 ' ' 隔开。
     * @return 请你返回 s 的同位异构字符串的数目，由于答案可能很大，请你将它对 10e9 + 7 取余 后返回。
     */
    int countAnagrams(String s);

    /**
     * @param flowerbed 整数数组  flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。
     * @param n 另有一个数 n ，能否在不打破种植规则的情况下种入 n 朵花？
     * @return 能则返回 true ，不能则返回 false。
     */
    boolean canPlaceFlowers(int[] flowerbed, int n);

    /**
     * 给你一个 n x n 的二进制矩阵 grid 中，返回矩阵中最短 畅通路径 的长度。如果不存在这样的路径，返回 -1 。
     * 该路径同时满足下述要求：
     * 1. 路径途经的所有单元格都的值都是 0 。
     * 2. 路径中所有相邻的单元格应当在8个方向之一上连通（即，相邻两单元之间彼此不同且共享一条边或者一个角）。
     * @param grid 二进制矩阵中的 畅通路径 是一条从左上角单元格（即，(0, 0)）到 右下角 单元格（即，(n - 1, n - 1)）的路径
     * @return 该路径途经的单元格总数。
     */
    int shortestPathBinaryMatrix(int[][] grid);

    /**
     * 如果第 i 个字符是 'Y' ，它表示第 i 小时有顾客到达。
     * 如果第 i 个字符是 'N' ，它表示第 i 小时没有顾客到达。
     * 如果商店在第 j 小时关门（0 <= j <= n），代价按如下方式计算：
     *
     * 在开门期间，如果某一个小时没有顾客到达，代价增加 1 。
     * 在关门期间，如果某一个小时有顾客到达，代价增加 1 。
     *
     * 注意，商店在第 j 小时关门表示在第 j 小时以及之后商店处于关门状态。
     * @param customers 给你一个顾客访问商店的日志，用一个下标从 0 开始且只包含字符 'N' 和 'Y' 的字符串 customers 表示：
     * @return 请你返回在确保代价 最小 的前提下，商店的 最早 关门时间。
     */
    int bestClosingTime(String customers);

    /**
     * 如果字符串中不含有任何 'aaa'，'bbb' 或 'ccc' 这样的字符串作为子串，那么该字符串就是一个「快乐字符串」。
     *
     * 给你三个整数 a，b ，c，请你返回 任意一个 满足下列全部条件的字符串
     * @param a 整数
     * @param b 整数
     * @param c 整数
     * @return 是一个尽可能长的快乐字符串.如果不存在这样的字符串 s ，请返回一个空字符串 ""。
     */
    String longestDiverseString(int a, int b, int c);

    /**
     * 1828
     * 对于每一个查询 queries[j] ，计算在第 j 个圆 内 点的数目。如果一个点在圆的 边界上 ，我们同样认为它在圆 内 。
     * @param points 其中 points[i] = [xi, yi] ，表示第 i 个点在二维平面上的坐标。多个点可能会有 相同 的坐标。
     * @param queries 其中 queries[j] = [xj, yj, rj] ，表示一个圆心在 (xj, yj) 且半径为 rj 的圆。
     * @return 请你返回一个数组 answer ，其中 answer[j]是第 j 个查询的答案。
     */
    int[] countPoints(int[][] points, int[][] queries);

    /**
     * 1013
     * 给你一个整数数组 arr，只有可以将其划分为三个和相等的 非空 部分时才返回 true，否则返回 false。
     * @param arr 整数数组
     * @return 只有可以将其划分为三个和相等的 非空 部分时才返回 true，否则返回 false。
     */
    boolean canThreePartsEqualSum(int[] arr);

    /**
     * 078
     * @param lists 给定一个链表数组，每个链表都已经按升序排列。
     * @return 请将所有链表合并到一个升序链表中，返回合并后的链表。
     */
    ListNode mergeKLists(ListNode[] lists);

    /**
     * 选出一个正整数 x ，x 需要小于或等于 nums 中 最小 的 非零 元素。
     * nums 中的每个正整数都减去 x。
     * @param nums 非负整数数组 nums
     * @return 返回使 nums 中所有元素都等于 0 需要的 最少 操作数。
     */
    int minimumOperations(int[] nums);

    /**
     * 给你一个字符串 s
     * @param s 其中包含字母顺序打乱的用英文单词表示的若干数字（0-9）。
     * @return 按 升序 返回原始的数字。
     */
    String originalDigits(String s);

    /**
     * 给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。
     * @param a 二进制字符串
     * @param b 二进制字符串
     * @return 它们的和
     */
    String addBinary(String a, String b);
}

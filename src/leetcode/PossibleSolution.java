package leetcode;

import leetcode.model.ListNode;
import leetcode.model.TreeNode;

import java.io.Serializable;
import java.util.*;

public class PossibleSolution implements Solution, Serializable {
    @Override
    public int countAnagrams(String s) {
        String[] split = s.split(" ");
        System.out.println(split[0]);
        return 0;
    }

    @Override
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int can = 0;
        int b = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && b == 0 && (i+1 == flowerbed.length || flowerbed[i+1] == 0)){
                can += 1;
                b = 1;
            } else if (flowerbed[i] == 1) b = 1;
            else if (flowerbed[i] == 0) b = 0;
        }

        return can >= n;
    }

    @Override
    public int shortestPathBinaryMatrix(int[][] grid) {
        return 0;
    }

    @Override
    public int bestClosingTime(String customers) {

        int time = 0;
        int min = 0;
        int cost = 0;
        char[] c = customers.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'N') cost -= 1;
            else cost += 1;
            if (min < cost){
                min = cost;
                time = i+1;
            }
        }

        return time;
    }

    @Override
    public String longestDiverseString(int a, int b, int c) {
        char l = 'a';
        char[] str;
        int m = a, index = 2, len, k = 0, to;
        ArrayList<Character> ch = new ArrayList<>();
        LinkedList<Character> li;

        if (Integer.max(a, c) < b) {
            l = 'b';
            m = b;
        } else if (Integer.max(a, b) < c) {
            l = 'c';
            m = c;
        }
        if (m/3 >= (to=a+b+c-m) && m != 3) m = 2*(to+1);

        for (int i = 0; i < m; i++) ch.add(l);
        li = new LinkedList<>(ch);
        len = li.size();
        while (to-- >= 0){
            if (l != 'a' && a-- > 0) li.add(index, 'a');
            else if (l != 'b' && b-- > 0) li.add(index, 'b');
            else if (l != 'c' && c-- > 0) li.add(index, 'c');
            if (index == len) index = k;
            else if (index+3+k >= (len=li.size())) {
                index = len;
                k++;
            }else index += (3+k);
        }
        str = new char[len];
        for (int i = 0; i < len; i++) str[i] = li.get(i);
        return String.valueOf(str);
    }

    @Override
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] o = new int[queries.length];
        double l;
        for (int i = 0; i < queries.length; i++) {
            for (int[] point : points) {
                l = Math.sqrt(Math.pow(queries[i][0] - point[0], 2) + Math.pow(queries[i][1] - point[1], 2));
                if (l <= queries[i][2])
                    o[i]++;
            }
        }
        return o;
    }

    @Override
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0, count = 0;
        for (int value : arr) sum += value;
        if (sum % 3 == 0){
            int i = sum/3, k = 0;
            for (int value : arr) {
                count += value;
                if (count == i) {
                    k++;
                    count = 0;
                }
                if (k == 3) return true;
            }
        }
        return false;
    }

    @Override
    public ListNode mergeKLists(ListNode[] lists) {
        return null;
    }

    @Override
    public int minimumOperations(int[] nums) {
        ArrayList<Integer> i = new ArrayList<>(nums.length);
        for (int num : nums) if (num != 0 && !i.contains(num)) i.add(num);
        return i.size();
    }

    @Override
    public String originalDigits(String s) {
        String[] a = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Integer[] c = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        HashMap<String, Integer> h = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            h.put(a[i], c[i]);
        }
        return null;
    }

    @Override
    public String addBinary(String a, String b) {

        return null;
    }

    @Override
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] clone = nums1.clone();
        int i = 0, j = 0, k = 0;
        while (i < m && j < n){
            if (clone[i] > nums2[j]) nums1[k++] = nums2[j++];
            else if (clone[i] <= nums2[j]) nums1[k++] = clone[i++];
        }
        int t = i+j;
        if (i != m) for (int l = i; l < m; l++) nums1[t++] = clone[l];
        else if (j != n) for (int l = j; l < n; l++) nums1[t++] = nums2[l];
    }

    @Override
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while (p != null && p.next != null){
            if (p.val == p.next.val) p.next = p.next.next;
            else p = p.next;
        }
        return head;
    }

    @Override
    public int climbStairs(int n) {
        int p, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    @Override
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int ans = (int) Math.exp(0.5 * Math.log(x));
        return (long) (ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
    }

    private final List<Integer> arr = new ArrayList<>();

    private void tree(TreeNode root){
        if (root != null){
            tree(root.left);
            if (root.left == null && root.right != null) arr.add(-1);
            arr.add(root.val);
            tree(root.right);
            if (root.right == null && root.left != null) arr.add(-1);
        }
    }

    @Override
    public boolean isSymmetric(TreeNode root) {
        tree(root);
        System.out.println(arr);
        for (int i = 0; i < arr.size()/2; i++)
            if (!arr.get(arr.size()-i-1).equals(arr.get(i))) return false;
        return true;
    }

    @Override
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int[] ints = new int[k];
        int i = 0;
        for (Object o : set.toArray()) {
            if (i == k) break;
            ints[i++] = (int) o;
        }
        return ints;
    }
}


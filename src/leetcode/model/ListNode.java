package leetcode.model;

import orgin.List;

/**
 * 链表节点
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createList(int... args){
        ListNode listNode = new ListNode(args[0]);
        ListNode p = listNode;
        for (int i = 1; i < args.length; i++) {
            p.next = new ListNode();
            p.next.val = args[i];
            p = p.next;
        }
        return listNode;
    }
}

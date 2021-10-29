package com.leetcode;

public class SplitLinkedListinParts {
    public static void main(String[] args) {
//        splitListToParts(new ListNode(1).next(new ListNode(2)),7);
    }
    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode clone = head;
        ListNode[] listNodes = new ListNode[k];

        //find length of the node
        int length = 0;
        while (clone!=null) {
            length++;
            if (clone.next!=null) clone = clone.next;
            else break;
        }
        System.out.println("length of the linkedList is"+length);
        //find mode and find division
        int division = length/k;
        int mod = length % k;
        System.out.println("division is "+division+"  and mode is -> "+mod);
        clone = head;
        int size = 0;
        for(int i =0;i<length;i++) {
            int extra = 0;
            if(mod>0) mod --; extra = 1;
            for(int j=0;j<division+extra;j++) {
                if (listNodes[size] == null) listNodes[size] = new ListNode(head.val);
                else listNodes[size] = listNodes[size].next = new ListNode(head.val);
                head = head.next;
            }
            size++;
        }
        return listNodes;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
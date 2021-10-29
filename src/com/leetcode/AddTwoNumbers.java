package com.leetcode;


//  Definition for singly-linked list.
   class ListNode {
            int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class AddTwoNumbers {
    public static void main(String[] args) {

    }
    public static ListNodes addTwoNumbers(ListNodes l1, ListNodes l2) {
        ListNodes listNode = new ListNodes();
        int num1 = getNumber(l1);
        int num2 = getNumber(l2);
        return listNode;
    }
    public static int getNumber(ListNodes l1) {
        //list = 465
        int num =0;
        if(l1==null) {
            return 0;
        }
        while(l1.next!=null) {
            num = num + l1.val;
            l1=l1.next;
        }
        num = num + l1.val;
        num = reverseNum(num);
        return  num;
    }

    public static int reverseNum(int num) {
//        int num =0;
        return num;
    }
}

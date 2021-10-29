package com.leetcode;

//  Definition for singly-linked list.
class ListNodes {
    int val;
    ListNodes next;

    ListNodes() {
    }

    ListNodes(int val) {
        this.val = val;
    }

    ListNodes(int val, ListNodes next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveNthNodeFromEndofList {

    public static void main(String[] args) {

    }
    public ListNodes removeNthFromEnd(ListNodes head, int n) {
        //take a variable to store the root element
        ListNodes root = head;
        //count the number of nodes
        int count = 0;
        while(head.next!=null) {
            count ++;
            head = head.next;
        }
        head = root;

        //Transversing to the location of the array
        for(int i=0;i<count-n-1;i++) {
            head = head.next;
        }

        //deleting the element from the array
        head.val = head.next.val;
        head.next= head.next.next;

        return head;
    }
}

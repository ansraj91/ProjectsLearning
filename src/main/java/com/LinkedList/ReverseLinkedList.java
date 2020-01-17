package com.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

    static class ListNode{
         int val;
         ListNode next;
         ListNode(int data){
             this.val = data;
         }
    }

    public static ListNode solve(ListNode A){

        ListNode head = null;
        ListNode prev = null;
        while(A!=null){
            prev = new ListNode(A.val);
            prev.next = head;
            head = prev;
            A= A.next;

        }

        //traverse(head);

        return head;



    }
    public static void traverse(ListNode h){
        while (h!=null){
            System.out.print(h.val+" ");
            h = h.next;

        }
    }

    public static void main(String[] args) {
      ListNode node = new ListNode(8);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(5);
        node.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next = new ListNode(4);
        traverse(node);
        System.out.println();
        traverse(solve(node));
    }
}

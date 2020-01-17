package com.LinkedList;

public class InsertionSort {


    //using Data

    static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
        }
    }

    public static void sort(ListNode A){
        if(A==null) return ;
        ListNode next = A.next;
        while(next!=null){
            ListNode curr = A;
            while(curr!=next){
                if(curr.data > next.data){
                    int data = curr.data;
                    curr.data = next.data;
                    next.data = data;


                }
                curr = curr.next;
            }

            next = next.next;
        }

    }

    public static void traverse(ListNode node){
        ListNode t = node;
        while (t!=null){
            System.out.println(t.data);
            t = t.next;
        }
    }


    public static void main(String[] args) {
        ListNode node = new ListNode(8);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(5);
        node.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next = new ListNode(4);

        sort(node);

        traverse(node);



    }


}

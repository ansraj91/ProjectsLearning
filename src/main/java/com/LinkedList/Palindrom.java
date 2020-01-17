package com.LinkedList;

public class Palindrom {

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }


    Node left;
    Node head;
    public int solve(Node head){
        this.head = head;
        return isPallindrom(head);
    }

    public int isPallindrom(Node right){
        this.left = head;
        if(right==null) return 1;

        int isp = isPallindrom(right.next);
        if(isp!=1) return isp;

        int r = 0;
        if( right.data==left.data){
            r=1;
        }

        left = left.next;

        return r;



    }

}

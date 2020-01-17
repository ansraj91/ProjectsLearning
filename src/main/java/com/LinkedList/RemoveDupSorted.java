package com.LinkedList;

public class RemoveDupSorted {

    static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data = data;
        }
    }


    public static void removeDuplicate(Node A){
        Node curr = A;
        Node next = A.next;

        while(A!=null && next!=null){
            if(curr.data==next.data){
                next = next.next;
                curr.next = next;
                continue;
            }
            curr = curr.next;
            next = next.next;
        }
    }


    public static void traverse(Node node){
        Node t = node;
        while (t!=null){
            System.out.println(t.data);
            t = t.next;
        }
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(2);
        node.next.next.next = new Node(5);
        node.next.next.next.next = new Node(4);
        node.next.next.next.next.next = new Node(4);

        removeDuplicate(node);
        traverse(node);

    }



}

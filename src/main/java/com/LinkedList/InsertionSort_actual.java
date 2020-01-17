package com.LinkedList;

public class InsertionSort_actual {


    static class  Node {
        int data;
        Node next;
        public Node(){

        }
        public Node(int data){
            this.data  = data;
        }
    }



    public  Node insertionSort(Node node){
        if(node == null) return node;
        Node curr = node;
        Node sorted=null;

        while(curr!=null){
            sorted = sortPush(sorted,curr.data);
            curr = curr.next;
        }

        return sorted;

    }

    public  Node sortPush(Node sorted, int data){
        if(sorted==null){
            sorted = new Node(data);
            return sorted;

        }
        if(sorted.data>=data){
            Node head = new Node(data);
            head.next = sorted;
            sorted = head;
            return sorted;

        }
        Node curr = sorted;
        Node currNext = sorted.next;
        while(currNext!=null){
            if(currNext.data<data){
                curr = currNext;
                currNext = currNext.next;

                continue;
            }

           Node tem = new Node(data);
            tem = currNext;
            curr.next = tem;
            break;
        }


        return sorted;
    }

    public static void traverse(Node node){
        Node t = node;
        while (t!=null){
            System.out.println(t.data);
            t = t.next;
        }
    }

    public static void main(String[] args) {
        InsertionSort_actual insertionSort_actual = new InsertionSort_actual();
        Node node = new Node(8);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(5);
        node.next.next.next.next = new Node(4);
        node.next.next.next.next.next = new Node(4);
        insertionSort_actual.traverse(node);

        System.out.println();

       // insertionSort_actual.insertionSort(node);

        insertionSort_actual.traverse( insertionSort_actual.insertionSort(node));
    }
}

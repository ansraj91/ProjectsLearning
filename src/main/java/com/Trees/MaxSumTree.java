package com.Trees;


public class MaxSumTree {

//work only for positive numbers
    static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data){
            this.data = data;
        }

    }
    public static Node root;
    public int maxSum(Node root, int sum){
        if(root==null) return 0;
        int sum1= 0;
        int sum2 = 0;

        return Math.max(root.data+maxSum(root.left,sum1),root.data+maxSum(root.right,sum2));
    }


    public static void main(String[] args) {
        int sum = 0;
        MaxSumTree tree = new MaxSumTree();
        tree.root = new Node(15);
        tree.root.left = new Node(5);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(1);
        tree.root.left.left.left = new Node(2);
        tree.root.left.left.right = new Node(6);
        tree.root.right.left = new Node(3);
        tree.root.right.right = new Node(9);
        tree.root.right.right.right = new Node(0);
        tree.root.right.right.right.left = new Node(4);
        tree.root.right.right.right.right = new Node(1);
        tree.root.right.right.right.right.left = new Node(10);
        System.out.println("Max pathSum of the given binary tree is "
                + tree.maxSum(root,sum));

    }

}

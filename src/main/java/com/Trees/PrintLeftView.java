package com.Trees;

public class PrintLeftView {

    static class  Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right=  null;
        }
    }


    public static void solve(Node root){
        if(root == null) return;

        if(root.left!=null) {
            System.out.println(root.left.data);
            solve(root.left);
        }
        if(root.right!=null){
            solve(root.right);
        }

    }

    Node root;
    public static void main(String[] args) {
        PrintLeftView tree = new PrintLeftView();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);

        tree.solve(tree.root);
    }


}

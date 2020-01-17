package com.Trees;

public class BSTFromPreorderTraversal {

   static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static void inorder(Node node){
        if(node == null) return;
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);

    }
    public static Node solve(int preOrder[], int start, int end){
        if(end<start) return null;

        Node node = new Node(preOrder[start]);

        int i=start;
        for(i=start;i<=end;i++){
            if(node.data<preOrder[i]) break;
        }

        node.left = solve(preOrder,start+1,i-1);
        node.right = solve(preOrder,i, end);

        return node;

    }

    public static void main(String[] args) {
        int pre[] = {15,10,8,12,20,16,25};
        Node root = solve(pre,0,pre.length-1);
        inorder(root);

    }

}

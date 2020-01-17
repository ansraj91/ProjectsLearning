package com.Company.FlipkartPractice.Tree.Traversal.DFS;

import com.Company.FlipkartPractice.FStack.Stack.FStack;

public class PostOrder {

    public static void recursiveTraverse(Node node){
        if(node ==null) return;

        recursiveTraverse(node.left);
        recursiveTraverse(node.right);
        System.out.println(node);
    }

    public static void iterativeTraverse(Node node){
        FStack<Node> stack1 = new FStack <>();
        FStack<Node> stack2 = new FStack <>();
        stack1.push(node);

        while(!stack1.isEmpty()){
            Node tme = stack1.pop();
            stack2.push(tme);
            if(tme.left!=null){
                stack1.push(tme.left);
            }
            if(tme.right!=null){
                stack1.push(tme.right);
            }
        }

        stack2.traverse();

    }

    public static void main(String[] args) {
        Node root = new Node("1");
        root.left = new Node("2");
        root.right = new Node("3");
        root.left.left = new Node("4");
        root.left.right = new Node("5");

        System.out.println("Recursively traversed--");
        recursiveTraverse(root);
        System.out.println("Iterative traversed--");
        iterativeTraverse(root);
    }
}

package com.Company.FlipkartPractice.Tree.Traversal.DFS;

import com.Company.FlipkartPractice.FStack.Stack.FStack;

public class PreOrder {

    public static void recursiveTraverse(Node node){
        if(node == null){
            return;
        }

        System.out.println(node.toString());
        recursiveTraverse(node.left);
        recursiveTraverse(node.right);

    }

    public static void iterativeTraverse(Node node){

        FStack<Node> fStack = new FStack <>();
        fStack.push(node);

        while(!fStack.isEmpty()){
            Node tem = fStack.pop();
            System.out.println(tem.data);
            if(tem.right!=null){

                fStack.push(tem.right);
            }
            if(tem.left!=null){

                fStack.push(tem.left);
            }

        }


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

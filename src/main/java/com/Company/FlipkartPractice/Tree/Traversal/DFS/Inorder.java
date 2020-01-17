package com.Company.FlipkartPractice.Tree.Traversal.DFS;

import com.Company.FlipkartPractice.FStack.Stack.FStack;

public class Inorder {

    public static void recursiveTraverse(Node node){
        if(node==null){
            return;
        }

        recursiveTraverse(node.left);
        System.out.println(node.data);
        recursiveTraverse(node.right);
    }

    public static void iterativeTraverse(Node node){
        FStack<Node> stack = new FStack <>();
        Node tem = node;
        stack.push(node);
        while(tem.left!=null){
            tem = tem.left;
            stack.push(tem);
        }
        while(!stack.isEmpty()){
            Node tmep = stack.pop();
            System.out.println(tmep);
            if(tmep.right!=null){
                tmep = tmep.right;
                while(tmep!=null){
                    stack.push(tmep);
                    tmep = tmep.left;
                }
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

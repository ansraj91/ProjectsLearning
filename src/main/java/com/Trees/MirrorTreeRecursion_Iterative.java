package com.Trees;

public class MirrorTreeRecursion_Iterative {

    static class Node{
        Node left;
        Node right;
        int data;

        Node(Node left, Node right, int data){
            this.left = left;
            this.right = right;
            this.data = data;
        }
    }


    public static Node mirrorTree(Node node){
        if(node == null) return null;

        mirrorTree(node.left);
        mirrorTree(node.right);

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        return node;

    }

    public
    static Node createBST(Node node, int data){
        if(node == null){
            node = new Node(null,null,data);
            return node;
        }
        if(node.data>data){
            node.left =  createBST(node.left,data);
        }else{
            node.right = createBST(node.right,data);
        }
        return node;

    }

    public static void main(String[] args) {
        Node node = null;
        createBST(node,15);
        createBST(node,10);
        createBST(node,2);
        createBST(node,0);
        createBST(node,23);

        mirrorTree(node);


    }

    public static boolean checkIfMirror(Node node1, Node node2){
        if(node1==null && node2 == null) return true;


        if((node1!=null && node2!=null) && (node1.data == node2.data)){
            return checkIfMirror(node1.left,node2.right) && checkIfMirror(node1.right,node2.left);
        }

        return false;

    }


}

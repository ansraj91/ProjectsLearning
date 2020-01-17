package com.Company.FlipkartPractice.Tree.Traversal.DFS;

public final class Node {
    String data;
    Node right;
    Node left;
    Node(){

    }
    Node(String data){
        this.left = left;
        this.right  =right;
        this.data = data;
    }
    @Override
    public String toString(){
        return this.data;
    }

}

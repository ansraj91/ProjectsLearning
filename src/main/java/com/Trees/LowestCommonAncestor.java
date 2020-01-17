package com.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.IntStream;

public class LowestCommonAncestor {

    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data  = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean findPath(Node root, int n, List<Node> list){


        if(root == null) return false;

        list.add(root);

        if(root.data == n){
            return true;
        }

        if(root.left!=null && findPath(root.left, n, list)){
            return true;

        }
        if(root.right!=null && findPath(root.right , n,list)){
            return true;
        }

        list.remove(list.size()-1);
        return false;

    }

    public static void  lowestCommonAncestor_sloved(Node node, int d1, int d2){
        if(node == null) return;
        List<Node> l1 = new ArrayList <>();
        List<Node> l2 = new ArrayList <>();
        if(!findPath(node,d1,l1) || !findPath(node,d2,l2) ) return;
        int i=0;
        for(;i<l1.size() && i<l2.size();i++){
            if(!l1.get(i).equals(l2.get(i))) {

                break;
            }
        }
        System.out.println("LowestCommon Ancestor is " + l1.get(i-1).data);

    }

    public static void graphicalRepOfTree(Node node,int height){

        Queue<Node> q= new LinkedList <Node>();
        Queue<String> sq = new LinkedList <String>();
        if(node == null){
            return;
        }

        q.add(node);
        int level = 0;
        while(!q.isEmpty()){
            Node temp = q.poll();

            if(level == 0){
                IntStream.range(0,height*2).forEach(s->System.out.print(" "));
                System.out.println(temp.data);
                level++;

            }

            if(temp.left !=null){
                q.add(temp.left);
                IntStream.range(0,(height-level)).forEach(s->System.out.print(" "));
                System.out.print(temp.left.data);
                sq.add("/");
            }
            if(temp.right !=null){
                q.add(temp.right);
                IntStream.range(0,(height*2)+level).forEach(s->System.out.print(" "));
                System.out.print(temp.right.data);
                sq.add("\\");
            }

           System.out.println("");
            //System.out.print(sq.poll());

            level++;


        }




    }
    public static int getHightOfTree(Node node){
        int height = 0;

        if(node==null) return 0;

        int lh = getHightOfTree(node.left) +1;
        int rh = getHightOfTree(node.right) +1;

        if(lh>rh){
            height+=lh;
        }else{
            height+=rh;
        }

        return height;

    }

    public static void main(String[] args) {

        Node node = new Node(10);
        node.left = new Node(4);
        node.right = new Node(8);

        node.left.left = new Node(12);
        node.left.right = new Node(6);
        node.right.right = new Node(5);
        node.right.left = new Node(3);

        node.left.left.right = new Node(23);
        node.right.left.right = new Node(56);

        lowestCommonAncestor_sloved(node, 3,5);


    }


}

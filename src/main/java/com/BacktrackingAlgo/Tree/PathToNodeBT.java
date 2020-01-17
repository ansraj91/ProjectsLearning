package com.BacktrackingAlgo.Tree;

import java.util.ArrayList;
import java.util.List;

public class PathToNodeBT {


    static class Node {
        static int totalNode=0;
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            totalNode++;

        }
    }
    static Node getNode(int data)
    {
        Node newNode = new Node(data);
        newNode.data = data;
        newNode.left = newNode.right = null;
        return newNode;
    }


    public static boolean path(Node root, int data,  ArrayList<Integer> pathList){

       if(root == null){
           return false;

       }
       pathList.add(root.data);
       if(root.data == data){
           return true;
       }
       if(path(root.left,data,pathList) || path(root.right,data,pathList)){
           return true;
       }
       pathList.remove(pathList.size()-1);

        return false;


    }

    public static List<Integer> printPath(Node root, int data){
        ArrayList<Integer> list = new ArrayList <>();
        if(path(root, data, list)){
                list.stream().forEach(System.out::print);
        }
        return list;
    }

    public static List<Integer> pathBtwTwoNodes(List<Integer> list1, List<Integer> list2){
        int size1 = list1.size();
        int size2 = list2.size();
        int len =0;
        ArrayList<Integer> path = new ArrayList <>();
        if(size1>size2){
            len = size2;

        }else{
            len = size1;
        }

        for(int i=0;i<len;i++){
            if(list1.get(--size1)== list2.get(--size2)){
                break;
            }

        }

        for(int i=list1.size()-1;i>size1;i--){
            path.add(list1.get(i));
        }
        for(int i=size2+1;i<list2.size();i++){
            path.add(list2.get(i));
        }
        return path;
    }

    public static void main(String[] args) {

        Node root = getNode(0);
        root.left = getNode(1);
        root.left.left = getNode(3);
        root.left.left.left = getNode(7);
        root.left.right = getNode(4);
        root.left.right.left = getNode(8);
        root.left.right.right = getNode(9);
        root.right = getNode(2);
        root.right.left = getNode(5);
        root.right.right = getNode(6);

        int x=7;
        List<Integer> list1 = printPath(root, x);
        System.out.println();
        int y =4;
        List<Integer> list2 = printPath(root, y);
        System.out.println();
        pathBtwTwoNodes(list1,list2).stream().forEach(System.out::print);



    }

}

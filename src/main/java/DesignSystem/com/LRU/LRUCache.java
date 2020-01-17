package DesignSystem.com.LRU;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    class Node{
        int key;
        int value;
        Node left;
        Node right;



        public  Node(int key, int value){
            this.key = key;
            this.value = value;
            this.left = null;
            this.right = null;

        }


    }


    private HashMap<Integer, Node> map;
    private static final int CACHE_SIZE = 4;
    Node start = null;
    Node end= null;


    public void addToStart(Node node){
        node.right = start;
        node.left = null;
        if(start != null){
            start.left = node;
        }
        start = node;
        if(end == null){
            end = start;
        }
    }

    public void removeNode(Node node){

       if(node.left!=null){
           node.left.right = node.right;
       }else{
           start = node.right;
       }

       if(node.right!=null){
           node.right.left = node.left;
       }else{
           end = node.left;
       }

    }

    public void putEntry(int key, int value){

        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            removeNode(node);
            addToStart(node);

        }else{
            Node node = new Node(key,value);
            map.put(key,node);
            addToStart(node);
            if(map.size()>CACHE_SIZE){
                map.remove(end.key);
                removeNode(end);

            }


        }


    }

    public int getNode(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            removeNode(node);
            addToStart(node);
            return node.value;
        }
        return -1;
    }




}

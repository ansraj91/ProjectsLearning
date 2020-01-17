package com.Trie_datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trie {

    static class Node{
        HashMap<Character, Node> children = new HashMap <>();
        boolean isWord;
        public Node(boolean isWord){
            this.isWord = true;
        }

    }



    public void addWordToTrie(Node root, String str){
        Node node = root;


        for(Character c: str.toCharArray()){
            if(!node.children.containsKey(c)){
                node.children.put(c,new Node(true));
                node.isWord = false;
            }
            node = node.children.get(c);


        }




    }

    public void searchString(Node root, String searchString){
        Node tem = root;
        for(Character c: searchString.toCharArray()){
            if(!tem.children.containsKey(c)){
                System.out.println("Not contains the String!!");
               return;
            }
            tem = tem.children.get(c);
        }
        System.out.println("String present!!");


    }
    public ArrayList<String> getHints(Node root,String searchString){
        ArrayList<String> list = new ArrayList <>();
        Node node =root;

        for(Character c: searchString.toCharArray()){
            if(node.children.containsKey(c)){
                node = node.children.get(c);
            }
        }
        /*for(Map.Entry<Character,Node> e: node.children.entrySet()){
            StringBuilder sb = new StringBuilder();

        }*/
        recursiveHintHelp(node,list,new String(searchString));
        return list;

    }

    public static void recursiveHintHelp(Node root, List<String> l1, String s1){
        if(root.isWord){
            return;
        }

        for(Map.Entry<Character,Node> e: root.children.entrySet()){
            s1+=e.getKey();
            l1.add(s1);
            recursiveHintHelp(root.children.get(e.getKey()),l1,s1);
            s1 = s1.substring(0,s1.length()-1);

        }



    }

    public static void main(String[] args) {
        Trie t = new Trie();
        Node node = new Node(true);
        String a = "abcdef";
        String ab = "abdefrd";
        String abc = "abcwqer";
        String b = "babc";
        String c = "cdef";
        String d = "defd";
        String k ="ksrcts";
        String f ="fsrcts";
        t.addWordToTrie(node,a);
        t.addWordToTrie(node,ab);
        t.addWordToTrie(node,abc);
        t.addWordToTrie(node,a);
        t.addWordToTrie(node,b);
        t.addWordToTrie(node,c);
        t.addWordToTrie(node,d);
        t.addWordToTrie(node,k);
        t.addWordToTrie(node,f);
        t.searchString(node,"abcw");
        t.getHints(node,"ab").stream().forEach(System.out::println);
    }

}

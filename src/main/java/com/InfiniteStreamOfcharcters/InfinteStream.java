package com.InfiniteStreamOfcharcters;

import java.util.LinkedList;
import java.util.Queue;

public class InfinteStream {

    static int MAX_CHARS = 256;

    static int char_count[] = new int[MAX_CHARS];

    static Queue<Character> queue = new LinkedList <>();

    public static void findFirstNonRepeatingChar(String stream){
            for(int i=0;i<stream.length();i++){
                char ch = stream.charAt(i);
                queue.add(ch);
                char_count[ch]++;
                while(!queue.isEmpty()){
                    if(char_count[queue.peek()] > 1){
                        queue.remove();
                    }else{
                        System.out.println(queue.peek()+" ");
                        break;
                    }
                }
                if(queue.isEmpty()){
                    System.out.println("-1" + " ");
                }

            }
        System.out.println();
    }

    public static void main(String[] args) {
        String str ="aabc";
        findFirstNonRepeatingChar(str);

    }


}

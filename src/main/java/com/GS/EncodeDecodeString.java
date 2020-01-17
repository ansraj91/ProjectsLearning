package com.GS;

import java.util.ArrayList;
import java.util.Stack;

public class EncodeDecodeString {

    public static String solve(String str,int x){
        char cArr[] = str.toCharArray();
        Stack<Integer> al = new Stack <>();

        while(x!=0){
            int x1 = x%10;
            al.push(x1);
            x = x/10;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<cArr.length;i++){
            if(al.size()>0){
                int y = al.pop();
                for(int k=0;k<y;k++){
                    sb.append(cArr[i]);
                }
            }else{
                sb.append(cArr[i]);
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(solve("open",123));
    }

}

package com.Stack;

import java.util.Stack;

public class MinimumNoFromGivenSeq_IIDDDDI {



    public static String solve(String str){
        Stack<Integer> res = new Stack <>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<=str.length();i++){
            res.push(i+1);

            if(i==str.length() || str.charAt(i)=='I'){

                System.out.println(res.toString());
                while(!res.isEmpty()){
                    sb.append(res.peek() +" ");
                    res.pop();
                }

            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "DDIDDIID";
        System.out.println(solve(str));
    }

}

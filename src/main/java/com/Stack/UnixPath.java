package com.Stack;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.Stack;

public class UnixPath {

    public static String getPath(String A){
        String s1[] = A.split("/");

        Stack<String> st = new Stack <>();

        for(String s: s1){
            if(s.equals("."));
            else if(s.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else if(!s.equals("")) {
                st.push(s);
            }
        }
        if(st.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        Stack<String> st2 = new Stack <>();
        while(!st.isEmpty()){

            st2.push(st.pop());
        }
        while(!st2.isEmpty()){
            sb.append("/");
            sb.append(st2.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getPath("/a/./b/..//c/"));
    }
}

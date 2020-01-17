package com.Stack;

import java.util.Stack;

public class Paranthesis {


    public static int isValid(String A) {

        Stack <Character> c1 = new Stack <>();

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '{' ||
                    A.charAt(i) == '[' ||
                    A.charAt(i) == '(') {
                c1.push(A.charAt(i));
            } else {
                char a = c1.peek();
                if (A.charAt(i) == '}' && a == '{') {
                    c1.pop();
                } else if (A.charAt(i) == ')' && a == '(') {
                    c1.pop();
                } else if(A.charAt(i)==']' && a=='['){
                    c1.pop();
                }else{
                    return 0;
                }

            }
        }
        if (!c1.isEmpty()) return 0;

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }



}

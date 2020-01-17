package com.Stack;



import java.util.Stack;

public class ReduntantBraces {



    public static int solve(String A){
        Stack<Character> brace = new Stack <>();
        Stack<Character> operation = new Stack <>();

        int open = 0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='('){
                open++;
            }
            if(A.charAt(i)=='+'||A.charAt(i)=='/'||A.charAt(i)=='-'||A.charAt(i)=='*'){
                if(open>0)
                open--;
            }
        }



        return open==0?0:1;

    }


    public static void main(String[] args) {
        String str = "(a*b)+(b*c)";

        System.out.println(solve(str));
    }

}

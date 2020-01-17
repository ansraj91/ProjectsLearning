package com.Rehersal;

import java.util.Stack;

public class DecodeEncodeString {

    public static String solve(String str){
        String result = "";
        Stack<Integer> si = new Stack <>();
        Stack<String> ss = new Stack <>();
        for(int i=0;i<str.length();i++){

            if(Character.isDigit(str.charAt(i))){
                int count = 0;
                while(Character.isDigit(str.charAt(i))){
                    count = count*10+str.charAt(i)-'0';
                    i++;
                }
                i--;
                si.push(count);
            }else if(str.charAt(i)==']'){
                String tem ="";
                int c =0 ;
                while (!ss.isEmpty() && !ss.peek().equals("[")){
                    tem = ss.peek()+tem;
                    ss.pop();
                }

                if(!ss.isEmpty() && ss.peek().equals("[")){
                    ss.pop();
                }
                if(!si.isEmpty()){
                    c = si.pop();
                }
                for(int k=0;k<c;k++){
                    result = result+tem;
                }

                for (int j = 0; j < result.length(); j++)
                    ss.push(String.valueOf(result.charAt(j)));
                result = "";

            }else if(str.charAt(i)=='['){
                if(!Character.isDigit(str.charAt(i-1))){
                    ss.push(String.valueOf(str.charAt(i)));
                    si.push(1);
                }else{
                    ss.push(String.valueOf(str.charAt(i)));
                }
            }else{
                ss.push(String.valueOf(str.charAt(i)));
            }



        }

        while(!ss.isEmpty()){
            result = ss.pop()+result;
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(solve("3[b2[ca]]"));
    }
}

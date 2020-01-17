package com.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromicPartition {

    public static boolean isPalindrome(String str){
        int len = str.length();

        for(int i=0;i<len;i++){
            if(str.charAt(i)!=str.charAt(len-1)) return false;
            len--;
        }

        return true;

    }

   public static ArrayList<ArrayList<String>> solve(String str, ArrayList<ArrayList<String>> result,  int index, ArrayList<String> temp ){

        String s="";
        ArrayList<String> current = new ArrayList <>(temp);
        int len = str.length();

        if(index==0) {
            temp.clear();
        }

        for(int i=index;i<len;i++){
            s = s+str.charAt(i);
            if(isPalindrome(s)){
                temp.add(s);
                if(i+1<len){
                   result =  solve(str,result,i+1,temp);
                }else{
                    result.add(temp);
                }

                temp = new ArrayList <>(current);
            }
        }

        return result;
   }

   public static void partitions(String str, ArrayList<ArrayList<String>> result){
           ArrayList<String> temp = new ArrayList<>();
       solve(str,result,0,temp);

       printSolution(result);

   }


    static void printSolution(ArrayList<ArrayList<String>>
                                      partitions)
    {
        for(ArrayList<String> i: partitions)
        {
            for(String j: i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> partions = new ArrayList<ArrayList<String>>();
        partitions("bcc",partions);
    }

}

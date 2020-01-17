package com.String;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MinCharReqStrToPalindrom {



    public static  int solve(String A){

        int count=0;
      while(A.length()>0){
          if(isPlindrom(A)){

              return count;
          }else{
              count++;
              A = A.substring(0,A.length()-1);
          }
      }




        return count;




    }

    public static boolean isPlindrom(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if(sb.reverse().toString().equals(str)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solve("hqghumeaylnlfdxfi"));

        //hqghumeaylnlfdxfi
    }


}

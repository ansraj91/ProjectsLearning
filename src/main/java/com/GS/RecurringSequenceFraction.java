package com.GS;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RecurringSequenceFraction {

    public String solve(int a, int b){
       long num = Math.abs(a);
       long deno = Math.abs(b);

       String sign = (num<0) ^(deno<0) ? "-":"";

       if(num<0) return "0";
       if(deno<0) return "0";

       String result = sign+String.valueOf(num/deno);

       long rem = num%deno;
       if(rem==0) return result;

       HashMap<Long,Integer> map = new HashMap <>();
       int i = 0;
       StringBuffer sb = new StringBuffer(result+".");

       while(rem!=0){
           if(map.containsKey(rem)){
               sb.insert(sb.indexOf(".")+map.get(rem)+1,"(");
               sb.append(")");
               return sb.toString();
           }
           sb.append(rem/deno);
           map.put(rem,i++);
           rem  = (rem%deno)*10;

       }

        return sb.toString();

    }

    public static void main(String[] args) {

    }





}

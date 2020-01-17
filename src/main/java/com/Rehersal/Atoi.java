package com.Rehersal;

public class Atoi {

    static int   solve(String a){

        long l = 0;
        a = a.trim();
        boolean b = false;
        int sign = 1;

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='-') sign = -sign;
            else if(a.charAt(i) == '+') sign =1;
            else if(a.charAt(i) >='0' && a.charAt(i)<='9'){
                l= l*10+(int)(a.charAt(i)-'0');

                if((sign)*(int)l >= Integer.MAX_VALUE/10) return Integer.MIN_VALUE;
                if((sign)*(int)l <= Integer.MIN_VALUE/10) return Integer.MAX_VALUE;

            }else{
               // if(!b) sign = 1;
                //if(b)
                    break;
            }

        }
       // if(l>Integer.MAX_VALUE) return Integer.MIN_VALUE;
        //if(l<Integer.MIN_VALUE) return Integer.MAX_VALUE;

        return (sign)*(int)l;


    }

    public static void main(String[] args) {
        System.out.println(solve("5121478262 8070067M75 X199R 547 8C0A11 93I630 4P4071 029W433619 M3 5 14703818 776366059B9O43393"));
    }


}

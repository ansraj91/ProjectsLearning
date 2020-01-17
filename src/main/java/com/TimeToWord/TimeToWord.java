package com.TimeToWord;

import java.util.HashMap;

public class TimeToWord {
    static String timeInWords(int h, int m) {

        String result;

        HashMap<Integer, String> mapNumberHours = new HashMap <>();

        mapNumberHours.put(0,"o' clock");
        mapNumberHours.put(1,"one");
        mapNumberHours.put(2,"two");
        mapNumberHours.put(3,"three");
        mapNumberHours.put(4,"four");
        mapNumberHours.put(5,"five");
        mapNumberHours.put(6,"six");
        mapNumberHours.put(7,"seven");
        mapNumberHours.put(8,"eight");
        mapNumberHours.put(9,"nine");
        mapNumberHours.put(10,"ten");
        mapNumberHours.put(11,"eleven");
        mapNumberHours.put(12,"twelve");

        HashMap<Integer, String> mapNumberTens = new HashMap <>();


        mapNumberTens.put(2,"twenty");
        mapNumberTens.put(3,"thirty");
        mapNumberTens.put(4,"forty");
        mapNumberTens.put(5,"fifty");


        HashMap<Integer, String> eleven = new HashMap <>();

        eleven.put(11,"eleven");
        eleven.put(12,"twelve");
        eleven.put(13,"thirteen");
        eleven.put(14,"fourteen");
        eleven.put(16,"sixteen");
        eleven.put(17,"seventeen");
        eleven.put(18,"eighteen");
        eleven.put(19,"nineteen");



        HashMap<Integer, String> qh_15 = new HashMap <>();
        qh_15.put(15,"quarter past");
        qh_15.put(30,"half past");
        qh_15.put(45, "quarter to");

        if(m ==0){
            result = mapNumberHours.get(h) + " " + mapNumberHours.get(0);
            return result;
        }

        if(m%15 ==0 ){
            if(m>30) h = h==12?1:h+1;
            result = qh_15.get(m) + " " + mapNumberHours.get(h);
            return result;
        }
        if(m<=30){
            if(m==1){
                result = mapNumberHours.get(m)+" minute past " + mapNumberHours.get(h);
            }
            else if(m%10 == 0){
                result = mapNumberTens.get(m) + " past " + mapNumberHours.get(h);
            }else{
                int tens = m/10;
                int ones = m%10;

                if(tens == 1){
                    result = eleven.get(m) + " past " + mapNumberHours.get(h);
                }else{
                    result = mapNumberTens.get(tens) + " "+ mapNumberHours.get(ones)+" minutes past " + mapNumberHours.get(h);
                }
            }

            return result;
        }
        if(m > 30){
            h = h==12?1:h+1;
            m = 60-m;
            if(m==1){
                result = mapNumberHours.get(m)+"minute to " + mapNumberHours.get(h);
            }
            else if(m<=10){
                result = mapNumberHours.get(m) + " minutes to " + mapNumberHours.get(h);
            }
            else if(m%10 == 0){
                result = mapNumberTens.get(m) + " minutes to " + mapNumberHours.get(h);
            }else{
                int tens = m/10;
                int ones = m%10;

                if(tens == 1){
                    result = eleven.get(m) + " minutes to " + mapNumberHours.get(h);
                }else{
                    result = mapNumberTens.get(tens) + " "+ mapNumberHours.get(ones)+" minutes to " + mapNumberHours.get(h);
                }
            }

            return result;
        }



        return "Invalid";


    }


    public static void main(String str[]){
        System.out.print(timeInWords(12,47));
    }


}

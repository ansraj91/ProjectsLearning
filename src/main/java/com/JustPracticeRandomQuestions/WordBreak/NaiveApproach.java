package com.JustPracticeRandomQuestions.WordBreak;

import java.util.HashSet;
import java.util.Set;

public class NaiveApproach {

    static Set<String> dict;
    static String word = "leetcodefuck";

    public static void main(String str[]){

        dict = new HashSet <>();
        dict.add("leet");
        dict.add("anshul");
        dict.add("code");
        dict.add("fuck");

        int start = 0;


        if(wordBreakHealper(word, dict, start)){
            System.out.print("Breakable");
        }else{
            System.out.print("Not Breakable");
        }

    }

  public static boolean wordBreakHealper(String word, Set<String> dict, int start){

        if(start == word.length()){
            return true;
        }


            for(String s: dict){
                int len = s.length();
                if(word.length()>=(start+len)&&word.substring(start,start+len).equalsIgnoreCase(s)){
                   if( wordBreakHealper(word, dict,start+len)){
                       return true;
                   }
                }
            }


        return false;


  }



}

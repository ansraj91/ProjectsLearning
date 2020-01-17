package com.String;

import java.util.ArrayList;

public class PrettyJson {

    static char openBrace = '{';
    static char closeBrace = '}';
    static char openSqBrace = '[';
    static char closeSqBrace =']';
    static char colon = ':';
    static char comma =',';

    static StringBuilder sb_tab = new StringBuilder();

    static ArrayList<String> str = new ArrayList <>();

    public static ArrayList<String> prettyJson(String A){

        for(int i=0;i<A.length();i++){
            //System.out.println("-->"+A.charAt(i));
            if((i==0 && A.charAt(i)=='\"') || (i==A.length()-1) && A.charAt(i)=='\"') continue;
            if(A.charAt(i) == openBrace || A.charAt(i) == openSqBrace) {

                str.add(sb_tab.toString() + A.charAt(i));
                sb_tab.append("\t");
            }else if(Character.isLetterOrDigit(A.charAt(i)) || A.charAt(i)== '\"' || A.charAt(i)=='\"' || A.charAt(i) == ':' || A.charAt(i)=='.' ){
                StringBuilder sb = new StringBuilder();
                while ((Character.isLetterOrDigit(A.charAt(i)) || A.charAt(i)== '\"' || A.charAt(i)=='\"' || A.charAt(i) == ':' || A.charAt(i)=='.')  ){
                    sb.append(A.charAt(i));
                    i++;
                }

                 if(A.charAt(i)==comma){
                     str.add(sb_tab+sb.toString()+A.charAt(i));
                }else{
                     str.add(sb_tab+sb.toString());
                     i--;
                 }



            } else if(A.charAt(i)==closeBrace || A.charAt(i) == closeSqBrace){
                if(sb_tab.length()>0)
                sb_tab.delete(sb_tab.length()-1,sb_tab.length());
                if((i+1)<A.length() && A.charAt(i+1)==','){
                    str.add(sb_tab.toString() + A.charAt(i) + A.charAt(i+1));
                }else
                str.add(sb_tab.toString() + A.charAt(i));
            }

        }

        return str;


    }

    public static void main(String[] args) {
        prettyJson("{\"attributes\":[{\"nm\":\"ACCOUNT\",\"lv\":[{\"v\":{\"Id\":null,\"State\":null},\"vt\":\"java.util.Map\",\"cn\":1}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":13585},{\"nm\":\"PROFILE\",\"lv\":[{\"v\":{\"Party\":null,\"Ads\":null},\"vt\":\"java.util.Map\",\"cn\":2}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":41962}]}").forEach(System.out::println);

    }
}

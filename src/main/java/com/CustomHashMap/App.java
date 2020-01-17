package com.CustomHashMap;

import java.sql.SQLOutput;
import java.util.HashSet;

public class App {

    public static void main(String[] args) {

        CustomHashMap<String, String> myMap = new CustomHashMap <>();

        myMap.put("Hello","Anshul");
        myMap.put("H","Anshul");
        myMap.put("Hel","Anshul");

        System.out.println(myMap.toString());

        HashSet<String> s = new HashSet <>();
        s.add("H");



    }


}

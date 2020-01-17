package com.Rehersal;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AverageMArksOfStudent {

        String name;
        int totalMarks = 0;
        int avgMarks = 0;
        int count = 0;

    public AverageMArksOfStudent(String name){
        this.name = name;
    }

    public void addMarks(int marks){
        totalMarks+=marks;
        count++;
        avgMarks = (totalMarks)/count;
    }

    public int getAvgMarks(){
        return avgMarks;
    }

    public String getName(){
        return this.name;
    }

    public static void main(String[] args) {
        String s[][] = {{"jerry","65"},
                {"bob","91"}, {"jerry","23"}, {"Eric","83"},{"Eric","99"}};

        HashMap<String,AverageMArksOfStudent> map = new HashMap <>();

        for(int i=0;i<s.length;i++){
            if(map.containsKey(s[i][0])){
                map.get(s[i][0]).addMarks(Integer.parseInt(s[i][1]));
            }else{
                map.put(s[i][0],new AverageMArksOfStudent(s[i][0]));
                map.get(s[i][0]).addMarks(Integer.parseInt(s[i][1]));
            }
        }

        List<AverageMArksOfStudent> al  = map.values().stream().collect(Collectors.toList());

        Collections.sort(al,Comparator.comparing(AverageMArksOfStudent::getAvgMarks).reversed());

        System.out.println(al.get(1).getName()+", "+al.get(1).getAvgMarks());


    }


}





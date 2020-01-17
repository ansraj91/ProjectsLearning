package com.Company.FlipkartPractice.SystemDesign.BookMyShow.Theatre;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Theatre {



    private String Name;
    private List<Hall> hallList;

    public Theatre(String name, List <Hall> hallList) {
        Name = name;
        this.hallList = hallList;
    }




    public String getName() {
        return Name;
    }

    public Theatre setName(String name) {
        Name = name;
        return this;
    }

    public List <Hall> getHallList() {
        return Collections.unmodifiableList(hallList);
    }

    public Theatre setHallMap(List<Hall> hallList) {
        this.hallList = hallList;
        return this;
    }

    @Override
    public String toString() {
        return "Name: " + this.Name + System.lineSeparator()+
                "List of Screens:" + hallList.toString();
    }



}

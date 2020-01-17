package com.Company.FlipkartPractice.SystemDesign.BookMyShow.Data;

import com.Company.FlipkartPractice.SystemDesign.BookMyShow.User.Person;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonData {

    private static List<Person> personList = new ArrayList <>();

    public void addPerson(Person p){
        personList.add(p);
    }  

   public  List<Person> getALlPerson(){
       return Collections.unmodifiableList(personList);
   }

   private void addDefaultPersonList(){
       Person person = new Person("Anshul", "aid");
       Person person1 = new Person("Megha", "mid");

       personList = Arrays.asList(person,person1);

   }
   




}

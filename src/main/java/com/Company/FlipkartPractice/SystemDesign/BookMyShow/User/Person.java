package com.Company.FlipkartPractice.SystemDesign.BookMyShow.User;

import com.Company.FlipkartPractice.SystemDesign.BookMyShow.Ticket.Ticket;

import java.util.ArrayList;
import java.util.List;

public class Person {

    String personName;
    String userID;
    List<Ticket> ticketList;

    public String getPersonName() {
        return personName;
    }

    public Person setPersonName(String personName) {
        this.personName = personName;
        return this;
    }

    public String getUserID() {
        return userID;
    }

    public Person setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public boolean bookTicket(Ticket ticket){
        ticketList.add(ticket);
        return true;
    }



    public Person(String personName, String userID) {
        this.personName = personName;
        this.userID = userID;
        ticketList = new ArrayList <>();
    }


    @Override
    public String toString(){
        return "Name:" + this.personName+System.lineSeparator()+
                "User ID:" + this.userID + System.lineSeparator()+
                "Ticket details:" + ticketList.toString();

    }


}

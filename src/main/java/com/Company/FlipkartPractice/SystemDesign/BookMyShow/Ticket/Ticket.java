package com.Company.FlipkartPractice.SystemDesign.BookMyShow.Ticket;

import com.Company.FlipkartPractice.SystemDesign.BookMyShow.Movie.Movie;
import com.Company.FlipkartPractice.SystemDesign.BookMyShow.Theatre.Theatre;
import com.Company.FlipkartPractice.SystemDesign.BookMyShow.User.Person;

public class Ticket {


    String bookingId;
   // Movie movie;
    Theatre t1;
    public Ticket(String bookingId, Person person, Movie movie, Theatre t1) {
        this.bookingId = bookingId;
       //this.movie = movie;
        this.t1 = t1;
    }


    public String getBookingId() {
        return bookingId;
    }

    public Ticket setBookingId(String bookingId) {
        this.bookingId = bookingId;
        return this;
    }


  /*  public Movie getMovie() {
        return movie;
    }*/

   /* public Ticket setMovie(Movie movie) {
        this.movie = movie;
        return this;
    }*/

    public Theatre getT1() {
        return t1;
    }

    public Ticket setT1(Theatre t1) {
        this.t1 = t1;
        return this;
    }

    @Override
    public String toString() {
        return "Booking ID: " + this.bookingId + System.lineSeparator()+
               // "Movie Details: " + this.movie.toString() + System.lineSeparator()+
                "Theatre Details: " + this.t1.toString();

    }



}

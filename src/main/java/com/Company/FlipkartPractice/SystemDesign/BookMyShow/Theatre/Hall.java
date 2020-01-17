package com.Company.FlipkartPractice.SystemDesign.BookMyShow.Theatre;

import com.Company.FlipkartPractice.SystemDesign.BookMyShow.Movie.Movie;
import javafx.beans.binding.BooleanExpression;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Hall {
    private int hallID;
    private int numberOfSeats;
    private Movie movie;
    private Boolean arr[];
    private AtomicInteger numberOfAvailbaleSeats =new AtomicInteger();

    public int getHallID() {
        return hallID;
    }

    public Hall setHallID(int hallID) {
        this.hallID = hallID;
        return this;
    }


    public Hall(int numberOfSeats, Movie movie, int HallID) {
        this.hallID = HallID;
        this.numberOfSeats = numberOfSeats;
        this.movie = movie;
        arr = new Boolean[this.numberOfSeats];
        this.numberOfAvailbaleSeats.set(numberOfSeats);
        IntStream.range(0,numberOfSeats).forEach(i->arr[i]=true);
    }
    public int getAvailbaleSeats(){
        return numberOfAvailbaleSeats.get();
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Hall setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        return this;
    }

    public Movie getMovie() {
        return movie;
    }

    public Hall setMovie(Movie movie) {
        this.movie = movie;
        return this;
    }
    public boolean bookSeat(int seatNumber) throws Exception {
        if(arr[seatNumber]){
            arr[seatNumber] = false;
            if(numberOfAvailbaleSeats.get()<=0) throw new Exception("Seat Full!!");
            numberOfAvailbaleSeats.getAndDecrement();
            return true;
        }return false;
    }

    public Hall setSeatAvailable(int seatNumber){
        arr[seatNumber] = true;
        return this;
    }

    @Override
    public String toString() {
        return "Hall Id: "+ this.hallID+System.lineSeparator()+
                "No of Seats: " + this.numberOfSeats + System.lineSeparator()+
                "No of availble Seats:" + this.numberOfAvailbaleSeats + System.lineSeparator()+
                "Movie: " +this.movie.toString() + System.lineSeparator();
    }

    public String getAvailableSeats(){
        return Arrays.toString(arr);
    }


}

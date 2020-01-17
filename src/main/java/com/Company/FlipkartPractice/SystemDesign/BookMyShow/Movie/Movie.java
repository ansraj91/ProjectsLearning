package com.Company.FlipkartPractice.SystemDesign.BookMyShow.Movie;

public class Movie {

    public Movie(String name, String movieID) {
        Name = name;
        this.movieID = movieID;
    }

    public String getName() {
        return Name;
    }

    public Movie setName(String name) {
        Name = name;
        return this;
    }

    public String getMovieID() {
        return movieID;
    }

    public Movie setMovieID(String movieID) {
        this.movieID = movieID;
        return this;
    }

    @Override
    public String toString() {
        return "Movie Name:" + this.getName() +System.lineSeparator()+
                "Movie ID: " + this.movieID + System.lineSeparator();
    }

    private String Name;
    private String movieID;


}

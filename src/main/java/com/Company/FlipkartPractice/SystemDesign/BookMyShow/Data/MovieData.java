package com.Company.FlipkartPractice.SystemDesign.BookMyShow.Data;

import com.Company.FlipkartPractice.SystemDesign.BookMyShow.Movie.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MovieData {

    private static List<Movie> listOfMovie;

    static{
        listOfMovie = new ArrayList <>();
    }

    public  List<Movie> getListOfMovies(){
        return Collections.unmodifiableList(listOfMovie);
    }

    public void addNewMovie(Movie movie){
        listOfMovie.add(movie);
    }

    public  void addDefaultDatToList(){
        Movie movie1 = new Movie("Games of Throne", "GOTID");
        Movie movie2 = new Movie("Captin America", "CID");
        Movie movie3 = new Movie("Har Pal", "HID");
        Movie movie4 = new Movie("Jindgi Pal", "JID");
        listOfMovie = Arrays.asList(movie1,movie2,movie3,movie4);


    }




}

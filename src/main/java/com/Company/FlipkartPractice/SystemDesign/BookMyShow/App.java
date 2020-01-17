package com.Company.FlipkartPractice.SystemDesign.BookMyShow;

import com.Company.FlipkartPractice.SystemDesign.BookMyShow.Data.TheatreData;
import com.Company.FlipkartPractice.SystemDesign.BookMyShow.Movie.Movie;
import com.Company.FlipkartPractice.SystemDesign.BookMyShow.Theatre.Hall;
import com.Company.FlipkartPractice.SystemDesign.BookMyShow.Theatre.Theatre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {


    private List <Theatre> theatres;
    private static BiPredicate<Hall,Movie> selectHall = (h,m)->h.getMovie().getMovieID().equals(m.getMovieID());


    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Book my movie!!" + System.lineSeparator()+
        "Select from below option..." + System.lineSeparator());

        int input = 99;
        TheatreData t1 = new TheatreData();
        t1.addDefaultData();
        List<Theatre> theatres = t1.getListOfTheatre();
        t1.getListOfTheatre().get(0).getHallList().get(0).bookSeat(1);
        t1.getListOfTheatre().get(0).getHallList().get(0).bookSeat(2);
        t1.getListOfTheatre().get(0).getHallList().get(0).bookSeat(3);
        t1.getListOfTheatre().get(0).getHallList().get(0).bookSeat(4);
        t1.getListOfTheatre().get(0).getHallList().get(0).bookSeat(0);
        t1.getListOfTheatre().get(0).getHallList().get(0).bookSeat(0);
        System.out.println(t1.getListOfTheatre().toString());
        Scanner in = new Scanner(System.in);

        int selection =9;
        /*List <Movie> listMovie= new ArrayList <>();
        while(selection!=0) {
            System.out.println("Please select the movies! Enter 9 to list movies, and 0 to exit.");

            switch (selection) {

                case 9:
                    AtomicInteger movieNumber = new AtomicInteger();

                    for (Theatre theatre : theatres) {
                        listMovie.addAll(theatre.getHallList().stream().map(s -> s.getMovie()).distinct().collect(Collectors.toList()));

                    }
                    IntStream.range(0, listMovie.size()).forEach(s -> System.out.println((s + 1) + ") " + listMovie.get(s).getName()));
                    selection = in.nextInt();

                    break;
                case 0:
                    System.exit(0);

                default:
                    if(selection <0 && selection>listMovie.size()){
                        System.out.println("Invalid input!! Please select valid input...");
                        selection = 9;
                    }else{
                        int finalSelection = selection-1;
                        List<Theatre> theatreList2 = new ArrayList <>();

                            List<Theatre> list = theatres.stream().filter(t->t.getHallList().stream().anyMatch(h->selectHall.test(h,listMovie.get(finalSelection)))).collect(Collectors.toList());
                               list.stream().forEach(System.out::println);
                            }


;                }
                    selection = in.nextInt();
                break;
            }*/

        }


}

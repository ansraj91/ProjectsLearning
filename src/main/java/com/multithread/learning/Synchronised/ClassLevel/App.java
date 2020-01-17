package com.multithread.learning.Synchronised.ClassLevel;

public class App {

    public static void main(String[] args) throws InterruptedException {
        SharedClass sharedObject = new SharedClass();
        SharedClass sharedObject2 = new SharedClass();

        ThreadClass t1 = new ThreadClass(sharedObject);
        ThreadClass t2 = new ThreadClass(sharedObject2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();;

        System.out.println( " AfterIncrement 1: "+ sharedObject.getIncreamentedValue());
        System.out.println( " AfterIncrement 2: "+ sharedObject2.getIncreamentedValue());

    }

}

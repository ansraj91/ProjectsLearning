package com.multithread.learning.Synchronised.ClassLevel;

public class SharedClass {

    private static int sharedVariable = 0;

    public static synchronized void doIncreament(){
        sharedVariable++;
    }

    public int getIncreamentedValue(){
        return sharedVariable;
    }



}




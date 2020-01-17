package com.multithread.learning.Synchronised.ClassLevel;

public class ThreadClass extends Thread {

    private SharedClass sharedObject;
    public ThreadClass(SharedClass sharedObject){
        this.sharedObject = sharedObject;
    }

    @Override
    public void run(){
        for(int i=0;i<10000;i++){
            this.sharedObject.doIncreament();
        }
    }

}

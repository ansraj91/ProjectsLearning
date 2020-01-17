package com.multithread.learning;

public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {
        SharedResources sharedResources = new SharedResources();
        Thread t1 = new Thread(new Runnable() {
            int count  = 0;
            @Override
            public void run() {
                while(count<1000) {
                    sharedResources.increament();
                    count++;
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            int count  = 0;
            @Override
            public void run() {
                while(count<1000) {
                    sharedResources.decreament();
                    count++;
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            int count  = 0;
            @Override
            public void run() {
                while (count<1000){
                    System.out.println(sharedResources.getItem());
                    count++;
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sharedResources.getItem());
        //t3.start();
    }







}


class SharedResources{

    int item = 0;

    public synchronized void increament(){
        this.item++;
    }

    public synchronized void decreament(){
        this.item--;
    }

    public  int getItem(){
        return this.item;
    }

}

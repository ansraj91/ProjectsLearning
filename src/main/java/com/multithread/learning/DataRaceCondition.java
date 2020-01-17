package com.multithread.learning;

public class DataRaceCondition {

    public static void main(String[] args) {
        SharedClass sharedClass = new SharedClass();
        Thread t1 = new Thread(()->{
            for(int i=0;i<Integer.MAX_VALUE;i++){
                sharedClass.incrementXY();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<Integer.MAX_VALUE;i++){
                try {
                    sharedClass.checkForDataRace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }




}

class SharedClass {
    volatile int x,y;

    public void incrementXY(){
        x++;
        y++;
    }

    public void checkForDataRace() throws Exception {
        if(y>x) throw new Exception("y>x - Data race detected");
    }

}

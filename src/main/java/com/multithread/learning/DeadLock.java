package com.multithread.learning;

import java.util.Random;
import java.util.RandomAccess;
import java.util.concurrent.SynchronousQueue;


//Here Both Train and Train B is trying to cross the intersection
public class DeadLock {

    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        TrainA trainA = new TrainA(intersection);
        TrainB trainB = new TrainB(intersection);

        trainA.start();
        trainB.start();
    }

}


class TrainB extends Thread{
    Intersection intersection;
    Random random = new Random();

    TrainB(Intersection intersection){
        this.intersection  = intersection;
    }

    @Override
    public void run(){
        while(true){
            long sleepingTime = random.nextInt(5);
            try {
                Thread.sleep(sleepingTime);
            }catch(InterruptedException e){

            }
            intersection.takeRoadB();
        }
    }


}

class TrainA extends Thread{
    Intersection intersection;
    Random random = new Random();
    TrainA(Intersection intersection){
        this.intersection = intersection;
    }


    @Override
    public void run(){
        intersection.takeRoadA();
        while(true){
            long sleepingTime = random.nextInt(5);
            try{
                Thread.sleep(sleepingTime);
            }catch (InterruptedException e){

            }
            intersection.takeRoadA();
        }
    }
}


class Intersection{
    private Object RaodA = new Object();
    private Object RoadB = new Object();

    public void takeRoadA(){
        synchronized (RaodA){
            System.out.println("RoadA is locked by thread:" + Thread.currentThread().getName());
            synchronized (RoadB){
                System.out.println("Train is passing through RoadA");
                try{
                    Thread.sleep(1);
                }catch(InterruptedException e){

                }
            }
        }
    }

    public void takeRoadB(){
        synchronized (RaodA){
            System.out.println("RoadB is locked by Thread:" + Thread.currentThread().getName());

            synchronized (RoadB){
                System.out.println("Train is passing through RaodB");
                try{
                    Thread.sleep(1);
                }catch (InterruptedException ie){

                }
            }


        }
    }
}

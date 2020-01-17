package com.multithread.learning;

import DesignPattern.Specification.Model.Product;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumer_blockingQueue {

    static BlockingQueue<Integer> sharedQueue = new LinkedBlockingDeque <>();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Producer(sharedQueue));
        Thread t2 = new Thread(new Consumer(sharedQueue));

        t1.start();
        t2.start();
    }






}


class Producer implements Runnable{
    BlockingQueue<Integer> sharedQ;

    public Producer(BlockingQueue q){
        this.sharedQ = q;
    }

    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Produced:" + i*2);
            sharedQ.add(i*2);
        }
    }


}


class Consumer implements Runnable{
    BlockingQueue<Integer> sharedQ;
    public Consumer(BlockingQueue q){
        this.sharedQ = q;
    }

    @Override
    public void run(){
        while(true){
            try {
                System.out.println("Consumed: "+sharedQ.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}

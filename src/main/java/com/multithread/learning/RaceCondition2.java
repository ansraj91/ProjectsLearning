package com.multithread.learning;

import java.util.Random;

public class RaceCondition2 {

    public static void main(String[] args) throws InterruptedException {
        Metrics metrics = new Metrics();
        BussinessLogic bussinessLogicThread1 = new BussinessLogic(metrics);
        BussinessLogic bussinessLogicThread2 = new BussinessLogic(metrics);
        BusinessPrinter businessPrinterThread = new BusinessPrinter(metrics);
        bussinessLogicThread1.start();
        bussinessLogicThread2.start();
        businessPrinterThread.start();
        bussinessLogicThread1.join();
        bussinessLogicThread2.join();
        businessPrinterThread.join();
    }


}

class BusinessPrinter extends Thread{
    private Metrics metrics;
    public BusinessPrinter(Metrics metrics){
        this.metrics = metrics;
    }

    public void run(){
        while(true){
            try {
                Thread.sleep(10);
                System.out.println(metrics.getAverage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}

class BussinessLogic extends Thread{
    private Metrics metrics;
    private Random random = new Random();
    public BussinessLogic(Metrics metrics){
        this.metrics = metrics;
    }
    @Override
    public void run() {
        while (true){
            long start = System.currentTimeMillis();
        try {
            Thread.sleep(random.nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        metrics.addSmaple(end - start);
    }
    }
        }
class Metrics{
  private volatile long count = 0;
  private volatile double average = 0.0;
    public  void addSmaple(long sample){
        double currentSum = average*count;
        count++;
        average = (currentSum+sample)/count;
    }

    public   double getAverage() {
        return average;
    }
}

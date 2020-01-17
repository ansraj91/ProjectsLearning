package com.multithread.learning;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static java.math.BigInteger.ONE;

public class ThreadTermination {

    public static void main(String str[]){

        List<CalculateFactorial> threadsCalculationFacotrial = new ArrayList<>();

        //SleepingThread sleepingThread = new SleepingThread();
        //InfiniteThread infiniteThread = new InfiniteThread();
        CalculateFactorial calculateFactorial1 = new CalculateFactorial(1000000000);
        CalculateFactorial calculateFactorial2 = new CalculateFactorial(10000);
        CalculateFactorial calculateFactorial3 = new CalculateFactorial(100);
        threadsCalculationFacotrial.add(calculateFactorial1);
        threadsCalculationFacotrial.add(calculateFactorial2);
        threadsCalculationFacotrial.add(calculateFactorial3);

       /* sleepingThread.start();
       // infiniteThread.setDaemon(true);
        infiniteThread.start();

        infiniteThread.interrupt();

        sleepingThread.interrupt();

*/
       for(CalculateFactorial cft:threadsCalculationFacotrial){
           cft.start();
           try {
               cft.join(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

       /* try {
            calculateFactorial.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for( int i=0;i<3;i++){
           if(threadsCalculationFacotrial.get(i).isFinished){
               System.out.println("Result:"+i+" :"+threadsCalculationFacotrial.get(i).getResult().toString());
           }else{
               System.out.println("Thread "+i+" is processing the data!!");
           }

       }

        System.out.println("Main Thread completed!!");
    }

    static class SleepingThread extends Thread{

        @Override
        public void run(){
            try {
                Thread.sleep(5000000);
            } catch (InterruptedException e) {
                System.out.println("Sleep interupted!!");
            }
        }

    }

    static class InfiniteThread extends Thread{
        @Override
        public void run(){
            while(true){
                //do nothing
                if(currentThread().isInterrupted()){
                    System.out.println("Infinite Thread interrupted!!");
                    return;
                }
            }
        }
    }


    static class CalculateFactorial extends Thread{
        private BigInteger result = ONE;
        private boolean isFinished = false;
        private long inputNumber;


        @Override
        public void run(){
            System.out.println("Started!!");
            this.result = calculateFactorial(this.inputNumber);
            this.isFinished = true;
        }


        public  CalculateFactorial(long inputLong){
            this.inputNumber  = inputLong;
        }

        public BigInteger calculateFactorial(long inputNumber){
            BigInteger tempResult = ONE;
            //System.out.println(tempResult);

            for(long i=1;i<=inputNumber;i++){
                tempResult = tempResult.multiply(BigInteger.valueOf(i));
                //System.out.println(tempResult);

            }
            return tempResult;
        }

        public BigInteger getResult(){
            return this.result;
        }

    }

}

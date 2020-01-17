package com.multithread.learning;

import java.util.ArrayList;
import java.util.List;

public class ReadListArrayInParllel {

    public static Object mutex;

   private static ArrayList<String> list = new ArrayList<>();

    public static void main(String str[]){

        list.add("Hello");
        list.add(",");
        list.add("Anshul");
        list.add("!!");
        list.add(",");
        list.add("Welcome");
        ArrayList<ReadList> threadsReadlist = new ArrayList<>();

        threadsReadlist.add(new ReadFromBottom(list));
        threadsReadlist.add(new ReadListFromTop(list));

        for(Thread t1 : threadsReadlist){
            t1.start();
        }


    }




    private abstract static class ReadList extends Thread{
        ArrayList<String>  listToRead;
        public ReadList( ArrayList<String>  list){
            this.listToRead = list;
            currentThread().setName(this.getClass().getSimpleName());
        }

        @Override
        public void start(){
            System.out.println("Thread "+ this.getClass().getSimpleName() + " has started");
            super.start();
        }
    }


    private static class ReadListFromTop extends ReadList{

        public ReadListFromTop( ArrayList<String>  l1){
            super(l1);
        }

        @Override
        public void run() {
            synchronized (mutex) {
                for (String str : this.listToRead) {
                    try {

                        System.out.println("From Top--: " + str);
                        this.wait();


                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static class ReadFromBottom extends  ReadList{

        ReadFromBottom(ArrayList<String> list){
            super(list);
        }

        @Override
        public void run() {
            synchronized (mutex) {
                for (int i = this.listToRead.size() - 1; i >= 2; i--) {
                    System.out.println("From Bottom--: " + list.get(i));
                    notifyAll();
                }


            }
        }
    }

}

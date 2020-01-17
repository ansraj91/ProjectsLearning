package com.multithread.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


//Below in this code 2 hackers try to open the vault by guessing the password, mean while police thread started, if police thread reaches 10 then
//it break the flow and show message game over other wise any of the hacker threads find the password they say found password!!
public class HackerVault {
    public static final int MAX_VALUE = 999;

    public static void main(String str[]){
        Random random = new Random();
        int password = random.nextInt(MAX_VALUE);
        Vault vault = new Vault(password);
        List<HackerThread> hackers = new ArrayList<>();
        hackers.add(new AscendingHackerThread(vault));
        hackers.add(new DescendingHackerThread(vault));

        Police policeThread =new Police();

        for(HackerThread hacker: hackers){
            hacker.start();
        }

        policeThread.start();

    }


     static class Vault{
        private int password;
        public Vault(int password){
            this.password = password;
            System.out.println("Vault password is"+ password);

        }
        public boolean isPasswordCorrect(int guess) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return this.password == guess;
        }
    }


}


abstract class HackerThread extends Thread{

    protected HackerVault.Vault vault;

    public HackerThread(HackerVault.Vault vault){
        this.vault  = vault;
        this.setName(this.getClass().getSimpleName());
        this.setPriority(10);
    }

    @Override
    public void start(){
        System.out.println("Starting Thread "+ this.getName());
        super.start();
    }

}


class AscendingHackerThread extends HackerThread{


    public AscendingHackerThread(HackerVault.Vault vault){
        super(vault);
    }
    @Override
    public void run(){
        for(int guess=0;guess<=HackerVault.MAX_VALUE;guess++){
            if(this.vault.isPasswordCorrect(guess)){
                System.out.println("Hacker "+ this.getClass().getSimpleName() + " has cracked the vault password!!");
                System.exit(0);
            }
        }
    }
}


class DescendingHackerThread extends HackerThread{
    public DescendingHackerThread(HackerVault.Vault vault){
        super(vault);

    }
    @Override
    public void run(){
        for(int guess=HackerVault.MAX_VALUE; guess>0;guess--){
            if(this.vault.isPasswordCorrect(guess)){
                System.out.println("Hacker Thread"+ this.getClass().getSimpleName() + " Cracked the password!!" );
                System.exit(0);
            }
        }
    }
}


class Police extends Thread{
    int maxCountDown = 10;
    @Override
    public void run(){
        for(int countDown=0;countDown<maxCountDown;countDown++){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(countDown);

        }
        System.out.println("Game over !!");
        System.exit(0);
    }
}
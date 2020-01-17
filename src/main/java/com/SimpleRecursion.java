package com;

public class SimpleRecursion {

    public static void main(String str[]){
        SimpleRecursion simpleRecursion  = new SimpleRecursion();
        simpleRecursion.getWrite(10);
    }

    public void getWrite(int n){
        if(n==0){
           return;
        }

        getWrite(n-1);
        System.out.println(n);


    }
}

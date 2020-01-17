package com.Company.FlipkartPractice.FStack.Stack;

public class FStack<T> {

    final class SNode<T>{
        SNode nextNode;
        T data;
        SNode(T data){
            this.data  = data;
            nextNode = null;
        }
    }

    private transient SNode first;
    public void push(T data){
        SNode<T> oldFirst = first;
        first = new SNode <T>(data);
        first.nextNode = oldFirst;

    }



    public T pop(){
        if(first == null) throw new NullPointerException("FStack is empty");
        SNode<T> tem = first;
        first = first.nextNode;

        return tem.data;
    }

    public void traverse(){
        SNode<T> tem = this.first;
        while(tem!=null){
            System.out.println("-->"+tem.data);
            tem = tem.nextNode;
        }
    }

    public boolean isEmpty(){
        return this.first == null;
    }




}

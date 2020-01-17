package com.Company.FlipkartPractice.FStack.Test;

import com.Company.FlipkartPractice.FStack.Stack.FStack;
import org.junit.Before;
import org.junit.Test;

public class Test_FStack {

    private FStack<String> fStack;

    @Before
    public void init(){
        fStack = new FStack <>();

    }

    public void pushData(){

        fStack.push("Megha");
        fStack.push("Gupta");
        fStack.push("Anshul");
        fStack.push("Khandelwal");
    }

    @Test
    public void testPop(){
        pushData();
        System.out.println(fStack.pop());
        System.out.println(fStack.pop());


    }
    @Test
    public void testTraverse(){
        pushData();
        fStack.traverse();
    }

}

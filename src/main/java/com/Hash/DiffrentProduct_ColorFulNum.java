package com.Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class DiffrentProduct_ColorFulNum {

    public static void solve(int A){

        Stack<Integer> l1 = new Stack <>();

        HashMap<Long,Integer> map = new HashMap <>();
        ArrayList<Integer> al = new ArrayList <>();

        while(A>0){
            int x= A%10;
            l1.push(x);
            A = A/10;

        }
        while(!l1.isEmpty()){
            map.put((long)l1.peek(),l1.peek());
            al.add(l1.pop());

        }


        for(int i=0;i<al.size();i++){
            long prod = al.get(i);
            int num =al.get(i);
            for(int j=i+1;j<al.size();j++){
                num*=10;
                num+=al.get(j);
                prod *= al.get(j);
                if(map.containsKey(prod))
                    map.put(prod,map.get(prod)<num?map.get(prod):num);
                else
                    map.put(prod,num);
            }
        }

        map.entrySet().forEach(System.out::println);





    }

    public static int solve2(int A){
        Stack<Integer> l1 = new Stack <>();

        HashMap<Long,Integer> map = new HashMap <>();
        ArrayList<Integer> al = new ArrayList <>();

        while(A>0){
            int x= A%10;
            l1.push(x);
            A = A/10;

        }
        while(!l1.isEmpty()){
            map.put((long)l1.peek(),l1.peek());
            al.add(l1.pop());

        }
        if(al.size() !=map.size()) return 0;

        for(int i=0;i<al.size();i++){
            long prod = al.get(i);
            int num =al.get(i);
            for(int j=i+1;j<al.size();j++){
                num*=10;
                num+=al.get(j);
                prod *= al.get(j);
                if(map.containsKey(prod))
                    if(map.get(prod)==num) continue;
                    else
                        return 0;
                else
                    map.put(prod,num);
            }
        }

        map.entrySet().forEach(System.out::println);
        return 1;
    }


    /* public static long getProduct(int x){

            long prod = 1;
            while(x>0){
               prod*=(x%10);

               x=x/10;
            }
           return prod;
    }
*/
    public static void main(String[] args) {
        System.out.println();
        System.out.println(solve2(9));
    }


}

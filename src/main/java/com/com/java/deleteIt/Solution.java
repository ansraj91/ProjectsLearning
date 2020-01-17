 package com.com.java.deleteIt;

import java.util.Scanner;
import java.util.function.Predicate;

 public class Solution {



        public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */
            //Scanner
            Scanner s = new Scanner(System.in);
            String first = s.nextLine();
            String second = s.nextLine();// Reading input from STDIN
           // System.out.println("Hi, " + num + "." + data);    // Writing output to STDOUT
            Predicate<Integer> testDivideByThree = (i)->i%3 == 0;
            Predicate<Integer> testDivideByFive = (i)->i%5 == 0;

            int num = Integer.parseInt(first);
            String strNums[] = second.split(" ");
            int arrNums[] = new int[num];

            for(int i=0;i<num;i++){
                arrNums[i] = Integer.parseInt(strNums[i]);
            }

            for(int i=0;i<num;i++){
                for(int j=1;j<=arrNums[i];j++){
                    if(testDivideByFive.test(j) && testDivideByThree.test(j)){
                        System.out.println("FizzBuzz");
                    }else if(testDivideByFive.test(j)){
                        System.out.println("Buzz");
                    }else if(testDivideByThree.test(j)){
                        System.out.println("Fizz");
                    }else{
                        System.out.println(j);
                    }
                }
            }






        }

}

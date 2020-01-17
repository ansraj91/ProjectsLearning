package com.ArrayProblems;

public class FindTwoPrimeNumberForGivenNumber {

    /*
    * Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

NOTE A solution will always exist. read Goldbach’s conjecture

Example:


Input : 4
Output: 2 + 2 = 4

If there are more than one solutions possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b,
and [c,d] is another solution with c <= d, then

[a, b] < [c, d]

If a < c OR a==c AND b < d. */

    public static void solve(int number){
        boolean isPrime[] = new boolean[number+1];
        isPrime[0] = isPrime[1] = false;
        markPrime(number,isPrime);

        for(int i=0;i<number;i++){
            if(isPrime[i] && isPrime[number-i]){
                System.out.println(" "+ i +", "+ (number-i));
                return;
            }
        }
    }

    public static void markPrime(int number, boolean[] isPrime ){
        for(int i=2;i<number;i++) isPrime[i] = true;

        for(int i=2;i*i<number;i++){
            if(isPrime[i]){
                for(int k=i*i;k<=number;k+=i){
                    isPrime[k] = false;
                }
            }
        }

    }

    public static void main(String[] args) {
        solve(74);
    }
}

package com.String;

public class PalindromString {


        public static int isPalindrome(String A) {
            StringBuilder sb = new StringBuilder();
            String A1 = A.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
            sb.append(A1);
            System.out.println(A1);
            if(sb.reverse().toString().equals(A1)) return 1;

            return 0;

        }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

}

package com.SherlockAndAnagram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShelockAnagram {

    public static boolean checkAnagram(char a[], char b[]){

        if(a.length != b.length) return false;
        int arr[] = new int[26];
        int count = 0;
        while(count<a.length){
            arr[a[count] - 'a']++;
            arr[b[count] - 'a']--;
            count++;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0) return false;
        }
        return true;

    }

    static int sherlockAndAnagrams(String s) {
        int count = 0;
        char st[] = s.toLowerCase().toCharArray();




        for(int len=1;len< s.length();len++){
            char arr1[] = new char[len];
            for(int i=0;i<s.length()-len;i++){

                arr1 = s.substring(i,i+len).toCharArray();
                char arr2[] = new char[len];
                for(int j=i+1;j<s.length()-len+1;j++){
                    arr2 = s.substring(j,j+len).toCharArray();
                    if(checkAnagram(arr1,arr2)){
                        count++;
                    }
                }

            }
        }


        return count;

    }


    public static void main(String[] args) {
        String str= "cdcd";
        System.out.println(sherlockAndAnagrams(str));

    }

}

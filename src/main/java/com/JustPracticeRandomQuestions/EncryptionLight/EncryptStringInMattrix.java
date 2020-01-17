package com.JustPracticeRandomQuestions.EncryptionLight;

import sun.security.util.Length;

public class EncryptStringInMattrix {

    static String encryption(String s) {
        s =  s.replaceAll(" ","");

        int len = s.length();

        int sqrt = (int) Math.sqrt(len);

        int row = sqrt;
        int col = row+1;
        if(row*row == len){
            col = col-1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<col;i++){
           for(int j=0;j<len;j+=col){
               int pos = i+j;
               if(pos>=len) {break;}
               sb.append(s.substring(pos,pos+1));
           }

            sb.append(" ");

        }

        return sb.toString();

    }

    public static void main(String str[]){
            System.out.print(encryption("wclwfoznbmyycxvaxagjhtexdkwjqhlojykopldsxesbbnezqmixfpujbssrbfhlgubvfhpfliimvmnny"));
    }
}

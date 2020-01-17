package com.CommonChild;

public class CommonClass {

    static int commonChild(String s1, String s2) {

        int count1=0,count2=0;
        int index = 0;

        int arr[][] = new int[s1.length()][s2.length()];

        for(int i=0;i<s1.length();i++){
            arr[i][0] = 0;

        }
        for(int j=0;j<s2.length();j++){
            arr[0][j] = 0;
        }

        for(int i=1;i<s1.length();i++){
            for(int j=1;j<s2.length();j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    arr[i][j] = arr[i-1][j-1]+1;
                }else{
                    arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }

        return arr[s1.length()][s2.length()];




    }

    public static void main(String[] args) {
        System.out.println(commonChild("WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS", "FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC"));
    }


}

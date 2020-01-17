package com.JustPracticeRandomQuestions.ImmediateGreater;

import java.util.Arrays;

public class ImmediateBiggerWord {

    static String biggerIsGreater(String w) {

        char arr[] = w.toCharArray();
        int len = arr.length-1;
        //if length is one then not possible
        if(len == 1){
            System.out.print("no answer");
        }

        //check if the number/char in ascending order
        int i = len;
        for(;i>0 && arr[i]<=arr[i-1];i--);
        //if number/chars is in ascending order then we have to just swap last and second last
        if(i<=0){
            return "no answer";
        }


      int j = len;
        while(arr[i-1]>=arr[j]) j--;

           swap(arr,i-1,j);

           j=len;
           while (i<j){
               swap(arr,i,j);
                i++;
                j--;

        }
        return "no answer";

    }

    private static void swap(char[] arr, int i, int i1) {
        char temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    public static void main(String str[]){
       // String words[] = {"imllmmcslslkyoegymoa","fvincndjrurfh","rtglgzzqxnuflitnlyit","mhtvaqofxtyrz","zalqxykemvzzgaka","wjjulziszbqqdcpdnhdo","japjbvjlxzkgietkm","jqczvgqywydkunmjw","ehdegnmorgafrjxvksc","tydwixlwghlmqo","wddnwjneaxbwhwamr","pnimbesirfbivxl","mijamkzpiiniveik","qxtwpdpwexuej","qtcshorwyck","xoojiggdcyjrupr","vcjmvngcdyabcmjz","xildrrhpca","rrcntnbqchsfhvijh","kmotatmrabtcomu","bnfcejmyotvw","dnppdkpywiaxddoqx","tmowsxkrodmkkra","jfkaehlegohwggf","ttylsiegnttymtyx","kyetllczuyibdkwyihrq","xdhqbvlbtmmtshefjf","kpdpzzohihzwgdfzgb","kuywptftapaa","qfqpegznnyludrv","ufwogufbzaboaepslikq","jfejqapjvbdcxtkry","sypjbvatgidyxodd","wdpfyqjcpcn","baabpjckkytudr","uvwurzjyzbhcqmrypraq","kvtwtmqygksbim","ivsjycnooeodwpt","zqyxjnnitzawipqsm","blmrzavodtfzyepz","bmqlhqndacv","phvauobwkrcfwdecsd","vpygyqubqywkndhpzw","yikanhdrjxw","vnpblfxmvwkflqobrk","pserilwzxwyorldsxksl","qymbqaehnyzhfqpqprpl","fcakwzuqlzglnibqmkd","jkscckttaeifiksgkmxx","dkbllravwnhhfjjrce","imzsyrykfvjt","tvogoocldlukwfcajvix","cvnagtypozljpragvlj","hwcmacxvmus","rhrzcpprqccf","clppxvwtaktchqrdif","qwusnlldnolhq","yitveovrja","arciyxaxtvmfgquwb","pzbxvxdjuuvuv","nxfowilpdxwlpt","swzsaynxbytytqtq","qyrogefleeyt","iotjgthvslvmjpcchhuf","knfpyjtzfq","tmtbfayantmwk","asxwzygngwn","rmwiwrurubt","bhmpfwhgqfcqfldlhs","yhbidtewpgp","jwwbeuiklpodvzii","anjhprmkwibe","lpwhqaebmr","dunecynelymcpyonjq","hblfldireuivzekegit","uryygzpwifrricwvge","kzuhaysegaxtwqtvx","kvarmrbpoxxujhvgpw","hanhaggqzdpunkugzmhq","gnwqwsylqeuqr","qzkjbnyvclrkmdtc","argsnaqbquv","obbnlkoaklcx","ojiilqieycsasvqosycu","qhlgiwsmtxbffjsxt","vvrvnmndeogyp","ibeqzyeuvfzb","sajpyegttujxyx","zmdjphzogfldlkgbchnt","tbanvjmwirxx","gmdhdlmopzyvddeqyjja","yxvmvedubzcpd","soygdzhbckfuk","gkbekyrhcwc","wevzqpnqwtpfu","rbobquotbysufwqjeo","bpgqfwoyntuhkvwo","schtabphairewhfmp","rlmrahlisggguykeu","fjtfrmlqvsekq"};
       //for(String word:words)
        System.out.println(biggerIsGreater("dcba"));
    }
}

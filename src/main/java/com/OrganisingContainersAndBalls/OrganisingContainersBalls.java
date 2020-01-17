package com.OrganisingContainersAndBalls;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OrganisingContainersBalls {


    static String organizingContainers(int[][] container) {

        int cc[] = new int[container.length];
        int tb[] = new int[container.length];

        for(int i=0;i<container.length;i++){
            for(int j=0;j<container.length;j++){
                cc[i] += container[i][j];
                tb[j] += container[i][j];
            }
        }

        Arrays.sort(cc);
        Arrays.sort(tb);

        for(int i=0;i<container.length;i++){
            if(cc[i] != tb[i]) return "Impossible";
        }

        return "Possible";

    }



}

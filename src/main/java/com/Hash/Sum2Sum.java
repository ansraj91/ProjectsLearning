package com.Hash;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Sum2Sum {


    public ArrayList<Integer> solve(ArrayList<Integer> A, int B){
       HashMap<Integer, Integer> mp = new LinkedHashMap <>();
        ArrayList<Integer> res = new ArrayList <>();
        for(int i=0;i<A.size();i++){
            if(mp.containsKey(B-A.get(i))){
                res.add(mp.get(B-A.get(i)+1));
                res.add(i+1);
                return res;
            }else{
                if(!mp.containsKey(A.get(i))){
                    mp.put(A.get(i),i);

                }
            }
        }
        return res;
    }
}

package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UnsportedOperationException {




    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(new Integer[]{1,2,3,4,5,6,7});
       // List<Integer> al = new ArrayList <>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        for(int i=0;i< al.size();i++){
            System.out.println(al.get(i));
            al.remove(i);
        }
        HashSet set = new HashSet<String> ();
        set.add(null);

        al.add(null);
        al.add(null);
        al.add(null);
        al.add(null);

        String s1 ="hi";
        String s2 ="hi";

        System.out.println(s1==s2);


    }

}

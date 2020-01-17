package com.TheGridSearch;

public class GridSearch {

    static String gridSearch(String[] G, String[] P) {

        boolean p_g = false;

        String result = "NO";
        int p_l =  P.length-1;
        int p_w =  P[0].length()-1;

        int len = G.length;
        int wd = G[0].length();

        for(int i = 0;i<len;i++){
            if(result.equals("YES")) {
                break;
            }
            if((i+p_l)>=len){
                result = "NO";
                break;
            }
            for(int j=0;j<wd;j++){

                if((j+p_w)>=wd){
                    continue;

                }
                else if(G[i].charAt(j) == P[0].charAt(0) &&
                        G[i].charAt(j+p_w) == P[0].charAt(p_w)
                        && G[i+p_l].charAt(j) == P[p_l].charAt(0)
                        && G[i+p_l].charAt(j+p_w) == P[p_l].charAt(p_w)){
                    boolean noMatch = false;
                    for(int l=0;l<p_l;l++){
                        for(int k=0;k<p_w;k++){
                            if(P[l].charAt(k)!=G[i+l].charAt(j+k)){
                                noMatch = true;
                                result = "";
                                break;
                            }else{
                                result = "YES";
                            }
                        }
                        if(noMatch) break;
                    }

                }




            }

        }

        return result;

    }

public static void main(String str[]){
        String G[] = new String[15];
   /*     G[0] = new String("7283455864");
        G[1] = new String("6731158619");
        G[2] = new String("8988242643");
        G[3] = new String("3830589324");
        G[4] = new String("2229505813");
        G[5] = new String("5633845374");
        G[6] = new String("6473530293");
        G[7] = new String("7053106601");
        G[8] = new String("0834282956");
        G[9] = new String("4607924137");*/
    G[0] = new String("400453592126560");
    G[1] = new String("114213133098692");
    G[2] = new String("474386082879648");
    G[3] = new String("522356951189169");
    G[4] = new String("887109450487496");
    G[5] = new String("252802633388782");
    G[6] = new String("502771484966748");
    G[7] = new String("075975207693780");
    G[8] = new String("511799789562806");
    G[9] = new String("404007454272504");
    G[10] = new String("549043809916080");
    G[11] = new String("962410809534811");
    G[12] = new String("445893523733475");
    G[13] = new String("768705303214174");
    G[14] = new String("650629270887160");

        String P[] = new String[2];
       /* P[0] = new String("9505");
        P[1] = new String("3845");
        P[2] = new String("3530");*/
    P[0] = new String("99");
    P[1] = new String("99");



System.out.print(GridSearch.gridSearch(G,P));





}

}

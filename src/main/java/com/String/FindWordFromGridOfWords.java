package com.String;

import java.util.*;

public class FindWordFromGridOfWords {

    static class Point{
        int x;
        int y;
        public Point(int x,int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString(){
            return x +" "+y;
        }


    }

    static class WordMap implements Comparable<WordMap>{
        String word;
        Point p;
        int length1;
        int currPos;
        
        public WordMap(String word){
            this.word = word;
            this.length1 = word.length();
            this.p = new Point(-1,-1);
            this.currPos = 0;
        }
        
        public void setPoint(Point p){
            this.p = p;
        }
        public Point getPoint(){
            return this.p;
        }
        public void increamentCurrPos(){
            this.currPos++;
        }
        public char getCharAtCurrPos(){
            return this.word.charAt(this.currPos);
        }
        public boolean isFinished(){
            return this.currPos==this.length1;
        }
        public void reset(){
            if(!isFinished()){
                this.currPos = 0;
                this.p = new Point(-1,-1);
            }
        }
        public int getLength1(){
            return this.length1;
        }

        @Override
        public int compareTo(WordMap o) {
            return this.length1-o.length1;
        }
    }


    static int R, C;
    static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };


    static boolean search2D(char[][] grid, int row,
                            int col, Map<String,WordMap> wordMapMap)
    {
       updateWordMap( wordMapMap,grid[row][col],new Point(row,col));
        int len = getMaxLength(wordMapMap);
        for (int dir = 0; dir < 8; dir++)
        {
            int k, rd = row + x[dir], cd = col + y[dir];
            for (k = 1; k < len; k++)
            {
                if (rd >= R || rd < 0 || cd >= C || cd < 0)
                    break;
                if(!updateWordMap( wordMapMap,grid[row][col],new Point(row,col))) break;
                rd += x[dir];
                cd += y[dir];
            }
            if (areWeDone(wordMapMap))
                return true;
        }
        return false;
    }

    static void wordMapSearchInGrid(char[][] grid, Map<String,WordMap> wordMapMap)
    {
        // Consider every point as starting
        // point and search given word
        for (int row = 0; row < R; row++)
        {
            for (int col = 0; col < C; col++)
            {
               if( search2D(grid, row, col, wordMapMap)) return;
                resetWordsMap(wordMapMap);

            }
        }
    }


    static boolean areWeDone(Map<String,WordMap> wordMapMap){
        for(Map.Entry<String,WordMap> e: wordMapMap.entrySet()){
            if(!e.getValue().isFinished()) return false;
        }
        return true;
    }
    static boolean updateWordMap(Map<String,WordMap> wordMapMap, char c, Point p){
        boolean b = false;
        for(Map.Entry<String,WordMap> e: wordMapMap.entrySet()){
            if(e.getValue().isFinished()) continue;
            if(e.getValue().getCharAtCurrPos()==c){
                e.getValue().setPoint(p);
                e.getValue().increamentCurrPos();
                b = true;
            }

        }
        return b;
    }

    static void addWordToWordMap(ArrayList<String> wordList, Map<String,WordMap> wordMapMap){
        for(String s:wordList){
            WordMap wm = new WordMap(s);
            wordMapMap.put(s,wm);
        }
    }

    static void resetWordsMap(Map<String,WordMap> wordMapMap){
        for(Map.Entry<String, WordMap> e: wordMapMap.entrySet()){
            if(e.getValue().isFinished()) continue;
            e.getValue().reset();
        }
    }

    static int getMaxLength(Map<String,WordMap> wordMapMap){
        if(wordMapMap.size() ==0) return 0;
        int maxLen = 0;
        for(Map.Entry<String,WordMap> e: wordMapMap.entrySet()){
            if(e.getValue().isFinished()){
                continue;
            }
            if(e.getValue().getLength1()>maxLen){
                maxLen = e.getValue().getLength1();
            }


        }
        return maxLen;
    }

    static void getResultsfromWordMap(Map<String,WordMap> wordMapMap, TreeMap<String,String> r){

        for(Map.Entry<String,WordMap> e:wordMapMap.entrySet()){
            r.put(e.getKey(),e.getValue().getPoint().toString());
        }
    }

    static char[][] getGrid(ArrayList<String> al){
        int numRow = al.size();
        int numCol = al.get(0).length();
        char r[][] = new char[numRow][numCol];

        for(int i=0;i<numRow;i++){
            for(int j=0;j<numCol;j++){
                r[i][j] = al.get(i).charAt(j);
            }
        }

        return r;

    }



    // Driver code
    public static void main(String args[])
    {
        R = 3;
        C = 13;
        char[][] grid = {{'G','E','E','K','S','F','O','R','G','E','E','K','S'},
                {'G','E','E','K','S','Q','U','I','Z','G','E','E','K'},
                {'I','D','E','Q','A','P','R','A','C','T','I','C','E'}};



        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        ArrayList<String> al_grid = new ArrayList<>();
        ArrayList<String> al_word = new ArrayList<>();
        while(scanner.hasNext()){
            al_grid.add(str);
            str = scanner.next();
            System.out.println("from :" + str);
        }

        str = scanner.next();
        while(scanner.hasNext()){
            al_word.add(str);
            str = scanner.next();
            System.out.println("from 2 :" + str);
        }

        char c[][] =getGrid(al_grid);
        Map<String,WordMap> wordMap = new HashMap<String,WordMap>();
        addWordToWordMap(al_word,wordMap);
        wordMapSearchInGrid(c,wordMap);
        TreeMap<String,String> tm = new TreeMap <>();
        getResultsfromWordMap(wordMap,tm);

       tm.entrySet().forEach(System.out::println);



    }
}


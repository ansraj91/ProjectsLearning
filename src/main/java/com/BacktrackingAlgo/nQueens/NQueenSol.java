package com.BacktrackingAlgo.nQueens;

public class NQueenSol {
    private int nQueens;
    private int chessTable[][];

    public NQueenSol(int nQueens){
        this.nQueens = nQueens;
        this.chessTable = new int[nQueens][nQueens];
    }

    public void solve(){
        if(setQueens(0)){
            System.out.print("Solved!!");
            printChessTable();
        }else{
            System.out.println("No Solution!!");



        }

    }

    public boolean setQueens(int colIndex){
        if(colIndex == nQueens){
            return true;
        }
        for(int rowIndex = 0;rowIndex<nQueens;rowIndex++){
            if(isPlaceValid(rowIndex, colIndex)){
                chessTable[rowIndex][colIndex] = 1;
                if(setQueens(colIndex+1)){
                    return true;
                }
                chessTable[rowIndex][colIndex] = 0;
            }
        }
        return false;
    }

    public boolean isPlaceValid(int rowIndex, int colIndex){
        for(int j=colIndex; j>=0;j--){
            if(chessTable[rowIndex][j] ==1){
                return false;
            }

        }
        for(int i=rowIndex,j=colIndex; i>=0&&j>=0; i--,j--){
            if(chessTable[i][j] ==1){
                return false;
            }
        }
        for(int i=rowIndex,j=colIndex; i<chessTable.length && j>=0;i++,j--){
            if(chessTable[i][j]==1){
                return false;
            }


        }
        return true;
    }

    public void printChessTable(){
        System.out.println();
        for(int i=0;i<chessTable.length;i++){
            for(int j=0;j<chessTable.length;j++){
                if(chessTable[i][j] == 1){
                    System.out.print(" * ");
                }else{
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

}

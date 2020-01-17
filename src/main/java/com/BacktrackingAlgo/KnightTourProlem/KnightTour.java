package com.BacktrackingAlgo.KnightTourProlem;

public class KnightTour {

    int xMoves[] = {1,2,-1,-2,1,2,-1,-2};
    int yMoves[] = {2,1,2,1,-2,-1,-2,-1};

    int chessBoard[][];


    public KnightTour(int chessBoradSize ){
        this.chessBoard = new int[chessBoradSize][chessBoradSize];

    }



    public void solve(){
        chessBoard[0][0] = 1;
        if(isKnightToured(2,0,0)){
            System.out.println("Tour is a success full!!");

            for(int i=0;i<this.chessBoard.length;i++){
                for(int j=0;j<this.chessBoard.length;j++){
                    System.out.print(chessBoard[i][j] + " ");
                }
                System.out.println();
            }

        }
        else{
            System.out.println("Tour is not successfull!!");


            for(int i=0;i<this.chessBoard.length;i++){
                for(int j=0;j<this.chessBoard.length;j++){
                    System.out.print(chessBoard[i][j]);
                }
                System.out.println();
            }

        }
    }


    public boolean isKnightToured(int stepCount, int X,int Y){
          if(stepCount == (chessBoard.length*chessBoard.length)+1){
              return true;

          }


          for(int i=0;i<xMoves.length;i++){
              int nextX = xMoves[i] + X;
              int nextY = yMoves[i] + Y;
              if(isValidMove(nextX,nextY)) {
                  chessBoard[nextX][nextY] = stepCount;


                  if (isKnightToured(stepCount + 1, nextX, nextY)) {
                      return true;
                  }
                  chessBoard[nextX][nextY] = 0;
              }

          }
            System.out.println(stepCount);
          return false;
    }

    public boolean isValidMove(int x,int y){
        if(x<0 || x>=chessBoard.length) return false;
        if(y<0 || y>=chessBoard.length) return false;
        if(chessBoard[x][y] != 0) return false;

        return true;

    }


}

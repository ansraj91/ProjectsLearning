package com.JustPracticeRandomQuestions.QueensAttack;

public class QueensAttack {
    static char chessBoard[][];

    public static  void initilizeChessBoard(int n, int k, int r_q,int c_q, int[][] obstacles ){
        chessBoard = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==r_q && j==c_q){
                    chessBoard[i][j] = 'Q';
                }

            }

            for(int noOfObstacles = 0;noOfObstacles<k;noOfObstacles++){
                int row = obstacles[noOfObstacles][0]-1;
                int col = obstacles[noOfObstacles][1]-1;
                chessBoard[row][col] = 'O';
            }
        }
    }

    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {

        r_q = r_q-1;
        c_q = c_q-1;
        if(r_q<0){
            r_q = 0;
        }
        if(c_q<0){
            c_q=0;
        }
        initilizeChessBoard(n, k, r_q, c_q, obstacles);
       /* if(n==1){
            return 0;
        }*/
        int totalCount = 0;
        totalCount +=left(n, r_q, c_q);
        totalCount +=right(n, r_q, c_q);
        totalCount +=up(n, r_q, c_q);
        totalCount +=bottom(n, r_q, c_q);
        totalCount +=bottomLeft(n, r_q, c_q);
        totalCount +=bottomRight(n, r_q, c_q);
        totalCount +=upperLeft(n, r_q, c_q);
        totalCount +=upperRight(n, r_q, c_q);


        return totalCount;


    }

    public static int left(int n, int r_q, int c_q){
        int count = 0;
                for(int j=c_q-1;j>=0;j--){
                    if(chessBoard[r_q][j]=='O'){
                        break;
                    }
                    count++;
                }
                return count;
    }
    public static int right(int n, int r_q, int c_q){
        int count = 0;
        for(int j=c_q+1;j<n;j++){
            if(chessBoard[r_q][j]=='O'){
                break;
            }
            count++;
        }
        return count;

    }
    public static int bottom(int n, int r_q, int c_q){
        int count = 0;
        for(int i=r_q+1;i<n;i++){
            if(chessBoard[i][c_q]=='O'){
                break;
            }
            count++;
        }
        return count;

    }
    public static int up(int n, int r_q, int c_q){
        int count = 0;
        for(int i=r_q-1;i>=0;i--){
            if(chessBoard[i][c_q]=='O'){
                break;
            }
            count++;
        }
        return count;
    }
    public  static int bottomLeft(int n, int r_q, int c_q){
        int count = 0;
        for(int i=r_q+1, j=c_q-1;i<n&&j>=0;i++,j--){
            if(chessBoard[i][j]=='O'){
                break;
            }
            count++;
        }
        return count;
    }
    public static int bottomRight(int n, int r_q, int c_q){
        int count = 0;
        for(int i=r_q+1, j=c_q+1;i<n&&j<n;i++,j++){
            if(chessBoard[i][j]=='O'){
                break;
            }
            count++;
        }
        return count;
    }
    public static int upperLeft(int n, int r_q, int c_q){
        int count = 0;
        for(int i=r_q-1, j=c_q-1;i>=0&&j>=0;i--,j--){
            if(chessBoard[i][j]=='O'){
                break;
            }
            count++;
        }
        return count;


    }
    public static int upperRight(int n, int r_q, int c_q){
        int count = 0;
        for(int i=r_q-1, j=c_q+1;i>=0&&j<n;i--,j++){
            if(chessBoard[i][j]=='O'){
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String str[]){
        int n=100000;
        int k=0;
        int r_q = 4187;
        int c_q = 5068;
        int obstacles[][] = {{5,5},
                            {4,2},
                             {2,3}};

        int c = queensAttack(n,k,r_q,c_q,obstacles);
        System.out.print(c);
    }
}

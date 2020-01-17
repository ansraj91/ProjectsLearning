package com.BacktrackingAlgo.Maze;

public class MazeSolution {

    int solutionMattrix[][];
    int maze[][];

    public MazeSolution( int maze[][]){
        this.maze = maze;
        this.solutionMattrix = new int[maze.length][maze.length];
    }


    public void solution(){
        if(isSolved(0,0)){
            printSolution();
        }else{
            System.out.println("No solution!!");
        }
    }

    private boolean isSolved(int x, int y){
        if(isFinished(x,y)){
            return true;
        }
        if(isValidMove(x,y)){
            solutionMattrix[x][y] = 1;
            if(isSolved(x+1, y)){
                return true;
            }
            if(isSolved(x,y+1)){
                return true;
            }

            solutionMattrix[x][y] = 0;
        }
        return false;
    }

    private boolean isValidMove(int x,int y){
        if(x<0 || x>maze.length-1){
            return false;
        }
        if(y<0 || y>maze.length-1){
            return false;
        }
        if(maze[x][y] !=1){
            return false;

        }
        return true;
    }

    private boolean  isFinished(int x,int y){
        if(x==maze.length-1 && y ==maze.length-1){
            solutionMattrix[x][y] = 1;
            return true;
        }
        return false;
    }

    private void printSolution(){
        for(int i=0;i<maze.length;i++){
            for (int j=0;j<maze.length;j++){
                if(solutionMattrix[i][j] == 1){
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }


}

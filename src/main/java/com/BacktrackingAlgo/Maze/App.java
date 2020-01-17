package com.BacktrackingAlgo.Maze;

public class App {

    public static void main(String str[]){
        int maze[][] = {{1, 1, 1, 1, 1},
                        {1, 0, 1, 1, 0},
                        {0, 0, 1, 0, 0},
                        {1, 1, 1, 1, 1,},
                        {1, 1, 1, 0, 1}};
        MazeSolution mazeSolution = new MazeSolution(maze);
        mazeSolution.solution();
    }
}

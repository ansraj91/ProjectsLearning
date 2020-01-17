package main.java.com.BacktrackingAlgo.ColouringNode;

public class App {

    public static void main(String str[]){

        int arr[][] = {
                {0,1,0,1,0},
                {1,0,1,1,0},
                {0,1,0,1,0},
                {1,1,1,0,1},
                {0,0,0,1,0}};

        com.BacktrackingAlgo.ColouringNode.ColorEachNode colorEachNode = new com.BacktrackingAlgo.ColouringNode.ColorEachNode(arr,3);
        colorEachNode.solve();
    }
}

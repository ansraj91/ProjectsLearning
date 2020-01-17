package com.BacktrackingAlgo.ColouringNode;

import java.util.Arrays;

public class ColorEachNode {

    int adjencyMattrix[][];
    int noOfVertices;
    int colorArray[];
    int noOfColor;
    public  ColorEachNode(int arr[][], int noOfColor){
        this.adjencyMattrix = arr;
        this.noOfColor = noOfColor;
        this.noOfVertices = arr.length;
        colorArray = new int[noOfVertices];

    }

    public void solve(){
        if(isColoredAllNode(0)){
            System.out.println("Colored All Node");
            Arrays.stream(colorArray).mapToObj(i->Integer.toUnsignedString(i,16)).forEach(System.out::println);

        }else{
            System.out.println("Colored All Node Not possible!1");
        }



    }

    private boolean isColoredAllNode(int nodePos){
        if(nodePos == noOfVertices ){
            return true;
        }
        for(int i=1;i<=noOfColor;i++){
            if(isValidColor(nodePos,i)){
                colorArray[nodePos] = i;
                if(isColoredAllNode(nodePos+1)){
                    return true;
                }
                //backtrack
            }
        }
        return false;
    }

    private boolean isValidColor(int nodePos, int colorIndex){

        for(int indexVertice=0;indexVertice<noOfVertices;indexVertice++){
            if(adjencyMattrix[nodePos][indexVertice] ==1 && colorArray[indexVertice] == colorIndex){
                return false;
            }
        }
        return true;
    }



}

package main.java.Multithreading;

import javax.swing.text.MutableAttributeSet;

public class GetColors {



    public static boolean checkGreyShade(int red, int green, int blue, int shadeDensity){

        return Math.abs(red-green)<shadeDensity && Math.abs(green-blue)<shadeDensity && Math.abs(blue-red) < shadeDensity;


    }

    public static int createRGBFromColor(int red, int blue, int green){
        int rgb = 0;
        rgb |=blue;
        rgb |=green<<8;
        rgb |=red<<16;

        rgb|=0xFF000000;
        return rgb;
    }

    public static int getRed(int rgb){
        return (rgb & 0x00FF0000)>>16;
    }


    public static int getGreen(int rgb){
        return (rgb & 0x0000FF00)>>8;
    }


    public static int getBlue(int rgb){
        return (rgb & 0x000000FF);
    }


}

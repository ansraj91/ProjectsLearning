package main.java.Multithreading;

import sun.nio.cs.ext.MacArabic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ImageProcessing {

    static final String SOURCE_FILE = "C:\\Users\\anshulkhandelwal\\Pictures\\WhatsApp Image 2019-03-14 at 8.39.41 PM.jpeg";
    static final String DESTINATION_FILE ="C:\\Users\\anshulkhandelwal\\Pictures\\myOutput\\img2.jpeg";

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedImage originalImage  = ImageIO.read(new File(SOURCE_FILE));
        BufferedImage resultImage = new BufferedImage(originalImage.getWidth(),originalImage.getHeight(),BufferedImage.TYPE_INT_ARGB);
        long startTime = System.currentTimeMillis();
        recolorMultithreaded(originalImage,resultImage,4);
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time Taken:" + (endTime-startTime));
        File fileOutput=  new File(DESTINATION_FILE);
        ImageIO.write(resultImage,"jpeg",fileOutput);

    }

    public static void recolorMultithreaded(final BufferedImage originalImage, final BufferedImage resultImage, int numOfThreads) throws InterruptedException {
        int width = originalImage.getWidth();
        int height = originalImage.getHeight()/numOfThreads;

        ArrayList<Thread> threads = new ArrayList <>();

        for(int i=0;i<numOfThreads;i++){
            final int threadMultiplier = i;
            Thread t = new Thread(()->{
                int leftCorner = 0;
                int topCorner = threadMultiplier*height;
                recolorImage(originalImage,resultImage,leftCorner,topCorner,height,width);

            });
            threads.add(t);
        }

        for(int i=0;i<numOfThreads;i++){
            threads.get(i).start();
        }
        for(int i=0;i<numOfThreads;i++){
            threads.get(i).join();
        }

    }


    public static void recolorSingleThreaded(final BufferedImage originalImage, final BufferedImage resultImage){
        recolorImage(originalImage,resultImage,0,0,originalImage.getHeight(), originalImage.getWidth());
    }


    public static  final void recolorImage(final BufferedImage originalImage, final BufferedImage resultImage,int leftCorner, int topCorner,int height, int width){

        for(int x = leftCorner;x<leftCorner+width;x++){
            for(int y=topCorner;y<topCorner+height;y++){
                recolourPixel(originalImage,resultImage,x,y);
            }
        }
    }

    public static final void recolourPixel(BufferedImage originalImage, BufferedImage resultImage,int x, int y){
        int rgb = originalImage.getRGB(x,y);

        int red = GetColors.getRed(rgb);
        int green = GetColors.getGreen(rgb);
        int blue = GetColors.getBlue(rgb);

        int newRed;
        int newBlue;
        int newGreen;

        if(GetColors.checkGreyShade(red,blue,green,30)){
            newRed = Math.min(255,red+10);
            newGreen = Math.max(0,green-80);
            newBlue = Math.max(0,blue-20);
        }else{
            newRed = red;
            newBlue = blue;
            newGreen = green;
        }

        int newRGB = GetColors.createRGBFromColor(newRed,newGreen,newBlue);
        setRGB(resultImage,x,y,rgb);
    }


    public static final void setRGB(BufferedImage image, int x, int y, int rgb){
        image.getRaster().setDataElements(x,y,image.getColorModel().getDataElements(rgb,null));
    }


}

package bitmap.transformer;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.nio.Buffer;

public class Bitmap {

    // 4 transforms for bitmaps.
    public BufferedImage blackout(BufferedImage imageIn){
        int imgWidth = imageIn.getWidth();
        int imgHeight = imageIn.getHeight();
        for (int i = 0; i < imgHeight; i++ ){
            for (int j = 0; j < imgWidth; j++){
                Color temp = new Color(1,1,1);
                int tempGrey = temp.getRGB();
                imageIn.setRGB(j,i, tempGrey);
            }
        }
        return imageIn;
    }

    public BufferedImage negativeImage(BufferedImage imageIn){
        int imgWidth = imageIn.getWidth();
        int imgHeight = imageIn.getHeight();
        Color temp;
        for (int i = 0; i < imgHeight; i++ ){
            for (int j = 0; j < imgWidth; j++){
                temp = new Color(imageIn.getRGB(j,i));
                Color negative = new Color(255-temp.getRed(), 255-temp.getBlue(), 255-temp.getGreen());
                int newRGB = negative.getRGB();
                imageIn.setRGB(j,i,newRGB);
            }
        }
        return imageIn;
    }

    public BufferedImage greyScale(BufferedImage imageIn){
        int imgWidth = imageIn.getWidth();
        int imgHeight = imageIn.getHeight();
        Color temp;
        for (int i = 0; i < imgHeight; i++ ){
            for (int j = 0; j < imgWidth; j++){
                temp = new Color(imageIn.getRGB(j,i));
                int newR = temp.getRed();
                int newG = temp.getGreen();
                int newB = temp.getBlue();
                int newVal = (newR + newG + newB) / 3;
                Color greyscale = new Color(newVal, newVal, newVal);
                imageIn.setRGB(j,i,greyscale.getRGB());
            }
        }
        return imageIn;
    }

}

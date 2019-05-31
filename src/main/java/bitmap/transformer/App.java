/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    //pull in args and create a new instance of Bitmap

    public static void main(String[] args) {
        String pathIn = args[0];
        String pathOut = args[1];
        String xform = args[2];
        Bitmap bitmap = new Bitmap();
        BufferedImage inputImage = null;

        try {
           inputImage =  ImageIO.read(new File(pathIn));
           if (xform.equals("black") ){
               inputImage = bitmap.blackout(inputImage);
           } else if (xform.equals("negative")) {
               inputImage = bitmap.negativeImage(inputImage);
            } else if (xform.equals("grey")){
               inputImage = bitmap.greyScale((inputImage));
           }

           ImageIO.write(inputImage, "bmp", new File(pathOut));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

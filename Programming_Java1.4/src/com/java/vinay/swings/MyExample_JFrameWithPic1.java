package com.java.vinay.swings;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import java.awt.Dimension;
import java.io.IOException;
 
public class MyExample_JFrameWithPic1 extends JFrame {
    public static void main(String[] args) {
    	MyExample_JFrameWithPic1 frame = new MyExample_JFrameWithPic1();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(new Dimension(300, 200));
        frame.setTitle("Frame Icon Example");
 
        //
        // Read the image that will be used as the application icon.
        // Using "/" in front of the image file name will locate the
        // image at the root folder of our application. If you don't
        // use a "/" then the image file should be on the same folder
        // with your class file.
        //
        BufferedImage image = null;
        try {
            image = ImageIO.read(frame.getClass().getResource("/wallpaper.jpg"));
        } catch (IOException e) {
            System.out.println(e);
        }
        frame.setIconImage(image);
 
        // Display the form
        frame.setVisible(true);
    }
}
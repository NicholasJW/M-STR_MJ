package com.company.pics;

import javax.swing.*;
import java.awt.image.*;
import java.io.File;
import javax.imageio.ImageIO;


public class TestViewImg {
    private static JFrame jf;
    private static JPanel jp;

    public static void main(String[] args) {
        jf = new JFrame();
        jp = new JPanel();

        jf.setSize(300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(jp);
        jp.setSize(300,300);
        jp.setLocation(0,0);
        jf.setVisible(true);
//        jp.setVisible(true);
        loadImg();
    }

    private static void loadImg(){
        try{
            BufferedImage myPicture = ImageIO.read(new File("/Users/ywan/MJmstr/src/com/company/pics/1w.png"));
//            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            JLabel picLabel = new JLabel("This is the pic label");
            jp.add(picLabel);
        }catch(Exception e){
            System.out.println("Error loading testing MJ Image");
            System.exit(1);
        }
    }
}

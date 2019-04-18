package com.company.pics;

import javax.swing.*;
import java.awt.image.*;
import java.io.File;
import javax.imageio.ImageIO;


public class TestViewImg {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JPanel jp = new JPanel();

        jf.setSize(300,300);
        try{
            BufferedImage myPicture = ImageIO.read(new File("/Users/ywan/MJmstr/src/com/company/pics/1w.png"));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            jp.add(picLabel);
        }catch(Exception e){
            System.out.println("Error loading testing MJ Image");
            System.exit(1);
        }
        jf.add(jp);
        jf.setVisible(true);
//        jp.setVisible(true);
    }
}

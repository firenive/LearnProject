package Myrusakov.Chapter7_Graphic.Lesson4_Image.Exe;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageExe {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Out image");
        frame.setBounds(200,200,1024,768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new FlowLayout());


        JTextField urlField = new JTextField();
        urlField.setPreferredSize(new Dimension(500,30));
        JButton out = new JButton("Get Image");
        frame.add(urlField);
        frame.add(out);
        frame.setVisible(true);
        out.addActionListener((ae) -> {
            if (ae.getActionCommand().equals("Get Image")) {
                try {
                    String url = urlField.getText();
                    BufferedImage image = ImageIO.read(new URL(url));
                     Image small = image.getScaledInstance(640,480, Image.SCALE_SMOOTH);
                    Graphics2D g2 = (Graphics2D)frame.getGraphics();
                    g2.drawImage(small,10,80, null);

                } catch (MalformedURLException ex) {
                    JOptionPane.showMessageDialog(frame, "Please give me link image");
                } catch (IOException | NullPointerException ex) {
                    JOptionPane.showMessageDialog(frame, "Not image for this link");
                }

            }
        });



    }
}

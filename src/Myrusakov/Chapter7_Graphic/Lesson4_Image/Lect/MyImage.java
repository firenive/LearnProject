package Myrusakov.Chapter7_Graphic.Lesson4_Image.Lect;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MyImage {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("New program");
        frame.setBounds(300,300,1024,768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Graphics2D g2 = (Graphics2D) frame.getGraphics(); // рисование на форме без вызова метода paint
        // не применяется для больших объектов

        // берем картинку из интернета
        Image imageURL = ImageIO.read(new URL("https://images.wallpaperscraft.ru/image/velosiped_les_derevia_166718_1024x768.jpg"));
        Image small = imageURL.getScaledInstance(640,480,Image.SCALE_SMOOTH);
        // уменьшаем картинку до указанного размера. последний параметр является параметром сжатия изображения
        // читаем картинку с компьютера
        Image imageFile = ImageIO.read(new File("Images/211.jpg"));
        g2.drawImage(imageURL, 50, 50, null); // размещение картинки в левом верхнем  углу
        g2.drawImage(small,200, 50, null);

    }
}

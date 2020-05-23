package Myrusakov.Chapter6_UserInterface.Lesson1_CreateWindow.Lect;

import javax.swing.*;
import java.awt.*;

public class CreateWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Моя программа"); // создаем окно
        frame.setBounds(300,300,640,480);// x,y начальные координаты окна (верхний левый угол)
        // по координате x, y. 640 ширина окна, 480 высота окна
        frame.setResizable(false); // запрещаем изменять размер окна
        frame.setVisible(true); // делаем окно видимым
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // завершение программы при закрытии окна

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize(); // получение разрешения экрана
        frame.setBounds(0,0, size.width, size.height); // устанавливаем для создаваемого окна размеры экрана
        System.out.println(size); // java.awt.Dimension[width=1920,height=1080]
        frame.setLocation(10, 10); // Устанавливает начальные коордтнаты положения окна
        Dimension size640_480 = new Dimension(640,480); // Dimension по умолчанию хранит в себе ширину/ высоту int
        frame.setSize(size640_480); // устанавливаем размер окна

    }
}

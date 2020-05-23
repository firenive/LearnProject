package Myrusakov.Chapter7_Graphic.Lesson1_BasicGraphic.Lect;

import javax.swing.*;
import java.awt.*;

public class BasicGraphic extends JFrame {
    public static void main(String[] args) {
        new BasicGraphic();

    }
    public BasicGraphic () {
        super("Graphic program");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,640,480);
        setVisible(true);
    }
    public void paint(Graphics g) { // Рисование производится с помощью этого элемента
        super.paint(g); // перед рисованием необходимо вызвать метод paint у родителя Graphics и передать в него параметр
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(100,100,200,250); // рисуем прямоугольник с заданными параметрами
        // первые два параметра задают начальную точку прямоугольника по координатам x, y.
        // 3-ий и 4-ый параметр ширина и высота прямоугольника

    }
}

package Myrusakov.Chapter7_Graphic.Lesson5_MyComponent.Lect;

import javax.swing.*;
import java.awt.*;

public class MyComponentGraphic {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,300,640,480);
        frame.setLayout(new FlowLayout());
        GraphicButton button = new GraphicButton("My button");
        button.setPreferredSize(new Dimension(200,100));
        // когда курсор наводится на кнопку он меняет свой вид на указанный
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        frame.add(button);
        frame.setVisible(true);
    }
}

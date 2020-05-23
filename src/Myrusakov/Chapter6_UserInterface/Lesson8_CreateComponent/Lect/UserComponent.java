package Myrusakov.Chapter6_UserInterface.Lesson8_CreateComponent.Lect;

import javax.swing.*;

public class UserComponent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My program");
        frame.setBounds(200,200,400,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        UserButton exit = new UserButton("Exit", ButtonListener.EXIT);
        exit.addActionListener(new ButtonListener());

        UserButton print = new UserButton("Print", ButtonListener.PRINT);
        print.addActionListener(new ButtonListener());


        JPanel panel = new JPanel();

        print.setAlignmentX(JComponent.CENTER_ALIGNMENT); // Расположение кнопки по центру координаты x
        exit.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // менеджер компоновки позволяет менять расположение компонентов горизонтально или вертикально.
        // изменим расположение расположенных кнопок на вертикальное

        panel.add(print);
       //  panel.add(Box.createVerticalGlue()); // Добавляем отступ между кнопками. Отступ размером на всю имеющуюся панель
        panel.add(Box.createVerticalStrut(10)); // Добавление интервала между компонентами. Интервал с заданным размером = 10
        panel.add(exit);


        frame.add(panel);
        frame.setVisible(true);
    }
}

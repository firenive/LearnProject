package Myrusakov.Chapter6_UserInterface.Lesson5_GUIMenu.Lect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIMenu {
    private JMenuItem blue;
    private JMenuItem yellow;

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200,400,250);
        frame.setResizable(false);
        // отдельный класс для обработки событий
        MyListener listener = new MyListener(frame);

        // Создаем объект класса JMenuBar
        JMenuBar bar = new JMenuBar(); // отвечает за саму панель меню
        JMenu main = new JMenu("Program"); // Сами пунктты меню.
        JMenuItem exit = new JMenuItem("Exit"); // Добавляем подпункт меню
        JMenuItem dark = new JMenuItem("Dark theme");

        JMenu back = new JMenu("Background");
        JMenu color = new JMenu("Color"); // подменю. добавляется основным меню back
        JMenuItem blue = new JMenuItem("Blue"); // пункты меню ответственные за смену цветов фона.
        JMenuItem yellow = new JMenuItem("Yellow");

        JCheckBoxMenuItem menuCheck = new JCheckBoxMenuItem("Select me"); // пункт меню в виде чекбокса

        main.setForeground(Color.WHITE); // цвет шрифта пункта меню
        bar.setBackground(Color.DARK_GRAY); // цвет бэкграунда панели
        back.setForeground(Color.WHITE);
        dark.setBackground(Color.DARK_GRAY);
        dark.setForeground(Color.WHITE);

        main.add(dark); // еще один подпункт
        main.add(menuCheck);
        main.addSeparator(); // разделитель между пунктами меню
        main.add(exit); // добавляем подпункт

        back.add(color);
        color.add(yellow);
        color.add(blue);

        bar.add(main); // Добавляем пункт на панель
        bar.add(back);
        frame.setJMenuBar(bar);  // устанавливаем панель для нашего окна


        // Обработка событий по нажатию элементов меню
        exit.addActionListener(listener);
        dark.addActionListener(listener);
        blue.addActionListener(listener);
        yellow.addActionListener(listener);
        menuCheck.addActionListener(listener);

        dark.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.DARK_GRAY); // сначала получаем контейнер данного окна
                // main.getsetBackground(Color.DARK_GRAY);
                back.setBackground(Color.DARK_GRAY);
                color.setBackground(Color.DARK_GRAY);
                menuCheck.setBackground(Color.DARK_GRAY);

                menuCheck.setForeground(Color.WHITE);
                exit.setForeground(new Color(230,63, 209));
                color.setForeground(new Color(68, 139, 32));
                yellow.setForeground(Color.WHITE);
                blue.setForeground(Color.WHITE);

            }
        });


        frame.setVisible(true);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }  catch (IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }




}

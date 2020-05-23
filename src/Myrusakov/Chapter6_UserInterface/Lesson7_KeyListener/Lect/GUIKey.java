package Myrusakov.Chapter6_UserInterface.Lesson7_KeyListener.Lect;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUIKey extends JFrame {
    public GUIKey() {
        super("My program");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200,200,400,250);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Might be printed (text keys)");


            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key pressed");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("key released");
                System.out.println(e.getKeyCode()); // позволяет получить код нажимаемой клавиши
                if (e.getKeyCode() == 27) System.exit(0); // если нажата клавиша Esc выходим из программы


            }
        });


        setVisible(true);
    }

    public static void main(String[] args) {
        new GUIKey();
    }
}

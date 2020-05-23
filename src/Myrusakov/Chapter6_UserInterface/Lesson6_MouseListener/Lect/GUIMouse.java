package Myrusakov.Chapter6_UserInterface.Lesson6_MouseListener.Lect;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUIMouse extends JFrame {
    public GUIMouse() {
        setBounds(200,200,400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { // щелчок мыши на элемент
                // System.out.println("Clicked");
                System.out.print(e.getX() + " " + e.getY() + "\n"); // получаем координаты при нажатии на frame
                e.getButton(); // узнаем какая кнопка была нажата
                if( e.getButton() == MouseEvent.BUTTON1) System.out.println("Left"); // левая
                if( e.getButton() == MouseEvent.BUTTON2) System.out.println("Middle"); // правая
                if( e.getButton() == MouseEvent.BUTTON3) System.out.println("Right"); // средняя



            }

            @Override
            public void mousePressed(MouseEvent e) { // удерживание кнопки мыши
               // System.out.println("Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) { // событие при отпускании кнопки мыши (средняя, правая, левая)
                // System.out.println("Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) { // курсор мыши навелся на компонент (обычно делают выделение)
                // System.out.println("Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) { // курсор мыши ушел с компонента (прекращение выделения компонента)
                // System.out.println("Exited");
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUIMouse();

    }

}

package Myrusakov.Chapter6_UserInterface.Lesson3_Layout.Lect;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GUILayouts {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension size = new Dimension(400, 250);
        Point base = new Point(200, 200);
        frame.setLocation(base);
        frame.setSize(size);
        frame.setLayout(new BorderLayout());
        // размещает элементы по позициям (North - верх, South - Вниз, West - слева, East - справа)

        JPanel top = new JPanel(); // верхняя панель
        top.setBorder(new EmptyBorder(20,0,0,0)); // создание пустой рамки для панели с указанными
        // отступами от границ рамки с разных сторон. Указан только отступ сверху 20 пикселей
        JLabel title = new JLabel("My form");
        title.setFont(new Font("Helvetica", Font.BOLD, 22)); // изменим шрифт у надписи
        top.add(title);

        JPanel middle = new JPanel();
        middle.setLayout(new GridBagLayout());
        middle.setBorder(new EmptyBorder(5,0,0,0));
        JLabel nameUser = new JLabel("Name: ");
        JLabel emailUser = new JLabel("Email: ");
        nameUser.setFont(new Font("Helvetica",Font.PLAIN, 16)); // plain обычный шрифт
        emailUser.setFont(new Font("Helvetica", Font.PLAIN, 16));
        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();

        nameUser.setHorizontalAlignment(SwingConstants.RIGHT); // Горизонтальное выравнивание по правому краю
        emailUser.setHorizontalAlignment(SwingConstants.RIGHT); // Горизонтальное выравнивание по правому краю

        nameField.setPreferredSize(new Dimension(150,20)); // указываем размер текстовых полей
        emailField.setPreferredSize(new Dimension(150,20));

        GridBagConstraints constrains = new GridBagConstraints(); // определяем положение объектов относительно друг друга
        // сначала указывается ее положение по горизонтали, потом по вертикали.
        constrains.fill = GridBagConstraints.BOTH; // по умолчанию элементы располагаются в центре предоставляемой формы
        // указываем, что делать если элементом на форме заполнен не весь предлагаемый размер
        constrains.gridx = 0;
        constrains.gridy = 0;
        constrains.insets = new Insets(0,10,10,0); // указываем отступы от полей
        middle.add(nameUser, constrains);

        constrains.gridx = 1;
        constrains.gridy = 0;
        middle.add(nameField, constrains);

        constrains.gridx = 0;
        constrains.gridy = 1;
        middle.add(emailUser, constrains);

        constrains.gridx = 1;
        constrains.gridy = 1;
        middle.add(emailField, constrains);

        JPanel bottom = new JPanel();
        bottom.setBorder(new EmptyBorder(0,0,0,0));
        JCheckBox check = new JCheckBox("Subscribe to news");
        check.setFont(new Font("Helvetica", Font.ITALIC, 14));
        JButton send = new JButton("Send");
       // send.setPreferredSize(new Dimension(75,40)); // указываем размер кнопки

        bottom.add(check);
        bottom.add(send);

        frame.add(top, BorderLayout.NORTH); // указываем расположение панелей. доступно если указать для окна BorderLayout
        frame.add(middle, BorderLayout.CENTER);
        frame.add(bottom,BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}

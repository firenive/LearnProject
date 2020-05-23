package Myrusakov.Chapter6_UserInterface.Lesson4_Event.Lect;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame implements ActionListener {
    private JTextField nameField;
    private JTextField emailField;
    private JCheckBox check;

    public MyFrame() {
        super("My program");
        setBounds(200, 200, 400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel top = new JPanel(); // верхняя панель
        top.setBorder(new EmptyBorder(20, 0, 0, 0)); // создание пустой рамки для панели с указанными
        // GridBagConstraints topConstr = new GridBagConstraints();
        // отступами от границ рамки с разных сторон. Указан только отступ сверху 20 пикселей
        JLabel title = new JLabel("My form");
        title.setFont(new Font("Helvetica", Font.BOLD, 22)); // изменим шрифт у надписи
        top.add(title);
        GridBagConstraints constrains = new GridBagConstraints(); // определяем положение объектов относительно друг друга

        JPanel middle = new JPanel();
        middle.setLayout(new GridBagLayout());
        middle.setBorder(new EmptyBorder(5, 0, 0, 0));
        JLabel nameUser = new JLabel("Name: ");
        JLabel emailUser = new JLabel("Email: ");
        nameUser.setFont(new Font("Helvetica", Font.PLAIN, 16)); // plain обычный шрифт
        emailUser.setFont(new Font("Helvetica", Font.PLAIN, 16));
        nameField = new JTextField();
        emailField = new JTextField();
        // JButton dark = new JButton("Dark theme");

        // добавляем меню бар и пункт меню
        JMenuBar bar = new JMenuBar();
        JMenu main = new JMenu("View");
        main.setForeground(Color.WHITE);
        bar.setBackground(Color.DARK_GRAY);
        JMenuItem dark = new JMenuItem("Dark theme");
        dark.setBackground(Color.DARK_GRAY);
        dark.setForeground(Color.WHITE);
        main.add(dark);
        bar.add(main);
        setJMenuBar(bar);

        nameUser.setHorizontalAlignment(SwingConstants.RIGHT); // Горизонтальное выравнивание по правому краю
        emailUser.setHorizontalAlignment(SwingConstants.RIGHT); // Горизонтальное выравнивание по правому краю

        nameField.setPreferredSize(new Dimension(150, 20)); // указываем размер текстовых полей
        emailField.setPreferredSize(new Dimension(150, 20));

        // сначала указывается ее положение по горизонтали, потом по вертикали.
        // constrains.fill = GridBagConstraints.BOTH; // по умолчанию элементы располагаются в центре предоставляемой формы
        // указываем, что делать если элементом на форме заполнен не весь предлагаемый размер
        constrains.gridx = 0;
        constrains.gridy = 0;
        constrains.insets = new Insets(0, 10, 10, 0); // указываем отступы от полей
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
        bottom.setBorder(new EmptyBorder(0, 0, 0, 0));
        check = new JCheckBox("Subscribe to news");
        check.setFont(new Font("Helvetica", Font.ITALIC, 14));
        JButton send = new JButton("Send");
        // send.setPreferredSize(new Dimension(75,40)); // указываем размер кнопки

        bottom.add(check);
        bottom.add(send);

        add(top, BorderLayout.NORTH); // указываем расположение панелей. доступно если указать для окна BorderLayout
        add(middle, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);


        // Обработчки событий
        dark.addActionListener(new ActionListener() { // реализация обработчика через анонимный класс
            @Override
            public void actionPerformed(ActionEvent e) {
                top.setBackground(Color.DARK_GRAY); // изменяем цвет фона верхней панели при нажатии на кнопку
                middle.setBackground(Color.DARK_GRAY);
                bottom.setBackground(Color.DARK_GRAY);
                check.setBackground(Color.DARK_GRAY);

                nameUser.setForeground(Color.WHITE);
                emailUser.setForeground(Color.WHITE);
                title.setForeground(Color.WHITE);
                check.setForeground(Color.WHITE);
            }
        });
        send.addActionListener(this); // добавляем обработку событий для кнопки send
        check.addActionListener(this);
    }

    @Override // реализация обработчика через реализацию интерфейса
    public void actionPerformed(ActionEvent ae) {
        // System.out.println(ae.getActionCommand()); // Позволяет определить какая именно команда была передана в обработку
        // Например (Subscribe to news, Send)
        if (ae.getActionCommand().equals("Subscribe to news")) {
            System.out.println("Нажат чекбокс");
        } else if (ae.getActionCommand().equals("Send")) {
            System.out.println("Нажата кнопка");
            String name = nameField.getText(); // получаем данные из полей name, email
            String email = emailField.getText();
            boolean checkSelect = check.isSelected(); // true, если чекбокс выбран, иначе false
            try {
                Users user = new Users(name, email, checkSelect); // создаем новый объект класса User, передаем в параметрах
                Users.add(user); // добавляем нового пользователя в массив
                Users.printAllUsers(); // после каждого нажатия печатаем всех пользователей
                // имя, email. Выбран чекбокс или нет
            } catch (UserException er) {
                if (er.getCode() == UserException.NO_NAME) showError("You are not entered Name");
                if (er.getCode() == UserException.NO_EMAIL) showError("You are not entered Email");

            }
        }
    }

    private void showError(String error) {
        if (error.equals("You are not entered name"))
            JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
            // первый параметр. родительноское окно. Так как класс MyFrame наследует JFrame указываем this
            // второй параметр текст сообщения об ошибке
            //  третий параметр заголовок окна
            // Четрвертый параметр иконка сообщения о ошибке
        else if (error.equals("You are not entered email"))
            JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
    }

}

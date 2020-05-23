package Myrusakov.Chapter7_Graphic.Lesson3_Animation.Lect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Animation extends JFrame implements KeyListener, ActionListener {
    private int x = 100;
    private int y = 100;
    private static final int DELTA = 10;

    private Timer timer;
    public static void main(String[] args) {
        new Animation();
    }
    public Animation() {
        super("Animation");
        setBounds(300,300,640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
        setLayout(new FlowLayout());

        // сделаем анимацию по нажатию кнопки. При нажатии на кнопку ее текст меняется на Stop и начинается анимация.
        // При повторном нажатии на кнопку, ее текст меняется на Start, анимация заканчивается
        JButton start = new JButton("Start");
        start.addActionListener((ae) -> {
            if(ae.getActionCommand().equals("Start")) {
                start.setText("Stop");
                timer.start(); // запуск таймера по нажатию кнопки

            }
            else if( ae.getActionCommand().equals("Stop")) {
                start.setText("Start");
                timer.stop();
            }
        });
        add(start);
        setVisible(true);
        // Анимацию будем делать черз класс Timer. Делает определенное действие с заданным промежутком времени
        // Первый параметр Указывается периодичность с которой операция выполняется (миллисекунды)
        // второй параметр, выполняемое действие. задается с помощью ActionListener
        timer = new Timer(200, this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // ActionListener для Timer. Изменяем координату x, что позволяет передвигать прямоугольник вправо с заданным промежутком времени
        System.out.println(x);
        x +=10;
        repaint(); // Перерисовка объекта
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(0,150,0));

        // Задача. сделать анимацию по передвижению треугольника стрелочками на клавиатуре
        // обработка приближения прямоугольника к границам окна. Прямоугольник не должен выходить за них
        if (x + 70 > getSize().width) x = getSize().width - 70;
        if (y + 70 > getSize().height) y = getSize().height - 70;
        if (x < 0) x = 10;
        if (y < 30) y = 30;
        g2.fillRect(x,y,60,60);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // в зависимости от нажатой клавиши стрелки двигаем фигуру по заданным координатам
        int code = e.getKeyCode();
        if (code == 38) y -= DELTA;
        if (code == 40) y += DELTA;
        if (code == 37) x -= DELTA;
        if (code == 39) x += DELTA;
        SwingUtilities.updateComponentTreeUI(this);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

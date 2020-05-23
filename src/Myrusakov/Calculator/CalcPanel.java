package Myrusakov.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcPanel extends JPanel {
    JPanel panel;
    private boolean start;
    private JButton display;
    private String lastCommand;

    private double result;

    public CalcPanel() {
        super();

        start = true; // переменная нужна для того чтобы показывать стартовое состояние программы
        lastCommand = "=";
        setLayout(new BorderLayout());
        display = new JButton("0");
        display.setEnabled(false); // делает кнопку неактивной (недоступной для нажатия)
        add(display, BorderLayout.NORTH);

        // создание вложенной панели
        panel = new JPanel();
        panel.setLayout(new GridLayout(4,4)); // принимает два параметра. количество строк и количество столбцов
        // все добавляемые компоненты будут распологаться по строкам и столбцам автоматически

        // обработка событий
        InsertAction insert = new InsertAction();
        CommandAction command = new CommandAction();

        // первый ряд кнопок
        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("/", command);
        // второй ряд кнопок
        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("*", command);
        // третий ряд кнопок
        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", command);
        // четвертый ряд кнопок
        addButton("0", insert);
        addButton(".", insert);
        addButton("=", command);
        addButton("+", command);


        add(panel, BorderLayout.CENTER);

    }

    private void addButton(String label, ActionListener listener) { // метод для автоматического создания и расположения кнопок на панели
        JButton button = new JButton(label); // в качестве параметра передаем название кнопки
        button.addActionListener(listener); // добавляем обработчик событий для кнопки
        panel.add(button);
    }
    private class InsertAction implements ActionListener { // отвечает за вставку символов и цифр

        @Override
        public void actionPerformed(ActionEvent e) {
            String input = e.getActionCommand();
            if (start) { // очищаем кнопку дисплей при начале работы программы для удобства ввода
                display.setText("");
                start = false;
            }
            if (input!= "." || display.getText().indexOf(".") == -1) { // данное уловие необходимо для того чтобы нельзя было потавить несколько точек подряд
                display.setText(display.getText() + input); // текст на кнопке устанавливается в оответтвии с нажатой кнопкой
            }
        }
    }
    private class CommandAction implements ActionListener { // отвечает за действия умножения, деления, вычитания, сложения

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (start) lastCommand = command; // Если никакое число не было введено,
            // а была ведена операция, сохраняем операцию
            else {
                calc(Double.parseDouble(display.getText())); // вычисления происходят в методе calc
                lastCommand = command;
                start = true;
            }
        }
        public void calc(double x) {
            if(lastCommand.equals("+")) result += x;
            else if (lastCommand.equals("-")) result -=x;
            else if (lastCommand.equals("*")) result *= x;
            else if (lastCommand.equals("/")) result  /= x;
            else if (lastCommand.equals("=")) result = x;
            display.setText(Double.toString(result));
        }
    }
}

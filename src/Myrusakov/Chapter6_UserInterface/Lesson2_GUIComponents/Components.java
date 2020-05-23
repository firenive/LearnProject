package Myrusakov.Chapter6_UserInterface.Lesson2_GUIComponents;

import javax.swing.*;

public class Components {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My program");
        frame.setBounds(200,300, 800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(); // панель предназначена для размещения элементов

        JButton button = new JButton("Touch me"); // добавляем кнопку с указанным названием
        JLabel label = new JLabel("Если согласен нажми кнопку"); // надпись
        JCheckBox check = new JCheckBox("Согласен на рабство?"); // чекбокс
        JTextField field = new JTextField("Текст по умолчанию"); // текстовое поле

        ButtonGroup group = new ButtonGroup(); // объединяет радиокнопки в группы, что позволяет выполнять автоматическое
        // переключение, при выборе другой кнопки в группе. По умолчанию радиокнопки позволяют выбрать 1 значение из вариантов
        JRadioButton radio1 = new JRadioButton("RadioButton1");
        JRadioButton radio2 = new JRadioButton("RadioButton2");

        JTextArea area = new JTextArea(); // текстовая область. автоматически меняется размер при введении текста

        // создадим таблицу на форме
        String[][] data = {{"1","2"}, {"3", "Text"}, {"4", "Hello"}}; // содержимое таблицы
        String[] columns = {"First column", "Second column"}; // наименования столбцов таблицы

        JTable table = new JTable(data, columns); // первый аргумент таблица, второй наименования столбцов
        JScrollPane scroll = new JScrollPane(table); // добавления скролинга для таблицы

        group.add(radio1); // добавляем радиокнопки в группу
        group.add(radio2);

        panel.add(check);
        panel.add(label); // добавляем надпись
        panel.add(button); // добавляем кнопку на панель
        panel.add(field);
        panel.add(radio1); // отдельно добавляем каждую радиокнопку
        panel.add(radio2);
        panel.add(area);
        panel.add(scroll); // саму таблицу не добавляем, а добавляем только объект ScrollPane

        frame.add(panel); // добавляем панель на окно

        frame.setVisible(true); // рекомендуется делать в последнюю очередь, после выведения всех компонентов
    }
}

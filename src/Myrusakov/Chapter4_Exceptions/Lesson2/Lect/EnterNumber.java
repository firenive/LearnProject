package Exceptions.Lesson2.Lect;

import javax.swing.*;

public class EnterNumber {
    public static void main(String[] args) {
        String in_1 = JOptionPane.showInputDialog(null, "Пожалуйста введите число");
        try {
            int x = Integer.parseInt(in_1);
            System.out.println("Спасибо!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "неккоректный ввод");
        }
    }
}

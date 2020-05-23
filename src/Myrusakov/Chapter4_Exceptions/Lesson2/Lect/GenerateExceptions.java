package Exceptions.Lesson2.Lect;

import javax.swing.*;

public class GenerateExceptions {


    public static void main(String[] args) {
        String in1 = JOptionPane.showInputDialog(null, "Введите первое положительное число: ");
        String in2 = JOptionPane.showInputDialog(null, "Введите второе положительное число: ");
        try {
            int a = Integer.parseInt(in1);
            int b = Integer.parseInt(in2);
            if( a <= 0 || b <=0) throw  new Exception();
        } catch (Exception e) {
            System.out.println("Вы ввели некорректные данные");
        } finally {
            System.out.println("Завершение программы");
        }
    }
}

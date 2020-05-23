package Exceptions.Lesson3;

import javax.swing.*;

public class Lesson3 {
    public static void main(String[] args) {
        String in1 = JOptionPane.showInputDialog(null, "Пожалуйста введите первое положительное число");
        String in2 = JOptionPane.showInputDialog(null, "Пожалуйста введите второе положительное число");
        try {
            int a = Integer.parseInt(in1);
            int b = Integer.parseInt(in2);
            if (a <= 0 || b<=0) throw new Exception();
            System.out.println("Сумма чисел: " + a + " + " +b + " = " +(a+b));
        } catch (NumberFormatException e) { // Если исключений несколько сначала идут частные исключения, затем глобальные
            System.out.println(e);
            System.out.println("Вы ввели не число");
        } catch (Exception e2) {
            System.out.println(e2);
            System.out.println("Вы не ввели положительное число");
        } finally {
            System.out.println("Завершение программы");
        }
    }
}

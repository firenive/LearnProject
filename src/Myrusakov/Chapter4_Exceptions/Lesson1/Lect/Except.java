package Exceptions.Lesson1.Lect;

import javax.swing.*;
import java.util.Scanner;

public class Except {
    public static void main(String[] args) {
       // String s1 = JOptionPane.showInputDialog(null, "Введите первое число");
        // или
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое  число: ");
        String scanString1 = scan.nextLine();
        System.out.print("Введите второе  число: ");
        String scanString2 = scan.nextLine();
        try {
            int a = Integer.parseInt(scanString1);
            int b = Integer.parseInt(scanString2); // этот код и последующий выполняется только если первая строчка в блоке
            // try не выбросила исключение
            System.out.println("Сумма чисел: " + a + " + " + b + " = " + (a + b));
        } catch (NumberFormatException e) { // попадаем сюда только если в блоке try сформировалась ошибка выбранным типом
            JOptionPane.showMessageDialog(null, "Вы не ввели число!");
            System.out.println(e);
        }
    }
}

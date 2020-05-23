package Myrusakov.Chapter4_Exceptions.Lesson4.Exe;

import javax.swing.*;

public class EnterNumber {
    public static String trans;

    public static void main(String[] args) {
        trans = JOptionPane.showInputDialog(null, "Пожалуйста введите число");
        try {
            if (trans == null || trans.equals("")) throw new NullException();
            int z = EnterNumber.process(trans);
            if (z == -343276576) throw new NoNumberException();
            System.out.println("Спасибо");
        } catch (NullException | NoNumberException ne) {
            System.out.println(ne);
        }
    }

    public static int process(String trans) {
        try {
            return Integer.parseInt(trans);
        } catch (NumberFormatException nfe) {
            return -343276576;
        }
    }
}

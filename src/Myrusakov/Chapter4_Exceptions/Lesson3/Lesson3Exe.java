package Exceptions.Lesson3;

import javax.swing.*;

public class Lesson3Exe {
    public static void main(String[] args) {
        int[] x = {0, 1, 2,3,4};
        String in1 = JOptionPane.showInputDialog(null, "Введите индекс нужного элемента массива. От 0 до 4");
        try {
            int b = Integer.parseInt(in1);
            if (b < 0) throw new Exception();
            JOptionPane.showMessageDialog(null, x[b]);
        } catch (NumberFormatException nfe) {
            System.out.println("Индекс должен быть целочисленным");
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Индекс нужного элемента массива находится в границах [0-4]");
        }
        catch (Exception e) {
            System.out.println("Индекс должен быть положительным");
        }
    }
}

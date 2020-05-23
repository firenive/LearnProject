package Myrusakov.Chapter5_GeneralClasses.Lesson2_Math.Exe;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Profit {
    public static void main(String[] args) {
        // вычисляем прибыль по вкладу
        String sumJ = JOptionPane.showInputDialog(null, "Введите сумму на счете");
        String percentJ = JOptionPane.showInputDialog(null, "Введите процентную ставку");
        System.out.println(" Прибыль за год = " + profitYear(sumJ, percentJ));
    }
    public static BigDecimal profitYear (String sum, String percent) {
        Double s = Double.parseDouble(sum);
        Double p = Double.parseDouble(percent);
        return new BigDecimal(s * p / 100).setScale(2, RoundingMode.HALF_UP);
    }
}

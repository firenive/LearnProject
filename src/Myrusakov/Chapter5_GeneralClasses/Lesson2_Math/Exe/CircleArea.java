package Myrusakov.Chapter5_GeneralClasses.Lesson2_Math.Exe;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CircleArea {
    public static void main(String[] args) {
       // Вычисляем площадь круга
        String s1 = JOptionPane.showInputDialog(null," Введите радиус окружности");
        JOptionPane.showMessageDialog(null, "Площадь круга "
                + " с радиусом " + s1 + " = " +areaCircle(s1));
    }

    public static BigDecimal areaCircle(String radius) {
        Double d = Double.parseDouble(radius);
        double s = Math.PI * Math.pow(d, 2);
        BigDecimal sb = new BigDecimal(s).setScale(3, RoundingMode.HALF_UP);
        return sb;
    }
}

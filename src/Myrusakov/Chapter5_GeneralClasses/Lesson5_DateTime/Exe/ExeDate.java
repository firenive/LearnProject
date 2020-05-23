package Myrusakov.Chapter5_GeneralClasses.Lesson5_DateTime.Exe;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
 // 12.04.2015 12:30:45
public class ExeDate {
    public static void main(String[] args) {
        Date exe = new Date();
        Calendar calc = new GregorianCalendar();
        calc.setTime(exe);
        long ms = calc.getTimeInMillis();
        System.out.println(ms);
        String enterDate = JOptionPane.showInputDialog(null, "Введите дату в следующем формате: " +
                " \'День.месяц.год\'");
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date formatDate = format.parse(enterDate);
            Calendar incYear = new GregorianCalendar();
            incYear.setTime(formatDate);
            incYear.add(GregorianCalendar.YEAR,  1);
            formatDate.setTime(incYear.getTimeInMillis());
            JOptionPane.showMessageDialog(null, format.format(formatDate));
        } catch (ParseException | NullPointerException  e) {
            JOptionPane.showMessageDialog(null,
                    "Вы ввели дату в неправильном формате. Пожалуйста повторите ввод");

            System.exit(2);
        }

    }
}

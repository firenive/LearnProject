package Myrusakov.Chapter5_GeneralClasses.Lesson5_DateTime.Lect;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ObjectDateTime {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d); // текущая время дата
        Calendar c = new GregorianCalendar(); // GregorianCalendar класс наследник Calendar
        System.out.println(c.getTimeInMillis()); // количество милисекунд с 1 января 1970
        c.set(1980, 12, 05, 14, 30); // Установка даты  и времени для объекта
        c.set(GregorianCalendar.YEAR, 2020); // изменяем год
        c.set(GregorianCalendar.MONTH, GregorianCalendar.JANUARY);
        c.set(GregorianCalendar.DAY_OF_MONTH, 4);
        c.set(GregorianCalendar.HOUR, 22);
        c.set(GregorianCalendar.MINUTE, 15);
        c.set(GregorianCalendar.SECOND, 27);
        System.out.println(c.get(GregorianCalendar.YEAR));

        // преобразуем строку в Date
        String date = "15.12.2015 12:00:00";
        // указываем шаблон соответствующий строке выше
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date parse;
        Calendar calc = new GregorianCalendar();
        parse = format.parse(date);
        calc.setTime(parse);
        System.out.println(calc.get(GregorianCalendar.YEAR)); // 2015

        System.out.println(new SimpleDateFormat("YYYY/MM/dd HH:mm").format(parse)); // 2015/12/15 12:00

    }
}

package additionalInformation.DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateCalendar {
    public static void main(String[] args) {
        // https://javarush.ru/groups/posts/1941-kak-ne-poterjatjhsja-vo-vremeni--datetime-i-calendar
       // java.util.Date; он хранит дату в миллисекундах, которые прошли с 1 января 1970 года. Unix - время
        Date date = new Date();
        // если создать объекта Date с пустым конструктором — результатом будет текущая дата и время на момент создания объекта.
        System.out.println(date); // Вывод текущей даты и времени Sat Mar 14 19:59:23 MSK 2020

       // можно указать точное количество миллисекунд, которое прошло с 00:00 1 января 1970 года до требуемой даты, и она будет создана:
        Date par = new Date(1212121259261L); // если число слишком длинное для int добавить L в конце для перевода в long
        System.out.println(par); // Fri May 30 08:20:59 MSD 2008
        System.out.println(par.getTime()); // 1212121259261 Метод возвращает количество миллисекунд прошедших с даты

        // сравнение двух дат
        System.out.println(date.before(par)); // false
        System.out.println(date.after(par)); // true
        System.out.println(date.equals(par)); // false Объекты будут считаться равными, если совпадают вплоть до миллисекунды:

        System.out.println("-------------------------------");
        // Класс Calendar
        Calendar calendar = new GregorianCalendar(2017,0,25);
        // Месяцы в классе Calendar (как и в Date, кстати) начинаются с нуля
        Date calDate = calendar.getTime(); // олучить из календаря простую дату, т.е. объект Date — это делается при помощи метода Calendar.getTime()
        System.out.println(calDate); // Wed Jan 25 00:00:00 MSK 2017
        Calendar month = new GregorianCalendar(2019, Calendar.AUGUST, 26);

        Calendar setDate = new GregorianCalendar();
        setDate.set(Calendar.YEAR, 2016);
        setDate.set(Calendar.MONTH, 0);
        setDate.set(Calendar.DAY_OF_MONTH, 11);
        setDate.set(Calendar.HOUR_OF_DAY, 19);
        setDate.set(Calendar.MINUTE, 54);
        setDate.set(Calendar.SECOND, 100); //  прибавит к текущей минуте 100 секунд. == 55:40
        System.out.println(setDate.getTime()); // Mon Jan 11 19:55:40 MSK 2016

        setDate.add(Calendar.HOUR_OF_DAY,  3); // прибавляем три часа
        setDate.add(Calendar.DAY_OF_MONTH,  -2); // убавляем 2 дня
        System.out.println(setDate.getTime()); // Sat Jan 09 22:55:40 MSK 2016

        setDate.add(Calendar.MONTH, -1); // в результате изменения месяца поменялся также и год благодаря автоматическому рассчету
        System.out.println(setDate.getTime()); // Wed Dec 09 22:55:40 MSK 2015

        setDate.roll(Calendar.MONTH , 2); // меняец месяц, не затрагивая остальные значения (год)
        System.out.println(setDate.getTime()); // Mon Feb 09 22:55:40 MSK 2015

        // каждый поле объекта можно получать отдельно
        System.out.println(setDate.get(Calendar.HOUR)); // 10
        System.out.println(setDate.get(Calendar.YEAR)); // 2015
        System.out.println("Порядковый номер недели в месяце: "  + setDate.get(Calendar.WEEK_OF_MONTH)); // 2

        // Calendar.Era
        GregorianCalendar cannes = new GregorianCalendar(216, Calendar.AUGUST, 2); // 2 августа 216 г. до н. э.:
        cannes.set(Calendar.ERA, GregorianCalendar.BC); // установка значения даты до нашей эры
        DateFormat df = new SimpleDateFormat("dd MMM yyy GG"); //  “GG” отвечают за вывод эры
        System.out.println(df.format(cannes.getTime()));

    }
}

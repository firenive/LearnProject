package additionalInformation.DateTime;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat {
    // http://www.seostella.com/ru/article/2012/02/05/formatirovanie-daty-v-java.html

    public static void main (String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        System.out.println("Date: " + dateFormat.format(new Date())); // Date: 2020.03.14 н. э. at 20:57:03 MSK
        System.out.println();
        // В классе есть 4 конструктора
//        SimpleDateFormat()
//        // Создает SimpleDateFormat, используя паттерн времени и формат символов по умолчанию для текущей локализации
//        SimpleDateFormat(String pattern)
//        // Создает SimpleDateFormat, используя заданный паттерн времени и формат символов по умолчанию для текущей локализации
//        SimpleDateFormat(String pattern, DateFormatSymbols formatSymbols)
//        // Создает SimpleDateFormat, используя заданные паттерн времени и формат символов
//        SimpleDateFormat(String pattern, Locale locale)
//        // Создает SimpleDateFormat, используя заданный паттерн времени и формат символов по умолчанию для заданной локализации

        Date currentDate = new Date();
        currentDate.setMonth(3);
        SimpleDateFormat currentFormat;

        currentFormat = new SimpleDateFormat();
        System.out.println("Constructor 1: " + currentFormat.format(currentDate)); // Constructor 1: 14.03.2020, 21:05

        currentFormat = new SimpleDateFormat("dd MMMM"); // паттерн "dd MMMM", который требует от format() вывести
        // дату в следующем формате: "две цифры дня месяца" + "пробел" + "название месяца".
        System.out.println("Constructor 2: " + currentFormat.format(currentDate)); // Constructor 2: 14 марта

        currentFormat = new SimpleDateFormat("dd MMMM", myDateFormatSymbols);
        System.out.println("Constructor 3: " + currentFormat.format(currentDate)); // Constructor 3: 14 апрель

        currentFormat = new SimpleDateFormat("dd MMMM", Locale.ENGLISH);
        // название месяца используется не по умолчанию, а те, которые возвращает переменная myDateFormatSymbols.
        // В свою очередь, в переменной myDateFormatSymbols мы переопределили метод getMonths() чтобы он возвращал
        // названия месяцев с заданными значениями
        System.out.println("Constructor 4: " + currentFormat.format(currentDate)); // Constructor 4: 14 April



    }

    private static DateFormatSymbols myDateFormatSymbols = new DateFormatSymbols() {
        @Override
        public String[] getMonths() {
            return new String[]{"январь", "февраль", "март", "апрель", "май", "июнь",
                    "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        }
    };
}
//    Символ	Что означает	Пример
//    G	эра (в английской локализации - AD и BC)	н.э.
//        y	год (4-х значное число)	2012
//        yy	год (последние 2 цифры)	12
//        yyyy	год (4-х значное число)	2012
//        M	номер месяца без лидирующих нулей	2
//        MM	номер месяца (с лидирующими нулями если номер месяца < 10)	02
//        MMM	четырех буквенное сокращение месяца в русской локализации и трех буквенное - в английской (Feb)	фев
//        MMMM	полное название месяца (в английской локализации - February)	Февраль
//        w	неделя в году без лидирующих нулей	7
//        ww	неделя в году с лидирующими нулями	07
//        W	неделя в месяце без лидирующих нулей	2
//        WW	неделя в месяце с лидирующим нулем (если это необходимо)	02
//        D	день в году	38
//        d	день месяца без лидирующих нулей	7
//        dd	день месяца с лидирующими нулями	07
//        F	день недели в месяце без лидирующих нулей	1
//        FF	день недели в месяце с лидирующими нулями	01
//        E	день недели (сокращение)	Вт
//        EEEE	день недели (полностью)	вторник
//        a	AM/PM указатель	AM
//        H	часы в 24-часовом формате без лидирующих нулей	6
//        HH	часы в 24-часовом формате с лидирующим нулем	06
//        k	количество часов в 24-часовом формате	18
//        K	количество часов в 12-часовом формате	6
//        h	время в 12-часовом формате без лидирующих нулей	6
//        hh	время в 12-часовом формате с лидирующим нулем	06
//        m	минуты без лидирующих нулей	32
//        mm	минуты с лидирующим нулем	32
//        s	секунды без лидирующих нулей	11
//        ss	секунды с лидирующим нулем	11
//        S	миллисекунды	109
//        z	часовой пояс	EET
//        Z	часовой пояс в формате RFC 822	+0200
//        '	символ экранирования для текста	'Date='
//        ''	кавычка	'o''clock'

//    Рассмотрим несколько примеров паттернов даты и времени, которые представлены в официальной документации. Русская локализация:
//
//        Паттерн даты и времени	Результат
//        "e;yyyy.MM.dd G 'at' HH:mm:ss z"e;	2012.02.07 н.э. at 16:51:35 EET
//        "e;EEE, MMM d, ''yy"e;	Вт, фев 7, '12
//        "e;h:mm a"e;	4:51 PM
//        "e;hh 'o''clock' a, zzzz"e;	04 o'clock PM, Eastern European Time
//        "e;K:mm a, z"e;	4:51 PM, EET
//        "e;yyyyy.MMMMM.dd GGG hh:mm aaa"e;	02012.Февраль.07 н.э. 04:51 PM
//        "e;EEE, d MMM yyyy HH:mm:ss Z"e;	Вт, 7 фев 2012 16:51:35 +0200
//        "e;yyMMddHHmmssZ"e;	120207165135+0200

//        Английская локализация:
//
//        Паттерн даты и времени	Результат
//        "e;yyyy.MM.dd G 'at' HH:mm:ss z"e;	2012.02.07 AD at 16:55:57 EET
//        "e;EEE, MMM d, ''yy"e;	Tue, Feb 7, '12
//        "e;h:mm a"e;	4:55 PM
//        "e;hh 'o''clock' a, zzzz"e;	04 o'clock PM, Eastern European Time
//        "e;K:mm a, z"e;	4:55 PM, EET
//        "e;yyyyy.MMMMM.dd GGG hh:mm aaa"e;	02012.February.07 AD 04:55 PM
//        "e;EEE, d MMM yyyy HH:mm:ss Z"e;	Tue, 7 Feb 2012 16:55:57 +0200
//        "e;yyMMddHHmmssZ"e;	120207165557+0200


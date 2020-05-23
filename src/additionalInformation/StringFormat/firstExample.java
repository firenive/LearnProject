package additionalInformation.StringFormat;

import java.text.MessageFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;

public class firstExample {
    public static void main(String[] args) {
        String output = String.format("%s = %d", "joe", 35);
        System.out.printf("My name is : %s%n", "joe");
        System.out.println(output);
        System.out.println("---------------------");

        StringBuilder sbC = new StringBuilder();
        Formatter fmt = new Formatter(sbC);
        fmt.format("PI = %f%n", Math.PI);
        System.out.print(sbC.toString());

        String s = "On 22.02.2017 was hurricane";
        String s2 = "On 23.05.2016 was sunny";
        LocalTime time  = LocalTime.now();

        String formatted = "On {0, date} in {0, time}  was {1}, {2, number} buildings was destroyed" ; // воспользуемся форматированием строк подставляя на {0} и {1} значения
        String s4 = MessageFormat.format(formatted, new GregorianCalendar(2019, Calendar.MAY,21,22,47,5),   "rainly", 10);
        System.out.println(s4);
    }


}

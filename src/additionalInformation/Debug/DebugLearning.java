package additionalInformation.Debug;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Logger;

public class DebugLearning {
    // https://youtu.be/pHvN5nykk_c
    private static final Logger  log = Logger.getGlobal(); // включаем глобальный логгер для приложения
    public static void main(String[] args) throws Exception {
        int i = 5;
        System.out.println(i);
        System.out.println();
        log.info("info message");
        //Car car = new Car();
        // System.out.println(car.Run(50,70));

        Random random = new Random() { // мы используем анонимный класс и переопределяем его метод для того чтобы проверить его работу

            @Override
            public double nextDouble() {
                Double d =  super.nextDouble();
                System.out.println(d);
                return d;
            }
        };
        random.nextDouble();
        // method(); // Выводим spectrace
        // method2(); // Второй способ вывести spectrace
        writer();

    }
    private  static void method() {
        try {
            throw new Exception("message");
        } catch (Exception e) {
            e.printStackTrace();
            // напечатается StackTrace
            // java.lang.Exception: message
            //	at additionalInformation.Debug.DebugLearning.method(DebugLearning.java:31)
            //	at additionalInformation.Debug.DebugLearning.main(DebugLearning.java:27)
            // заходим в Analyze/Analyze StackTrace и добавляем новую вкладку
        }
    }
    private static void method2() {
        Thread.dumpStack();
        // java.lang.Exception: Stack trace
        //	at java.base/java.lang.Thread.dumpStack(Thread.java:1387)
        //	at additionalInformation.Debug.DebugLearning.method2(DebugLearning.java:44)
        //	at additionalInformation.Debug.DebugLearning.main(DebugLearning.java:28)
    }
    private static  void writer() throws FileNotFoundException {
        PrintWriter writerVar = new PrintWriter(new File("ingest.log")); // создаем файл в который будем писать логи
        new Throwable().printStackTrace(writerVar); // печатаем stacktrace в файл
        writerVar.flush();
        writerVar.close();

    }
}

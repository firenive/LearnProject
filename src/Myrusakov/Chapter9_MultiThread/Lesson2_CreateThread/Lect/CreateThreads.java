package Myrusakov.Chapter9_MultiThread.Lesson2_CreateThread.Lect;

public class CreateThreads {
    public static void main(String[] args) throws InterruptedException {
       // Thread thr = new Thread(new MyThread());
        // создаем объект класса Thread. в конструктор в качестве параметра передаем класс реализующий интерфейс Runnable
       // thr.start(); // запуск потока
      //  Thread thr1 = new Thread(new MyThread()); // запуск нового потока. выполняется одноременно с первым
       // thr1.start();
       // System.out.println("4342342"); // так как на вывод потоков установлена задержка сначала выведтся эти строки
       // System.out.println("4342342"); // потом отработает цикл в классе MyThread

        // запустим три цикла по вычислению суммы всех чисел до 1 миллиарда
        long time = System.currentTimeMillis(); // возвращает количество миллисекунд с 1 января 1970
        double s = 0;
        for (double i = 0; i < 1000000000; i++) s+= i;

        s = 0;
        for (double i = 0; i < 1000000000; i++) s+= i;

        s = 0;
        for (double i = 0; i < 1000000000; i++) s+= i;
        System.out.println("Program execution time: " + (System.currentTimeMillis() - time));
        // скорость подсчета суммы ~ 9500 ms (9.5 s)
        // разница между временем до выполнения трех циклов и временем после выполнения в миллисекундах.
        // позволяет посчитать время выполнения программы

        // теперь запустим эти же три цикла в отдельных потоках. для создания потоков воспользуеся lambda выражениями
        time = System.currentTimeMillis();
        Thread t = new Thread(() -> {
            double s1 = 0;
            for (double i = 0; i < 1000000000; i++) s1 += i;
        });
        // второй поток для цикла
        Thread t2 = new Thread(() -> {
            double s2 = 0;
            for (double i = 0; i < 1000000000; i++) s2 += i;
        });
        // третий цикл будет выполнятся в рамках основной программы, что по сути также является отдельным потоком
        s = 0;
        t.start();
        t2.start();
        for (double i = 0; i < 1000000000; i++) s+= i;

        // Нам необходимо вывести времени выполнения потока после того как все запущенные потоки завершатся
        if (t.isAlive()) t.join(); // проверка на то выполняется ли первый поток. если true ждем окончания выполнения
        if (t2.isAlive()) t.join(); // то же самое для второго потока. время выведтся если все потоки завершатся
        System.out.println("Program execution time: " + (System.currentTimeMillis() - time)); // Program execution time: 3191
        // Программа выполнилась в три раза быстрее ~ 3 секунды

    }
}

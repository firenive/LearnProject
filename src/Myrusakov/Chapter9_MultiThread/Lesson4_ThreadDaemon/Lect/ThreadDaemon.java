package Myrusakov.Chapter9_MultiThread.Lesson4_ThreadDaemon.Lect;

public class ThreadDaemon {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            int i = 0;
            while (true)  {
                System.out.println("Секунд прошло: " + i);
                if (i==3) break;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }
        });
        t.setDaemon(true); // назначение потоку значения Daemon
        // Daemon потоки завершаются как только завершаются все noDaemon потоки
        // так как в нынешнем коде программы нет других потоков, то Daemon поток сразу же завершается, не выполяняясь
        // добавим в ветку основного потока исполнение дополнительного кода
        // после принудительно установленной паузы в основном потоке daemon поток будет успевать отрабатыать
        t.start();
        Thread.sleep(2000);
    }
}

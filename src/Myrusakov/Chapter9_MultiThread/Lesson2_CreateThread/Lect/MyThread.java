package Myrusakov.Chapter9_MultiThread.Lesson2_CreateThread.Lect;

public class MyThread implements Runnable {
    // для использования потоков необходимо реализовать интерфейс Runnable

    @Override
    public void run() {
        int delay = (int) (Math.random() * 2000);
        // метод выполняется при запуске данного потока
        for (int i = 0; i < 3; i++) {
            System.out.println("New Thread: " + i);
            try {
                Thread.sleep(delay); // остановка потока на две секунды при выполнении программы
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

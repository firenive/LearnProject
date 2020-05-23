package Myrusakov.Chapter9_MultiThread.Lesson3_WorkThread.Lect;

public class ThreadsWork {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("Новый поток: " + Thread.currentThread()); // вернет название текущего потока
            // Новый поток: Thread[My thread,7,main]
            for (int i = 0; i < 5; i++) {
                System.out.println("Новый поток:" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Новый поток: " + Thread.currentThread());
        });
        t.setName("My thread"); // установка имени для потока
        t.setPriority(7); // установка приоритета у потока. принимает значение от 1 до 10. Чем выше значение тем выше приоритет потока
        t.start();

        // Выаолнение основной программы также является потоком. можно также вернуть название или установить приоритет у
        // основного потока
        Thread.currentThread().setPriority(3);
        if(t.isAlive()) t.join();
        // метод приостановит выполнение текущего потока до тех пор, пока другой поток не закончит свое выполнение.
        // Если поток прерывается, бросается InterruptedException.
        System.out.println(Thread.currentThread());

        MyObject obj = new MyObject();
        System.out.println("-------------------------");
        for (int i = 0; i < 5; i++) {
            Thread temp = new Thread(new NewThread(obj));
            temp.start();
        }

    }
}

package Myrusakov.Chapter9_MultiThread.Lesson3_WorkThread.Lect;

public class NewThread implements Runnable{

    MyObject obj;
    public NewThread( MyObject obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj) { // позволяет синхронизировать значение x в том случае если его значение меняется разными потоками
            // метод synchronized  блокирует использование объекта только за одним потоком. следующий поток запускается в тот момент
            // когда завершится текущий
            obj.x = 0;
            for (int i = 0; i < 5; i++) {
                obj.x++;
                System.out.println(Thread.currentThread() + " obj.x = " + obj.x);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

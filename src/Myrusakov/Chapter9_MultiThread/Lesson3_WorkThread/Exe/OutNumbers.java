package Myrusakov.Chapter9_MultiThread.Lesson3_WorkThread.Exe;

public class OutNumbers {

    public static void main(String[] args) throws InterruptedException {

        Thread th1 = new Thread(() -> {
            long time = System.currentTimeMillis();
            double sum = 0;

            for (double i = 0; i < 10000; i++) {
                sum += i;
                System.out.print(sum + "  f");
            }
            System.out.println("\nПервый поток: " + (System.currentTimeMillis() - time));
        });
        th1.setPriority(10);

        Thread th2 = new Thread(() -> {
            long time1 = System.currentTimeMillis();
            double sum1 = 0;
            for (double i = 0; i < 10000; i++) {
                sum1 += i;
                System.out.print(sum1 + "  s");
            }
            System.out.println("\nВторой поток: " + (System.currentTimeMillis() - time1));
        });
        th2.setPriority(5);
        th1.start();
        th2.start();
        long timeMain = System.currentTimeMillis();
        double sumMain =  0;
        for (int i = 0; i < 10000; i++) {
            sumMain += i;
            System.out.print(sumMain + " m");
        }
        Thread.currentThread().setPriority(1);
        System.out.println("\nТретий поток: " + (System.currentTimeMillis() - timeMain));

    }
}

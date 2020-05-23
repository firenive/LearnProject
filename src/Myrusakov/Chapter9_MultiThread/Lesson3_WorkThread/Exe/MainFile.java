package Myrusakov.Chapter9_MultiThread.Lesson3_WorkThread.Exe;

import java.io.File;
import java.io.IOException;

public class MainFile {
    public static void main(String[] args) {
        ObjectFile file = new ObjectFile(new File("Text\\project.txt"));
        synchronized (file) {

            Thread th1 = new Thread(() -> {
                String s1 = "11111\r\n2222222\r\n3333333\r\n44444";
                try {
                    file.writeFile(s1);
                    System.out.println(file.readFile());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            Thread th2 = new Thread(() -> {
                String s2 = "55555\r\n66666\r\n77777\r\n8888";
                try {
                    file.writeFile(s2);
                    System.out.println(file.readFile());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            th1.setPriority(1);
            th2.setPriority(8);
            th1.start();
            th2.start();
        }
    }


}

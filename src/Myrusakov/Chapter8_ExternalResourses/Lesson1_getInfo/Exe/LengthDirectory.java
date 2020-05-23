package Myrusakov.Chapter8_ExternalResourses.Lesson1_getInfo.Exe;

import javax.swing.*;
import java.io.File;

public class LengthDirectory {
    public static void main(String[] args) {
        String path = JOptionPane.showInputDialog(null, "Введите путь к директории");
        File directory = new File(path);
        getLenght(folderSize(directory));

    }
    static public void getLenght(long lenght) {
        long lenByte =  lenght;
        double lenKByte = (double)lenByte / 1024;
        double lenMByte =  lenKByte / 1024;
        double lenGByte =  lenMByte / 1024;

        System.out.println("Размер директории = " + lenByte + " B");
        System.out.printf("Размер директории =  + %.2f KB\n", lenKByte);
        System.out.printf("Размер директории =  + %.2f MB\n", lenMByte);
        System.out.printf("Размер директории =  + %.2f GB\n", lenGByte);

    }
    public static long folderSize (File directory) {
        long length = 0;
        for (File file : directory.listFiles()) {
            System.out.println(file.getAbsolutePath());
            if (file.isFile())
                length +=file.length();
            else length+= folderSize(file);
        }
        return length;
    }
}


// D:\Базы 1с\УТ 11 демо\1Cv8.1CD
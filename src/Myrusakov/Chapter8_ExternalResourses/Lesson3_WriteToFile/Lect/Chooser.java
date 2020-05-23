package Myrusakov.Chapter8_ExternalResourses.Lesson3_WriteToFile.Lect;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Chooser {
    static int time = 0;
    public static void main(String[] args) throws IOException {
        // Запись побайтово. Хорошо подходит для типов данных отличных от текстовых. например запись изображений
        // Следующий пример: создаем окно в котором предлагаем выбрать файл. копируем данные из него в другой файл
        JFileChooser chooser = new JFileChooser(); // окно для выбора файла
        int r= chooser.showOpenDialog(null); // получаем результат выбора файла

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                time++;
            }
        });

        if (r == JFileChooser.APPROVE_OPTION) { // положительный результат выбора. пользователь выбрал файл
            File f = chooser.getSelectedFile(); // помещаем выбранный файл в переменную f
            FileInputStream input = new FileInputStream(f.getAbsoluteFile()); // считываем файл
            String pathCopy = "F:\\Copy\\" + f.getName(); // f.getName() имя хранящегося файла

            FileOutputStream output = new FileOutputStream(pathCopy); // укажем файл в который будет производится копирование
            timer.start();
            // 1 способ. побайтовое копирование. выполняется очень долго. файл 7 мегабайт  копируется минуту
           /* int b = input.read();
            while (b != -1) {
                output.write(b);
                b = input.read();
            }*/
            // 2 способ. копируем с помощью буферного массива.  Вариант быстрый, но занимает много оперативной памяти
            byte[] buffer = new byte[input.available()];
            // input.available() вернет количество байт передаваемое в потоке input. записываем весь файл в массив
            // по сути файл копируется в оперативную память и оттуда в жесткий диск
            input.read(buffer);
            output.write(buffer);
            // 3 способ. используем буфферный массив с заданной длинной. вариант является промежуточным по времени выполнения
            // и затрачиваемой оперативной памяти

            byte[] bufferDefined = new byte[4096]; 
            // так как размер массива ограничен необходимо повторять операцию чтения/копирования до конца копирования файла
            while (input.read(bufferDefined) != -1) output.write(bufferDefined);

            input.close();
            output.close();
            timer.stop();
            System.out.println(time);
            JOptionPane.showMessageDialog(null,"copy completed successfully");
        }
    }
}

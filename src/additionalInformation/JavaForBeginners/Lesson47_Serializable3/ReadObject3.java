package additionalInformation.JavaForBeginners.Lesson47_Serializable3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject3 {
    public static void main(String[] args) {
        // Пропишем в блоке try создание потока. В этом случае поток будет автоматичеки закрываться по окончанию блока tty
        // Нет нужды дополнительно прописывать ois.close(). Операция называется try-with-resources
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bin/people2.bin"))) {
            
            int personCount = ois.readInt(); // сначала считываем длину массива с объектами
            PersonSerializable3[] people = new PersonSerializable3[personCount]; // создаем массив с объектами.
            // длина массива = считанному значению
            for (int i = 0; i < personCount; i++) { // заполняем пустой массив объектами
                people[i] = (PersonSerializable3) ois.readObject();
            }

            for (PersonSerializable3 pers : people) System.out.println(pers);
            // Name: Glafira : Age: 22
            // Name: Mike : Age: 98
            // Name: Sharon : Age: 25
            System.out.println("-------------------------");
            System.out.println(Arrays.toString(people));
            // [Name: Glafira : Age: 22, Name: Mike : Age: 98, Name: Sharon : Age: 25]

            ois.close();

            // считывание для второго способа. В этом случае просто считывается массив, так как тоже является объектом
            // Использовать второй способ является предпочтительным
            FileInputStream fis2 = new FileInputStream("bin/secondWay.bin");
            ObjectInputStream ous2 = new ObjectInputStream(fis2);
            PersonSerializable3[] people2 = (PersonSerializable3[]) ous2.readObject();

            System.out.println("-------------------------");
            System.out.println(Arrays.toString(people2));

            ous2.close();

        }catch (IOException | ClassNotFoundException io) {
            io.printStackTrace();
        }
    }
}

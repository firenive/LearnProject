package additionalInformation.JavaForBeginners.Lesson45_Serializable1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject { // класс ReadObject будет читать записанные объекты из файла
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("bin/people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            // так как метод readObject возвращает объект класса object необъходимо сделать downcasting до того класса,
            // чей объект необходимо получить
            PersonSerializable person1 = (PersonSerializable) ois.readObject();
            PersonSerializable person2 = (PersonSerializable) ois.readObject();
            AdminSerializable admin1 = (AdminSerializable) ois.readObject();
            System.out.println(person1);
            System.out.println(person2);
            System.out.println(admin1);

            ois.close();
            // так как ObjectInputStream оборачивает FileInputStream, нам достаточно закрыть только ObjectInputStream.
            //Когда "класс-поток" оборачивает другие "классы-потоки",  достаточно закрыть самый внешний, все внутренние закроются автоматически.

            // ClassNotFoundException возникает в том случае если считанные данныые приравниваются к классу, которого нет в проекте
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

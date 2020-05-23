package additionalInformation.JavaForBeginners.Lesson47_Serializable3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject3 {
    public static void main(String[] args) {
        PersonSerializable3[] people = {new PersonSerializable3("Glafira", 22),
                new PersonSerializable3("Mike", 98),
                new PersonSerializable3("Sharon", 25)};
        try {
            FileOutputStream fos = new FileOutputStream("bin/people2.bin");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            // Отметим, что объекты записываются в соответствии с переопределенным методом toString()

            ous.writeInt(people.length); // сначала записываем в файл длину массива (число), затем число объектов
            // класса PersonSerializable2
            for (PersonSerializable3 person : people) { // пишем каждый элемент массива
                ous.writeObject(person);
            }
            ous.close();

            // Второй способ записи. просто записываем целиком объект
            FileOutputStream fos2 = new FileOutputStream("bin/secondWay.bin");
            ObjectOutputStream ous2 = new ObjectOutputStream(fos2);
            ous2.writeObject(people);

            ous2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

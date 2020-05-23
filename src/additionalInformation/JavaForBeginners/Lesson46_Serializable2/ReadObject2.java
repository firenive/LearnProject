package additionalInformation.JavaForBeginners.Lesson46_Serializable2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ReadObject2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("bin/people2.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int personCount = ois.readInt(); // сначала считываем длину массива с объектами
            PersonSerializable2[] people = new PersonSerializable2[personCount]; // создаем массив с объектами.
            // длина массива = считанному значению
            for (int i = 0; i < personCount; i++) { // заполняем пустой массив объектами
                people[i] = (PersonSerializable2) ois.readObject();
            }

            for (PersonSerializable2 pers : people) System.out.println(pers);
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
            ObjectInputStream ois2 = new ObjectInputStream(fis2);
            PersonSerializable2[] people2 = (PersonSerializable2[]) ois2.readObject();

            System.out.println("-------------------------");
            System.out.println(Arrays.toString(people2));

            ois2.close();

        }catch (IOException | ClassNotFoundException io) {
            io.printStackTrace();
        }

    }
}

package additionalInformation.JavaForBeginners.Lesson45_Serializable1;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject { // класс WriteObject будет писать объекты в файл
    public static void main(String[] args)  {
        PersonSerializable person1 = new PersonSerializable(1256, "Ashot");
        PersonSerializable person2 = new PersonSerializable(4590, "Aleksander");
        // на время выполнения программы объекты хранятся в оперативной памяти и удаляются после завершния программы
        // при сохранении объектов они сохраняются на жесткий диск и могут хранится очень длительное время
        try {
            FileOutputStream fos = new FileOutputStream("bin/people.bin"); // выбираем файл куда будем писать объект
            //  расширение может быть любым, но обычно при сохранении бинарных данный выбирается расширение bin. Класс
            // пишет любые данные в файл в виде байтов

            ObjectOutputStream oos = new ObjectOutputStream(fos); // данный клас пишет объекты сами по себе.
            // Он берет объект, преобразовывает его в байты, FileOutputStream пишет эти байты в файл

           // записываем два объекта в файл
            oos.writeObject(person1);
            oos.writeObject(person2);

            AdminSerializable admin1 = new AdminSerializable(1234, "Pavel", 22);
            oos.writeObject(admin1);

            oos.close();
        } catch (IOException ffe) {
            ffe.printStackTrace();
        }


    }
}

package additionalInformation.JavaForBeginners.Lesson45_Serializable1;

import java.io.Serializable;

public class PersonSerializable implements Serializable {
    // реализация интерфейса  Serializable дает право на сериализацию объектов этого класса и всех его наследников
    // Сериализация — это процесс сохранения состояния объекта в последовательность байт. Как правило для сохранения
    // используется во внешний файл
    //Десериализация — это процесс восстановления объекта из этих байт.
    // Рассмотрим на примере класса PersonSerializable
    // класс WriteObject будет писать объекты в файл
    // класс ReadObject будет читать записанные объекты из файла
    private int id;
    private String name;
    public  PersonSerializable (int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId(int id) {
        return id;
    }
    public String getName(String name) {
        return name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}

package additionalInformation.JavaForBeginners.Lesson47_Serializable3;

import java.io.Serializable;

public class PersonSerializable3 implements Serializable {
    // Transient ключевое слово, которое используется для отметки полей, для которых не нужна сериализация
    // Если отметить int поле age по умолчанию поле age = 0 [Name: Glafira : Age: 0, Name: Mike : Age: 0, Name: Sharon : Age: 0]
    // Отмечаем String поле name [Name: null : Age: 22, Name: null : Age: 98, Name: null : Age: 25]

    // Поле serialVersionUID. Предназначено для того чтобы помечать состояние класса. Генерируется автоматически исходя
    // из структуры класса, находящихся в классе. необходим для того чтобы различать возможные изменения
    // изначально сохраненного класса. После каждого изменения в классе заново генерируется serialVersionUID
    private static final long serialVersionUID = -1478260228232216642L;
    // В случае несовпадения id при  чтении класса возникнет ошибка
    //java.io.InvalidClassException: additionalInformation.JavaForBeginners.Lesson47_Serializable3.PersonSerializable3; local class incompatible: stream classdesc serialVersionUID = 7020600222955680175, local class serialVersionUID = -1478260228232216642
    //	at java.base/java.io.ObjectStreamClass.initNonProxy(ObjectStreamClass.java:689)
    //	at java.base/java.io.ObjectInputStream.readNonProxyDesc(ObjectInputStream.java:1903)
    //	at java.base/java.io.ObjectInputStream.readClassDesc(ObjectInputStream.java:1772)
    //	at java.base/java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:2060)
    //	at java.base/java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1594)
    //	at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:430)
    //	at additionalInformation.JavaForBeginners.Lesson47_Serializable3.ReadObject3.main(ReadObject3.java:17)


    private  int age;
    private transient String name;
    public PersonSerializable3(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return  age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Name: " + name + " : " + "Age: " + age;

    }
}

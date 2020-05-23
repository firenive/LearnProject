package additionalInformation.JavaForBeginners.Lesson28_Access;

import additionalInformation.JavaForBeginners.Lesson28_Access.TestPacket.Person;

public class Test extends Person {
    // поля класса нужно обязательно делать приватными. Исключения делаются только для констант
    public String helli; // don't do it
    public  final static String CONSTANT = "CONSTANT"; // Do it
    public  static  void main(String[] args) {

        // Есть следующие модификаторы доступа: public, private, default, protect
        // public доступ к полю, классу, методу везде из проекта
        // private доступ только в пределх класса где поля деклорировано
        // default устанавливается, если не указан иной модификатор доступа. Доступ только в пределах пакета
        // protected в пределах одного пакета и доступны для классов наследники

        // class может быть либо public либо default. Если класс имеет модификатор public его имя указывается для файла класса
        // модификатор default обычно используется для подклассов. В одном файле не может быть двух public class

        Person pers = new Person();

        pers.name = "String"; // получили доступ к полю name. модификатор доступа = public
        // pers.age; нет доступа к полю age с модификатором default



    }
    public void child() {
        children = "RNQ";
    }
}

class Test2 {

}

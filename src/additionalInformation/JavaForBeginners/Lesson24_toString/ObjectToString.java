package additionalInformation.JavaForBeginners.Lesson24_toString;

public class ObjectToString {
    public static void main(String[] args) {
        // любой класс в Java наследуется от класса Object
        String str = "Hello";
        System.out.println(str);
        Hash h1 = new Hash("name", 20);
        // при печати объект классы по умолчанию выводит свое наименование и hash код, который является идентификатором объекта
        System.out.println(h1); // Hash@5e025e70

        Hash h2 = new Hash("name2", 22); // для каждого созданного объекта hash код уникален
        System.out.println(h2); // Hash@45c8e616
        //  за вывод hash кода ответствннен метод tpString(). при вызове метода print для каждого объекта скрыто вызывается
        // его метод toString по умолчанию печатающий Hash код. Метод toString принадлежит классу Object
        System.out.println(h2.toString()); // Hash@45c8e616 Идентично System.out.println(h2);

    }
}

class Hash {
    private String name;
    private int age;

    public Hash(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override // переопределям метод toString у объекта и указываем свой формат, используемый при выводе объекта
    public String toString() {
        return name+","+age;
    }

}

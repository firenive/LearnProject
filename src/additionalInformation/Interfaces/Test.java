package additionalInformation.Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(213);
        Person person1 = new Person("Sparta");
        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo();
        System.out.println("---------------");

        Info info1 = new Animal(2321); // Переменная типа info ссылается на объект вида Animal
        Info info2 = new Person("Leonid");  // Мы можем так делать только с теми классами, которые реализовали
        // интерфейс Info. Он выполняет объединяющую функцию между двумя классами

        // Для этих объектов мы можем вызвать только метод реализованный из интерфейса = ShowInfo
        // Таким образом мы не можем вызвать другие методы объекта, например sleep или sayHello
        info1.showInfo(); // ID is 2321
        info2.showInfo(); // Name is Leonid
        System.out.println("---------------");
        outputInfo(info1); // ID is 2321
        outputInfo(info2); // Name is Leonid
        System.out.println("---------------");
        Animal animal2 = new Animal(2234234);
        Person person2 = new Person("Bob");
        // применяем метод outputInfo для объектов класа Animal и Person
        outputInfo(animal2); // ID is 2234234
        outputInfo(person2); // Name is Bob

    }
    public static void outputInfo(Info info) { // теперь метод output info может действовать для любого объекта класса,
        // который реализует интерфей Info. например для Animal и Person
        info.showInfo();
    }
}

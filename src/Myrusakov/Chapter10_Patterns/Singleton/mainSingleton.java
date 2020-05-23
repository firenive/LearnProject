package Myrusakov.Chapter10_Patterns.Singleton;

public class mainSingleton {
    public static void main(String[] args) {
    // Паттерн предпологает что у каждого класса должен быть только 1 объект. Не одлжно быть ситуации использования
        // нескольних объектов одного класса

        Singleton obj1 = Singleton.getSingleton(); // создаем объект класса singleton. так как конструктор не доступен
        // создание происходит через метод, возвращающий объект
        System.out.println(obj1.getX());
        obj1.setX(11);
        System.out.println(obj1.getX());

        Singleton obj2 = Singleton.getSingleton();
        System.out.println(obj2.getX());
        // значение будет равняться 11, так как не происходит создание нового объекта. obj2 является только ссылкой
        // на ранее созданый объект
    }
}

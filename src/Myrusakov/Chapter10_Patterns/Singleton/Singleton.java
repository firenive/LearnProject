package Myrusakov.Chapter10_Patterns.Singleton;

public class Singleton {
    private int x;
    private static Singleton object;

    private Singleton() {
        // при использовании данного паттерна создаем private конструктор для возможности создания только одного объекта данного класса
        this.x = 10;

    }
    public static Singleton getSingleton() {
        // для возможности создания хотя бы 1 объекта создаем метод возвращающий объект класса Singleton (object)
        // здесь необходимо прописать условие. Если объект класса уже инициализирован мы возвращаем тот же объект
        // если инициализации объекта не было производим инициализацию
        if (object == null) object = new Singleton();
        return object;
    }
    public  int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

}

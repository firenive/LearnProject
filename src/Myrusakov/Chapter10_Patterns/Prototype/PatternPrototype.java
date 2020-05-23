package Myrusakov.Chapter10_Patterns.Prototype;

public class PatternPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        // нам нужно скопировать объект. обычно для этого требуется скопировать значения всех полей объекта
        // это удобно делать при помощи паттерна Prototype.
        // Для этого в классе объекта, который мы планируем клонировать реализуем метод клонирования
        Prototype p1 = new Prototype(5,12);
        System.out.println(p1);
        Prototype p2 = p1.clone();
        System.out.println(p2); // x = 5; y = 12;

    }

}

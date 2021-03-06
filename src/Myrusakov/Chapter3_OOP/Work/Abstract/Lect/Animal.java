package Myrusakov.Chapter3_OOP.Work.Abstract.Lect;
// https://youtu.be/kY07wfP2JiA
public  abstract class Animal { // помечаем класс как  абстрактный. Мы не сможем создать объекты этого класса
    // класс является не сущностью, это скорее категория. используется для создания иерархии при которой класс родитель
    // не является самостоятельным класом
    public void eat() {
        System.out.println("i'm eating ");
    }
    public abstract void makeSound(); // абстрактные методы можно создавать только в абстрактных классах. Сейчас в нем нет
    // реализации кода, поскольку мы не знаем какой звук издает Animal, реализация метода будет в классах наследниках
}

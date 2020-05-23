package Myrusakov.Chapter3_OOP.Work.Abstract.Lect;

public class Test { // https://youtu.be/kY07wfP2JiA
    public static void main (String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.makeSound();
        dog.makeSound();
        // Animal animal = new Animal();
        // из классов наследников можно вызывать любые методы родительского класса
        cat.eat();
        dog.eat();
    }
}

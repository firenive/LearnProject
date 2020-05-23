package Myrusakov.Chapter3_OOP.Work.Abstract.Lect;

public class Cat extends Animal {
    @Override
    public void makeSound() { // наследуем метод от класса animal и прописываем звук издаваемый кошкой
        System.out.println(" meowwww....");
    }
}

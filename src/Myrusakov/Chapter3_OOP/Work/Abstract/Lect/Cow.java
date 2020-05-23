package Myrusakov.Chapter3_OOP.Work.Abstract.Lect;

public class Cow implements AbleToMakeSound { // наследуем из интерфейса AbleToMakeSound метод makeSound.
    // При этом недоступен метод eat, определенный у родителя Animal.
    // При выполнении интерфейса мы обязаны реализовать все его методы
    // мы можем выполнить сколько угодно интерфейсов, но наследовать только 1 класс
    @Override
    public void makeSound() {
        System.out.println("muuuu muuuu");
    }
}

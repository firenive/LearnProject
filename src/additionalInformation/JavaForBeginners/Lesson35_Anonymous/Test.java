package additionalInformation.JavaForBeginners.Lesson35_Anonymous;

public class Test {
    public static void main(String[] args) {
        Animal anim = new Animal();
        anim.eat(); // I am eating
        Dog dog = new Dog();
        dog.eat(); // Dog is eating
        // Сложная схема по созданию отдельного класса для переопределению одного метода eat() 1 раз
        // Для таких целей подходят анонимные классы
        Animal anim2 = new Animal(){ // создание анонимного класса происходит фоном при переопределении метода
            @Override // анонимный класс является наследником Animal. при создании объекта используется объект класса наследника
            public void growl() {
                System.out.println("Animal2 is growl");
            }
        };
        anim2.growl(); // Animal2 is growl . Вызывается указанная реализация переопределенного метода
         AbleToSleep slp = new Sleep(); // По умолчанию мы не можем создать объект интерфейса, так как у интерфесов
        // отсутствует реализация (конструктор). Но мы можем создать объект класса, который реализует все методы интерфеса
        slp.sleep(); // I am sleep

        // Но мы можем не создавать отдельный класс для реализации интерфейса, а использовать анонимный класс
        AbleToSleep ats = new AbleToSleep() {
            @Override
            public void sleep() {
                System.out.println("I am sleep from interface");
            }
        };
        ats.sleep(); // I am sleep from interface
    }
}
interface AbleToSleep {
    public void sleep(); // сигнатура метода sleep
}
class Sleep implements AbleToSleep { // реализация интерфейса и всех его методов
    @Override
    public void sleep() {
        System.out.println("I am sleep");
    }
}
class Dog extends Animal { // для переопределения метода eat для другого животного создадим отдельный класс
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
class Animal {
    public void eat() {
        System.out.println("I am eating");
    }
    public void growl() {
        System.out.println("Animal is grow");
    }

}

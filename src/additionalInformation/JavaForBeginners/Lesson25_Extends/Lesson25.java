package additionalInformation.JavaForBeginners.Lesson25_Extends;

public class Lesson25 {
    public static void main(String[] args) {
        Animal25 anim = new Animal25();
        anim.eat();
        anim.sleep();
        Dog25 dog = new Dog25(); // благодаря наследованию от Animal25 можем использовать те же методы
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.setName("Sharik");
        dog.showName();
    }
}

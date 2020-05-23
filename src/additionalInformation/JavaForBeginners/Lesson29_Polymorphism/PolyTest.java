package additionalInformation.JavaForBeginners.Lesson29_Polymorphism;

public class PolyTest {
    // Полиморфизм это способность метода обрабатывать данные разных типов
    public static void main(String[] args) {
        AnimalPoly anim = new AnimalPoly();
        DogPoly dogp = new DogPoly();
        anim.eat();
        dogp.eat();

        AnimalPoly animDog = new DogPoly(); // объеяление объекта типа DogPoly лоя коасса AnimalPoly доступно только в том
        // случае если DogPoly является наследником AnimalPoly
        animDog.eat(); // имеем доступ к методу eat из класса AnimalPoly, но не имеем доступа к методу bark
       // animDog.bark(); метод bark определен в классе DogPoly
        dogp.bark();
        // При этом если метод eat переопределен в классе наследнике то в случае создания объекта
        // AnimalPoly animDog = new DogPoly(); будет использоваться именно перереопределенный метод наследника
        // это называется поздним связыванием

        // Итог для animDog. Вызываются только методы родительского класса. Если метод был переопределен в наследнике
        // вызывается переопределенный метод

        AnimalPoly learnAnimal = new AnimalPoly();
        DogPoly learnDog = new DogPoly();
        CatPoly learnCat = new CatPoly();
        // Так как метод learn принимает на вход аргумент класса AnimalPoly в качестве атрибута можем передавать объекты
        // классов наследников
        learn(learnAnimal);
        learn(learnDog);
        learn(learnCat);
        // практическая польза полиморфизма заключается в том, что мы можем сделать код многоразовым и сократить количество кода
        // иначе нам пришлось бы писать метод learn отдельно для Cat, Dog and Animal
    }
    public static void learn(AnimalPoly animal) {
        animal.eat();
    }
}

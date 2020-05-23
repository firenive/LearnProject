package additionalInformation.JavaForBeginners.Lesson41_Abstract;

public class AbstractTest {
    public static void main(String[] args) {
        // можем создавать объекты наследников абстрактного класса
        AbstractDog absDog = new AbstractDog();
        AbstractCat absCat = new AbstractCat();
        absCat.makeSound();
        absDog.makeSound();
        absCat.eat();
        absDog.eat();
    }
}

package additionalInformation.JavaForBeginners.Lesson41_Abstract;

public class AbstractDog extends AbstractAnimal implements AbleToSleep{
    @Override
    public void makeSound() {
        System.out.println("I am Dog and I am bark");
    }

    @Override
    public void sleep() {
        System.out.println("dog is sleep");
    }
}

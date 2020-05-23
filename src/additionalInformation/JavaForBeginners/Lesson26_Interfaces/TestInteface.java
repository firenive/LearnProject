package additionalInformation.JavaForBeginners.Lesson26_Interfaces;

public class TestInteface {
    public static void main(String[] args) {
        AnimalInterface animal1 = new AnimalInterface(123);
        PersonInterface person1 = new PersonInterface("Vladimir");
        animal1.sleep();
        person1.sayHello();

    }
}

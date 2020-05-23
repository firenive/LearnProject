package additionalInformation.JavaForBeginners.Lesson26_Interfaces;

public class AnimalInterface {
    public int id;
    public void sleep() {
        System.out.println("I am sleeping");
    }
    public AnimalInterface(int id) {
        this.id = id;
    }
}

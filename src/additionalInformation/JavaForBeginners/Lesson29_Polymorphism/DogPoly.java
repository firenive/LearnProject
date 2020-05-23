package additionalInformation.JavaForBeginners.Lesson29_Polymorphism;

public class DogPoly extends AnimalPoly {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark() {
        System.out.println("Dog is barking");


    }
}

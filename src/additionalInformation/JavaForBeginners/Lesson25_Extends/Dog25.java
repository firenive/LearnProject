package additionalInformation.JavaForBeginners.Lesson25_Extends;

public class Dog25 extends Animal25 {
    @Override
    public void eat() {
        System.out.println("i\'m eat dog food");
    }

    @Override
    public void sleep() {
        System.out.println("i\'m sleep like a dog");
    }
    public void bark() {
        System.out.println("woof woof");
    }
    public void showName() {
        System.out.println(name); // поле name наследуется из родительского класса Animal 25
    }
    public void setName (String name) {
        this.name = name;
    }
}

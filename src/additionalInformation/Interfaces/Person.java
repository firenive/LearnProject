package additionalInformation.Interfaces;

public class Person implements Info {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void sayHello() {
        System.out.println("Hello");
    }
    public String getName() {
        return name;
    }
    @Override // при реализации методов из интерфейса их имена должны совпадать
    public void showInfo() {
        System.out.println("Name is " + this.name);
    }
}

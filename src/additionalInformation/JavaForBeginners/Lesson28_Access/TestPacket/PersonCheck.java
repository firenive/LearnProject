package additionalInformation.JavaForBeginners.Lesson28_Access.TestPacket;

public class PersonCheck {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "name";
        person.age = 22; // получили доступ к default полю поскольку находимся в одном пакете
        System.out.println(person.children); // доступ к protected полю в этом же пакете

    }
}

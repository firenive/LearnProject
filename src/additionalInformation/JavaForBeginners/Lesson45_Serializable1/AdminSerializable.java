package additionalInformation.JavaForBeginners.Lesson45_Serializable1;

public class AdminSerializable extends PersonSerializable{
    private int age;
    public AdminSerializable(int id, String name, int age) {
        super(id, name);
        this.age = age;

    }
}

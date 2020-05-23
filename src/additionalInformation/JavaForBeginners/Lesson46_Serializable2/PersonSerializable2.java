package additionalInformation.JavaForBeginners.Lesson46_Serializable2;

import java.io.Serializable;

public class PersonSerializable2  implements Serializable {
    private int age;
    private String name;
    public PersonSerializable2 (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return  age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Name: " + name + " : " + "Age: " + age;

    }
}

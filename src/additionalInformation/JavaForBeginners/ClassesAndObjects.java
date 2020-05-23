package additionalInformation.JavaForBeginners;

import java.text.MessageFormat;

// https://stackoverflow.com/questions/17544794/escaping-single-quotes-for-java-messageformat
public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Pavel");
        person1.setAge(10);

        System.out.println(person1.printing());

        Person person2 = new Person();
        person2.setName("Elena");
        person2.setAge(31);

        System.out.println(person2.printing());

        Person person3 = new Person();
        person3.setName("Mark");
        person3.setAge(21);
        System.out.println(person3.printing());

    }
}

class Person {
    private String name;
    private int age;
    private Object[] info = new Object[2];

    public Object setInfo(String name, int age) {
        this.name = name;
        this.age = age;
        info = new Object[]{name, age};
        return info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String printing() {
        MessageFormat persInfo = new MessageFormat("My name is {0} and I''m {1} years old");
        setInfo(name, age);
        String personInf = persInfo.format(info);
        return personInf;


    }
}

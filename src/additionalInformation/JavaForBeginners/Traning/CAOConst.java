package additionalInformation.JavaForBeginners.Traning;

import java.text.MessageFormat;

// https://stackoverflow.com/questions/17544794/escaping-single-quotes-for-java-messageformat
public class CAOConst {
    public static void main(String[] args) {
        PersonConst personConst1 = new PersonConst("Pavel" ,30);
        System.out.println(personConst1.printing());

        PersonConst personConst2 = new PersonConst("Mask", 46);
        System.out.println(personConst2.printing());

        PersonConst personConst3 = new PersonConst("Soldier", 22);
        System.out.println(personConst3.printing());
    }
}

class PersonConst {
    private String name;
    private int age;
    private Object[] info;

    public PersonConst(String name, int age) {
        this.name = name;
        this.age = age;
        info = new Object[]{name, age};
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
        String personInf = persInfo.format(info);
        return personInf;


    }
}

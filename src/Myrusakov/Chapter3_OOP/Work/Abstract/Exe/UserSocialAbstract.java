package Myrusakov.Chapter3_OOP.Work.Abstract.Exe;

public class UserSocialAbstract extends UserAbstract {
    private String name;
    private int age;
    public void setName (String name) { this.name = name; }
    public void setAge (int age) { this.age = age; }

    public String getName() {return name;}
    public int getAge() {return age;}

    public UserSocialAbstract(int id, String login, String password, String name, int age) {
        super(id, login, password);
        this.name = name;
        this.age = age;
    }
    public String getInfo() {
        String s = super.getInfo();
        s += "; Имя: " + this.name + "; Возраст: " + this.age;
        return s;
    }

    @Override
    public void printUser() {
        System.out.println(getInfo());
    }

    @Override
    public void printUserInterface() {
        System.out.println("interface");
    }
}

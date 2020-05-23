package Myrusakov.Chapter3_OOP.Extends.Lect;

public class Programmer extends PersonExtends{ // в классе Programmer доступны все методы и свойства из класса PersonExtends
    // кроме private (доступны только внутри родителя
    private int exp;
    public Programmer(String name, String city, int age, int exp) {
        super(name, city, age); // вызов конструктора родительского метода с наследование из него свойств
        this.exp = exp;
    }
    public Programmer(){
        super();
        this.exp = 0;
    }
    public String getTextInfo() {
        String s = super.getTextInfo();// вызов метода из родительскго класса с наследованием свойств и return
        s += "; Опыт работы: " + this.exp + " лет.";
        return s;
    }
}

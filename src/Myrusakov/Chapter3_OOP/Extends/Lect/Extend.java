package Myrusakov.Chapter3_OOP.Extends.Lect;

public class Extend {
    public static void main(String[] args) {
        Programmer p = new Programmer("Barbara", "LA", 42, 3);
        System.out.println(p.getTextInfo());
        Worker w = new Worker();
        w.setSalary(30000);
        System.out.println(w.getTextInfo());
        System.out.println(new Worker().getSalary());
        PersonExtends prog = new Programmer("Nastya", "Jericho", 20, 1); // пример полиморфизма от родительского класса
        System.out.println(prog.getTextInfo());
    }
}

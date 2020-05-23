package Myrusakov.Chapter3_OOP.Static.Lect;

public class StaticData {
    public static void main(String[] args) {
        new ThirdPerson();
        new ThirdPerson();
        System.out.println("Создано объектов: " + ThirdPerson.getCount());
    }
}

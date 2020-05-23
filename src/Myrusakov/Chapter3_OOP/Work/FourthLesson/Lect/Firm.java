package Myrusakov.Chapter3_OOP.FourthLesson.Lect;

public class Firm {
    public String nameFirm;
    public Director director;

    public Firm(String nameFirm, String nameDirector, int age) {
        this.nameFirm = nameFirm;
        this.director = new Director(nameDirector, age);
    }
    class Director { // Создан подкласс директор для класа фирма. нужен для легкого доступа к переменным класса Firm
        public String name;
        public int age;
        public Director (String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Создан директор в фирме  " + nameFirm); // здесь мы обращаемся к nameFirm из класса Firm
        }
        public  boolean isPensioner() {
            return age >= 65; // вернется true если возраст директора >= 65

        }
    }


}

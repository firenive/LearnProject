package Myrusakov.Chapter3_OOP.FourthLesson.Lect;

public class FirmMain {
    public static void main(String[] args) {
        Firm f = new Firm("My Firm", "Smirnov Pavel", 32);
        System.out.println(f.director.name); // обращаемся к свойству внутренних классов
        System.out.println(" Директор является пенсионером: " + f.director.isPensioner());
        // TestPrivate test1 = new TestPrivate("65", "66", "77", "88");
        // System.out.println(test1.);
    }
}

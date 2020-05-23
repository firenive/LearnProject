package additionalInformation.JavaForBeginners.Lesson32_Casting;

public class Casting {
    public static void main(String[] args) {
        // https://www.codejava.net/java-core/the-java-language/what-is-upcasting-and-downcasting-in-java

        // Есть два типа преобразования UpCasting (Восходящее) and DownCasting (нисходящее) преобразование
        AnimalCasting aCast = new AnimalCasting(); // есть метод eat
        DogCasting dCast = new DogCasting(); // есть два метода bark, eat

        // Это называется UpCasting (Восходящее преобразование). Восходящее потому что DogCasting класс наследник
        AnimalCasting aDog = new DogCasting(); // здесь объект класса рассматриваем с точки зрения класса родителя
        aDog.eat(); // есть методы принадлежащие только родителю
        DogCasting dog = new DogCasting();
        AnimalCasting animal = dog; // redundant = избыточный. Таким образом собака уходит выше по иерархии и
        // превращается в животное. UpCasting осуществляется неявно

        // DownCasting. Преобразование от родительского класса к классу наследнику. Нисходящее преобразование небезопасно
        AnimalCasting animalDown = new AnimalCasting();
        DogCasting dogDown =(DogCasting) animalDown; // Явное нисходящее преобразование
        // вызывает исключение
        // Exception in thread "main" java.lang.ClassCastException: class additionalInformation.Beginners.Classes.Lesson32_Casting.AnimalCasting cannot be cast to class additionalInformation.Beginners.Classes.Lesson32_Casting.DogCasting (additionalInformation.Beginners.Classes.Lesson32_Casting.AnimalCasting and additionalInformation.Beginners.Classes.Lesson32_Casting.DogCasting are in unnamed module of loader 'app')
        //	at additionalInformation.Beginners.Classes.Lesson32_Casting.Casting.main(Casting.java:18)
        dogDown.bark(); // доступны методы родителя и наследника
        dogDown.eat();


    }

}

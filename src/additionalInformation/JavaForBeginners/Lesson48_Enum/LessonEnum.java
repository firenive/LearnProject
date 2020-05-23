package additionalInformation.JavaForBeginners.Lesson48_Enum;

public class LessonEnum {


    public static void main(String[] args) {
        // enum (enumeration) перечисления. Используется когда нужно перечислить типы объектов (например времена года, страны и т.д.)
        // как делаются перечисления без Enum рассмотрено в классе WithoutEnum
        // Для работы с enum создадим public enum Animal. Названия Enum по конвенции указывваются в единственом числе
        Animal animal = Animal.CAT; // Сразу при создании объекта Enum можем выбрать нужный тип животного (статическая переменная)

        // задаем перечисление по животным. Можем при перечислении указать только переменные, определенные в Enum
        switch (animal) {
            case CAT:
                System.out.println("It's a cat");
                break;
            case DOG:
                System.out.println("It's a dog");
                break;
            case FROG:
                System.out.println("It's a frog");
        }

        Season season = Season.WINTER;

        // проверка является ли объект WINTER объектом класса Season
        System.out.println(season instanceof Season); // true

        // проверка является ли объект WINTER объектом класса Enum. Enum является родителем класса Season. вернется true
        System.out.println(season instanceof Enum); // true

        System.out.println(season instanceof Object); // true

        System.out.println(season.getClass()); // class additionalInformation.JavaForBeginners.Lesson48_Enum.Season


        switch (season) {
            case SUMMER:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's snowy outside");
        }
        // создадим конструктор в Enum Animal
        Animal animal2 = Animal.DOG;
        System.out.println(animal2.getTranslation()); // Собака
        System.out.println(animal2.toString()); // DOG - Собака

        System.out.println(season.getAverageTemp()); // -12.2
        System.out.println(season.toString()); // Average winter temperature = -12.2


        // методы определенные для класса enum. полезные в работе
        System.out.println(season.name()); // WINTER название enum в виде строки

        Animal cat = Animal.valueOf("CAT"); // вернет enum, указанный в строке (CAT)
        System.out.println(cat.toString()); // CAT - Кошка

        System.out.println(cat.ordinal()); // возвращает индекс объекта enum в перечислении. нумерация с 0. OUT: 1

    }
}

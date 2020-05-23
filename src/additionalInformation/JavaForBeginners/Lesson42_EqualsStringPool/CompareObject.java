package additionalInformation.JavaForBeginners.Lesson42_EqualsStringPool;

public class CompareObject {


    public static void main(String[] args) {
       // сравнение примитивных объектов
        int x = 1;
        int x1 = 2;
        System.out.println(x == x1); // false   <, >, <=, >=

        AnimalCompare animal1 = new AnimalCompare(1);
        AnimalCompare animal2 = new AnimalCompare(1);
        System.out.println(animal1 == animal2); // false
        // сравнение вида == сравнивает не сами объекты, а ссылки на них. Разные объекты с одинаковыми значениями хранятся
        // в разных ячейках памяти, вследствии чего ссылки на них разные. Поэтому всегда false

        // для сравнения объектов применяется метод equals() из класса Object. метод возврает true только когда ссыылки
        // указывают на один и тот же объект. содержимое полей не учитывается при сравнении
        System.out.println(animal1.equals(animal2)); // false

        // для сравнение полей в объекте необходиме переопределить equals в классе AnimalCompare
        // после переопределения метода вернется true
        System.out.println(animal1.equals(animal2));

        // == может быть true если две ссылки указывают на один и тот же объект
        AnimalCompare animal3 = animal2;
        System.out.println(animal3 == animal2); // true


    }
}
class AnimalCompare {
    private int id;
    public AnimalCompare (int id) {
        this.id = id;
    }
    @Override
    // задаваемая логика сравнения: два объекта класса AnimalCompare равны, если равны их значения id
    public boolean equals(Object obj) {
        AnimalCompare anim = (AnimalCompare) obj; // применение DownCasting
        return  this.id == anim.id; // идет сравнение 2 примитивов
    }
}

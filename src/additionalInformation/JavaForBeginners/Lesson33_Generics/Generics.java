package additionalInformation.JavaForBeginners.Lesson33_Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        //////         !!!!!!! УСТАРЕВШЕЕ. СЕЙЧАС НЕ ПРИМЕНЯЕТСЯ!!!!!
        // как было до появления Generics. Появились они в Java 5
        // ArrayList является динамическим массивом который расширяется при добавлении новых элементов
        // List list = new ArrayList<>(); // List является интерфейсом. List это класс
        Animal ourAnimal = new Animal();

        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal); // можем поместить объект любого класса
       // System.out.println(new String((String) animals.get(3))); // ошибка  cannot be cast to class java.lang.String



        // String animal = animals.get(1); ошибка компиляции, так как справа возврашается объект, хотя в ArrayList мы
        // помещали строку. На самом деле внутри ArrayList хранятся только объекты класса Object. Для получения строки
        // необходимо сделать downcast с Object до строки
        String animal = (String) animals.get(1); // Обозначаем, что на самом деле там хранятся объекты класса String
        System.out.println(animal);

        // Из-за неудобства постоянного DownCasta был введен механизм параметризации класса (generics)

        List<String> animals2 = new ArrayList<>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        // animals2.add(23); ошибка

        String animal2 = animals2.get(1); // Теперь ошибки не будет так как при создании объекта класса ArrayList
        // был указан тип данных, которые в нем содержатся = String



    }
}
class Animal {

}

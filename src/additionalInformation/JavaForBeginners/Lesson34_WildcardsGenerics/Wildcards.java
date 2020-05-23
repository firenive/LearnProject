package additionalInformation.JavaForBeginners.Lesson34_WildcardsGenerics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<AnimalWildcards> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new AnimalWildcards(1, "cat"));
        listOfAnimals.add(new AnimalWildcards(2, "dog"));

        test(listOfAnimals);

        List<DogWildcards> listOfDogs = new ArrayList<>();
        listOfDogs.add(new DogWildcards());
        listOfDogs.add(new DogWildcards());
        // Благодаря полиморфизму мы можем передать в метод вместо объекта класса родителя любой объект его наследника
        // public void test (AnimalWildcards anim) {} также принимает объекты класса DogWildcards
        // test(listOfDogs); ошибка
        // изменим передаваемый параметр в метод test. с List<AnimalWildcards> list на List<? extends AnimalWildcards > list)

    }  // теперь мы можем передавать объект любого класса наследника AnimalWildcards
    private static void test (List<? extends AnimalWildcards > list) { // в параметрах передаем список с указание типа содержащихся объектов
        for (AnimalWildcards anim : list) {
            System.out.println(anim);
        }
    }
}

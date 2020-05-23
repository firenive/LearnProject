package Myrusakov.Chapter5_GeneralClasses.Lesson3_HashMap.Lect;

import java.util.HashMap;
import java.util.Map;

public class ObjectHashMap {
    // https://javarush.ru/groups/posts/1940-klass-hashmap-
    public static void main(String[] args) {
        // HashMap представляет собой массив, в котором элементов вместо порядкового номера (индекса) задается определенный
        // идентификатор
        // Первый параметр обозначает тип данных ключа = String; Второй параметр обозначает тип данных массива = String
        //  ключ в HashMap всегда является уникальным. при добавление элемента с тем же ключом происходит его перезапись
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("name", "Michael"); // первым указываем ключ, затем его значение
        data.put("city", "Moscow");
        data.put("age", "27"); // по ключу можем получить значение массива
        System.out.println(data.get("name"));
        System.out.println(data.get("city"));
        System.out.println(data.get("age"));
        System.out.println(data.containsKey("name")); // true. проверка на нахождение указанного ключа в массиве
        System.out.println(data.containsValue("Moscow")); // true. проверка на нахождение указанного значения в массиве
        System.out.println(data.isEmpty()); // проверка на пустоту. если массив пустой вернет true, иначе false
        System.out.println(data.size()); // Out:3 . Возвращает количетсво элементов в массиве
        data.put("temp", "value");
        // Перебор массива осуществляется с помощью внутреннего класса Entry принадлежащем классу Map
        for(Map.Entry<String, String> d: data.entrySet()) {
            String key = d.getKey(); // Перебор массива по ключу. возвращается ключи
            String value = d.getValue(); // перебор массива по значениям. Возвращаются значения
            System.out.print(key + " ");
            System.out.print(value + "\n");
            // temp value
            // city Moscow
            // name Michael
            // age 27
        }
        data.remove("temp"); // удаление элемента массива осуществляется по ключу
        System.out.println("-----------------------");
        // вывод всех элементов массива с помощью lambda выражения
        data.forEach((key, value) -> System.out.println(key + " = " + value));
        // city = Moscow
        // name = Michael
        // age = 27

        System.out.println("-----------------------");
        // удаление элемента по значению массива
        // values() Returns a Collection view of the values contained in this map.
        data.values().remove("Moscow");
        data.forEach((key, value) -> System.out.println(key + " = " + value));
//        name = Michael
//        age = 27
        data.clear(); // очищает массив
        // Еще одна удобная особенность HashMap — можно по-отдельности получить список всех ключей и всех значений.
        // Для этого используются методы keySet() и values():
    }
}

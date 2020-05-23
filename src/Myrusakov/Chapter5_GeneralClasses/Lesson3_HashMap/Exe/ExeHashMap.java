package Myrusakov.Chapter5_GeneralClasses.Lesson3_HashMap.Exe;

import java.util.HashMap;
import java.util.Map;

public class ExeHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> agePerson = new HashMap<String,Integer>();
        agePerson.put("Maksim", 26);
        agePerson.put("Oleg",  25);
        agePerson.put("Vasilisa", 78);
        agePerson.put("Vladimir", 68);
        // HashMap имеет переопределенынй метод toString
        System.out.println(agePerson); // формат вывода объекта: {Vasilisa=78, Vladimir=68, Oleg=25, Maksim=26}
        System.out.println("----------------");
        for(Map.Entry<String, Integer> d: agePerson.entrySet()) {
            System.out.println(d.getKey() + " = " + d.getValue());
        }
        System.out.println("-------------");
        agePerson.forEach((name, age) -> System.out.println(name + " = " + age));
        System.out.println("-------------");
        // увеличим возраст второго человека на 4
        agePerson.put("Oleg", agePerson.get("Oleg") + 4);
        agePerson.forEach((name, age) -> System.out.println(name + " = " + age));



    }
}

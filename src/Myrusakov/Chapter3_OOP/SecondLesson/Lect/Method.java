package Myrusakov.Chapter3_OOP.SecondLesson.Lect;

public class Method {
    public static void main (String[] args) {
        SecondPerson sc = new SecondPerson("Yuri", "New-York", 21);
        System.out.println(sc.getTextInfo());
        sc.setName("Oleg");
        sc.setAge(67);
        System.out.println(sc.getName());
        System.out.println(sc.getCity());
        System.out.println(sc.getAge());

        SecondPerson sc_new = new SecondPerson("Igor", "Vladivostok", 56);
        sc.WhoIsOlder(sc_new);
        sc.setAge(31);
        sc.WhoIsOlder(sc_new);
        sc.setAge(56);
        sc.WhoIsOlder(sc_new);
        sc_new.setAge(91);
        sc.WhoIsOlder(sc_new);

        SecondPerson sc_def = new SecondPerson(); // Если не присваивать значения встанут по умолчанию благодаря перегрузке конструктора
        System.out.println(sc_def.getTextInfo()); // Имя: Default name;  Город: Default city;  Возраст: 0
        sc_new.setAge(); // встанет значение по умолчанию = 0
        System.out.println(sc_new.getAge());
    }
}

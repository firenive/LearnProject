package Myrusakov.Chapter3_OOP.SecondLesson.Lect;

public class SecondPerson {
    String name;
    String city;
    int age;
    public SecondPerson(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
    // перегрузка конструктора
    public SecondPerson() {
        // вызываем текущий конструктор (выше) и передаем в него стандартные значения свойств
        this("Default name" , "Default city", 0);
    }
    public String getTextInfo() { // метод для получение всех свойств объекта в виде строки
        return  "Имя: " + this.name + ";  Город: " + this.city + ";  Возраст: " + this.age;
    }
    // методы по получению каждого из свойств
    public String getName() {
        return name;
    }
    public String getCity () {
        return city;
    }
    public int getAge() {
        return this.age;
    }

    // методы set для присваивания свойству значения
    public void setName(String name) { // void означает что метод не возвращает никаких значений
        this.name = name;
    }
    public  void setCity(String c) {
        city = c;
    }
    public  void setAge(int age) {
        this.age = age;

    // перегрузим методы по установке параметров выше. Теперь если вызывать методы по установке имени, города, возраста и не
        // передавать им параметров будут вставать default значения
    }
    public void setName() { // void означает что метод не возвращает никаких значений
        setName("Default name");
    }
    public  void setCity() {
        setCity("Default city");
    }
    public  void setAge() {
        setAge(0);
    }
    public void WhoIsOlder(SecondPerson sc2) { // передаем в качестве параметра объект этого же класса
        if (this.age > sc2.age) System.out.println(this.name + " старше чем " + sc2.name);
        else if (this.age == sc2.age) System.out.println(this.name + " ровесник  " + sc2.name);
        else System.out.println(this.name + " младше чем " + sc2.name);
    }

}

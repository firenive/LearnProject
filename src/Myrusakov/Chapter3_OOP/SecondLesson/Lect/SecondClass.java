package Myrusakov.Chapter3_OOP.SecondLesson.Lect;

public class SecondClass {
    public static void main (String[] args) {
        SecondPerson p = new SecondPerson("Maksim", "Kostroma", 26);
        System.out.println(p.name);
        System.out.println(p.city);
        System.out.println(p.age);
        SecondPerson[] p_arr = new SecondPerson[3];
        p_arr[0] = new SecondPerson("Pavel", "Moscow", 21);
        p_arr[1] = new SecondPerson("Elena", "Omsk", 20);
        p_arr[2] = new SecondPerson("Aleksandr", "Saint-Petersburg", 42);
        for(SecondPerson b : p_arr) {
//            b.age = 15; меняем значение свойства age у всех элементов массива
            System.out.println(b.name + " " +  b.city + "  " + b.age);
        }
        // или выводим так
        for (int i = 0; i < p_arr.length; i++) {
            System.out.println(p_arr[i].name + " " + p_arr[i].city + " " + p_arr[i].age);
        }
    }
}

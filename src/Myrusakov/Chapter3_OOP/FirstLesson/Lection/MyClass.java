package Myrusakov.Chapter3_OOP.FirstLesson.Lection;

public class MyClass {
    public static void main (String[] args) {
        Person p = new Person("Maksim", "Kostroma", 26);
        System.out.println(p.name);
        System.out.println(p.city);
        System.out.println(p.age);
        Person[] p_arr = new Person[3];
        p_arr[0] = new Person("Pavel", "Moscow", 21);
        p_arr[1] = new Person("Elena", "Omsk", 20);
        p_arr[2] = new Person("Aleksandr", "Saint-Petersburg", 42);
        for(Person b : p_arr) {
//            b.age = 15; меняем значение свойства age у всех элементов массива
            System.out.println(b.name + " " +  b.city + "  " + b.age);
        }
        // или выводим так
        for (int i = 0; i < p_arr.length; i++) {
            System.out.println(p_arr[i].name + " " + p_arr[i].city + " " + p_arr[i].age);
        }
    }
}

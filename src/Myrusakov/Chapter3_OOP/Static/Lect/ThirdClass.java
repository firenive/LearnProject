package Myrusakov.Chapter3_OOP.Static.Lect;

public class ThirdClass {
    public static void main (String[] args) {
        ThirdPerson p = new ThirdPerson("Maksim", "Kostroma", 26);
        System.out.println(p.name);
        System.out.println(p.city);
        System.out.println(p.age);
        ThirdPerson[] p_arr = new ThirdPerson[3];
        p_arr[0] = new ThirdPerson("Pavel", "Moscow", 21);
        p_arr[1] = new ThirdPerson("Elena", "Omsk", 20);
        p_arr[2] = new ThirdPerson("Aleksandr", "Saint-Petersburg", 42);
        for(ThirdPerson b : p_arr) {
//            b.age = 15; меняем значение свойства age у всех элементов массива
            System.out.println(b.name + " " +  b.city + "  " + b.age);
        }
        // или выводим так
        for (int i = 0; i < p_arr.length; i++) {
            System.out.println(p_arr[i].name + " " + p_arr[i].city + " " + p_arr[i].age);
        }
    }
}

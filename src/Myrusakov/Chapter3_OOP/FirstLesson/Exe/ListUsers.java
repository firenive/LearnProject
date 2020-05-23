package Myrusakov.Chapter3_OOP.FirstLesson.Exe;

public class ListUsers {
    public static void main(String[] args) {


    User admin = new User(101, "admin", "123456");
    System.out.println(admin.id + " " + admin.login + " " + admin.password);
    User[] users_arr = new User[3];
    users_arr[0] = new User(156, "developer", "123abc");
    users_arr[1] = new User(110, "test_lead", "AbcAbc");
    users_arr[2] = new User(111, "tester", "Test1");
    for (User b : users_arr) {
        System.out.println(b.id + " " + b.login + " " + b.password);
    }
}
}

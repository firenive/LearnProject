package Myrusakov.Chapter3_OOP.SecondLesson.Exe;

public class ListUsersSecond {
    public static void main(String[] args) {


    SecondUser admin = new SecondUser(101, "admin", "123456");
    System.out.println(admin.getId() + " " + admin.getLogin() + " " + admin.getPassword());
    SecondUser[] users_arr = new SecondUser[3];
    users_arr[0] = new SecondUser(156, "developer", "123abc");
    users_arr[1] = new SecondUser(110, "test_lead", "AbcAbc");
    users_arr[2] = new SecondUser(111, "tester", "Test1");
    for (SecondUser b : users_arr) {
        System.out.println(b.getId() + " " + b.getLogin() + " " + b.getPassword());
    }
    admin.setId(190);
    System.out.println(admin.getInfo());
    System.out.println("-----------------------------");
    SecondUser def = new SecondUser(102, "guest", "2312");
    def.setPassword();
    System.out.println(def.getInfo());
    System.out.println(def.getLogin());
    def.setLogin("new user");
    System.out.println(def.getLogin());


}
}

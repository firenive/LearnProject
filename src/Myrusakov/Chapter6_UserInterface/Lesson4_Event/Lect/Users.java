package Myrusakov.Chapter6_UserInterface.Lesson4_Event.Lect;

import java.util.ArrayList;

public class Users {
    private String name;
    private String email;
    private boolean news;
    // В этом  классе будут хранится данные всех пользователей, которые ввели свое имя, емайл, поставили галочку
    // подписки и нажали на кнопку подписаться
    private static ArrayList<Users> users = new ArrayList<>();

    public Users(String name, String email, boolean news) throws UserException {
        // бросаем исключения если в форме не заполнено имя или емэйл
        if (name.length() == 0) throw new UserException(UserException.NO_NAME);
        if (email.length() == 0) throw new UserException(UserException.NO_EMAIL);
        this.name = name;
        this.email = email;
        this.news = news;
    }
    public static void  add(Users newUser) { // метод позволяет добавлять новых пользователей в массив
        users.add(newUser);
    }
    public static void printAllUsers() {
        users.forEach((s) -> System.out.println(s));
    }
    public String toString() {
        return "Пользователь: " + name + " Email: " +email +  " Согласие на подписку: " + news;
    }
}

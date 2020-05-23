package Myrusakov.Chapter3_OOP.Extends.Exe;

public class mainUser {
    public static void main(String[] args) {
        UserSocial us = new UserSocial(12,"User_one", "111111", "Pavel", 22);
        us.setAge(23);
        us.setId(132);
        System.out.println(us.getAge());
        System.out.println(us.getInfo());
        System.out.println(us.getId());
        WebMaster wm = new WebMaster(169, "Web_Master", "wwwwwwwww", "https://google.com");
        System.out.println(wm.getUrl());
        wm.setUrl("https://yandex.ru");
        System.out.println(wm.getInfo());
    }
}

package Myrusakov.Chapter3_OOP.Work.Abstract.Exe;

public class mainUserAbstract {
    public static void main(String[] args) {
        UserSocialAbstract us = new UserSocialAbstract(12,"User_one", "111111", "Pavel", 22);
        us.setAge(23);
        us.setId(132);
        System.out.println(us.getAge());
        System.out.println(us.getId());
        us.printUser();

        WebMasterAbstract wm = new WebMasterAbstract(169, "Web_Master", "wwwwwwwww", "https://google.com");
        System.out.println(wm.getUrl());
        wm.setUrl("https://yandex.ru");
        us.printUser();
    }
}

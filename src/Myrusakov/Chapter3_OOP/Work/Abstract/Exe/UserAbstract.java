package Myrusakov.Chapter3_OOP.Work.Abstract.Exe;

public abstract class UserAbstract implements PrintData {
    private int id;
     private String login;
    private String password;
    public UserAbstract(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }
    // get
    public String getInfo() {
        return "ID: " + id + "; Login: " + login + "; Password: " + password;
    }
    public int getId() {
        return id;
    }
    public  String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    // set
    public void  setId(int id) {
        this.id = id;
    }
    public void  setLogin(String login) {
        this.login = login;
    }
    public  void setPassword(String password) {
        this.password = password;
    }
    // перегружаем методы set для задания стандартных значений
    public void  setId() {
        setId(0);
    }
    public void  setLogin() {
        setLogin("Default_login");
    }
    public  void setPassword() {
        setPassword("123456789");
    }

    public abstract void printUser();

}

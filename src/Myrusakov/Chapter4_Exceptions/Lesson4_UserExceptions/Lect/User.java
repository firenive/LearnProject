package Exceptions.Lesson4_UserExceptions.Lect;

public class User {
    private String login;
    public void setLogin (String login) throws UsException {
        // перед установкой login проверяется количество символов в поле. В зависимоти от количества
        if( login.length() < 3) throw new UsException(UsException.SHORT_LOGIN);
        if (login.length() > 6) throw  new UsException(UsException.LONG_LOGIN);
        this.login = login;
    }
    public String getLogin() {
        return login;
    }
}

package Exceptions.Lesson4_UserExceptions.Lect;

public class UsException extends Exception  {
    private int code;
    public final static int SHORT_LOGIN = 1;
    public final static int LONG_LOGIN = 2;

    public UsException (int code) {
        this.code = code;

    }
    public int getCode() {
        return code;
    }

}

package Myrusakov.Chapter6_UserInterface.Lesson4_Event.Lect;

public class UserException extends Exception {
    static final int NO_NAME = 1;
    static final int NO_EMAIL = 2;
    private int code;

    public UserException(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

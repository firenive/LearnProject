package Myrusakov.Chapter4_Exceptions.Lesson4.Exe;

public class NoNumberException extends Exception{
    @Override
    public String toString() {
        return "Вы ввели не число";
    }
}

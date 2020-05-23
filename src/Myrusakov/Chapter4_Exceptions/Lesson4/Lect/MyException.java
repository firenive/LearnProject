package Myrusakov.Chapter4_Exceptions.Lesson4.Lect;

import javax.swing.*;

public class MyException {
    public static void main(String[] args) {
        String in = JOptionPane.showInputDialog(null, "Пожалуйста введите Login");
        User us = new User();
        try {
            us.setLogin(in);
            System.out.println(us.getLogin());
        } catch (UsException ue) {
            if( ue.getCode() == UsException.SHORT_LOGIN) {
                JOptionPane.showMessageDialog(null, "Логин слишком короткий");
            }
            else if (ue.getCode() == UsException.LONG_LOGIN) {
                JOptionPane.showMessageDialog(null, "Логин слишком длинный");
            }
        }
    }
}

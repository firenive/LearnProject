package Myrusakov.Chapter5_GeneralClasses.Lesson4_ArrayList.Exe;

import java.util.ArrayList;
import java.util.Arrays;

public class LoginList {
    public static void main(String[] args) {
        ArrayList<String> newLogin = new ArrayList<String>();
        String[] login = {"firstLog", "secondLog", "thirdLog", "fourthLog", "fifthLog"};
        newLogin.addAll(Arrays.asList(login));
        for (int i = 0; i < newLogin.size(); i++) {
            System.out.print(newLogin.get(i) + " ");
        }
        System.out.println();
        newLogin.set(1, "newSecondLog");
        newLogin.forEach((s) -> System.out.print(s + " "));

    }
}

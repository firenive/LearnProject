package Myrusakov.Chapter6_UserInterface.Lesson8_CreateComponent.Lect;

import javax.swing.*;
import java.awt.*;

public class UserButton extends JButton {
    // необбходимо создать у каждой кнопки определенный код, отвечающий за переданные ей действия
    private int code;

    public UserButton(String title, int code) {
        super(title);
        this.code = code;
        setFont(new Font("Helvetica", Font.BOLD, 40));
    }

    public int getCode() {
        return code;
    }
}

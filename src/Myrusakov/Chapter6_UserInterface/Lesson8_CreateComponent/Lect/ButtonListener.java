package Myrusakov.Chapter6_UserInterface.Lesson8_CreateComponent.Lect;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    public final static int EXIT = 0;
    public final static int PRINT = 1;

    @Override
    public void actionPerformed(ActionEvent e) {
        int code = ((UserButton) e.getSource()).getCode();
        // обращаемся к источнику из которого был вызван listener (UserButton) и получаем код
        if (code == EXIT) System.exit(0);
        // Механизм с передачей каждой кнопки определенного кода позволяет избежать ситуации, когда в случае смены наименования
        // кнопки слетают все привязанные к ней Listeners
        if (code == PRINT) System.out.println("Информация в консоль");
    }
}

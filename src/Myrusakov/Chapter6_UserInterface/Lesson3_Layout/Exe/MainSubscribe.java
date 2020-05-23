package Myrusakov.Chapter6_UserInterface.Lesson3_Layout.Exe;

import javax.swing.*;

public class MainSubscribe {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        // Установка вида формы, как у используемой операционной системы
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        // Запуск GUI code в одельном Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Subscribe sub = new Subscribe();
                sub.setVisible(true);
            }
        });
        // Второй способ установки для нашего окна нужной панели с контентом
        /*JFrame frame = new JFrame();
        frame.setContentPane(new Subscribe().getRootPanel());*/


    }
}

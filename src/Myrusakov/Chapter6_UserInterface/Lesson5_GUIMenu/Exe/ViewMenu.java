package Myrusakov.Chapter6_UserInterface.Lesson5_GUIMenu.Exe;

import javax.swing.*;

public class ViewMenu extends JFrame {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new ViewMenu();
    }

    private ActionSize act = new ActionSize(this);

    protected ViewMenu (){
        super("System menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 400,250);
        JMenuBar bar = new JMenuBar();
        bar.add(createProgramMenu());
        bar.add(createViewMenu());
        setJMenuBar(bar);
        setVisible(true);
    }
    protected JMenu createViewMenu() {

        JMenu view = new JMenu("View");
        JMenu sizeFrame = new JMenu("Size frame");
        JMenuItem size640 = new JMenuItem("640x480");
        JMenuItem size800 = new JMenuItem("800x600");
        JMenuItem size1024 = new JMenuItem("1024x768");
        view.add(sizeFrame);
        sizeFrame.add(size640);
        sizeFrame.add(size800);
        sizeFrame.add(size1024);
        size640.addActionListener(act);
        size800.addActionListener(act);
        size1024.addActionListener(act);
        return view;
    }

    protected JMenu createProgramMenu() {
        JMenu program = new JMenu("Program");
        JMenuItem exit = new JMenuItem("Exit");
        program.add(exit);
        exit.addActionListener(act);
        return program;
    }
}

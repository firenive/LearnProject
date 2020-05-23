package Myrusakov.Chapter10_Patterns.Strategy;

public class SmartMouse implements Strategy {
    @Override
    public void execute() {
        System.out.println("Действуем с умом по определенному алгоритму");
    }
}

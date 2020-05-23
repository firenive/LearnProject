package Myrusakov.Chapter10_Patterns.Strategy;

public class StupidMouse implements Strategy{
    @Override
    public void execute() {
        System.out.println("Действуем глупо, наугад");
    }
}

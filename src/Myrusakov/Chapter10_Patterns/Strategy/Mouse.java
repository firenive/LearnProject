package Myrusakov.Chapter10_Patterns.Strategy;

public class Mouse {
    private Strategy str;

    public void setStr (Strategy str) {
        this.str = str;
    }
    public void execute() {
        // В зависимости от стратегии котороая будет установлена для мыши будет исполнятся соответствующий код
        str.execute();
    }
}

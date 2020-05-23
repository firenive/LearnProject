package Myrusakov.Chapter10_Patterns.Prototype;

public class Prototype {
    private int x;
    private int y;

    public Prototype(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Переменная х = " + x + "\n" + "Переменная y = " + y;
    }
    // реализация переопределенного метода clone. Метод возвращает новый объект класса. В качестве параметров указываются
    // текущие значения x, y
    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return new Prototype(x, y);
    }
}

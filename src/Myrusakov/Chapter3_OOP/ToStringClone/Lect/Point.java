package Myrusakov.Chapter3_OOP.ToStringClone.Lect;
// https://javarush.ru/groups/posts/695-10-podskazok-po-pereopredeleniju-metoda-tostring-v-java-chastjh-1
public class Point implements Cloneable {
    private int x;
    private int y;
    private int id = 1;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
//    @Override
//    public Point clone() { // для создания клона объекта переопределим метод clone возвращая новый объект класса Point
//        // С теми же координатами
//
//        return new Point(x, y);
//    }
    @Override // также при клонировании можно производить различные действия с объектом, например изменить значение переменной id
    public Point clone() {
        Point p = new Point(x, y);
        p.id = 2;
        return p;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Точка с координатами (" + x + "," + y + ")"; // возвращаем строку с информацией об объекте.
        // метод toString принадлежит классу Object
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

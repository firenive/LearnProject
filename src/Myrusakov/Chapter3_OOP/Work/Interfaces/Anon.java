package Myrusakov.Chapter3_OOP.Work.Interfaces;

public class Anon {
    public static void main(String[] args) {

        Shape sp = new Shape(10, 20) { // создаем объект класса Shape, который является абстрактным классом
            // реализовываем все его методы
            public void draw() {
                System.out.println("рисуем точку с координатами: " + "(" + x + "," + y + ");");
            }
        };
    DrawShape ds = new DrawShape() {
        @Override
        public void draw() {
            System.out.println("Рисуем что-то");
        }
    };
    }
}

package Myrusakov.Chapter3_OOP.Inner;

public class inner {
    public static void main(String[] args) {
        MyLine line = new MyLine(10, 5, -7, 12);
        System.out.println(line);
    }

    public static class MyLine {
        public MyPoint pointStart;
        public MyPoint pointEnd;

        public MyLine(int x1, int y1, int x2, int y2) {
            pointStart = new MyPoint(x1, y1);
            pointEnd = new MyPoint(x2, y2);
        }

        @Override
        public String toString() {
            return String.format("Начальная точка (%d, %,d); Конечная точка (%d, %d)"
                    , pointStart.x, pointStart.y, pointEnd.x, pointEnd.y);
        }
    }

    public static class  MyPoint {
        public int x;
        public int y;

        public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

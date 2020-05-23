package Myrusakov.Chapter3_OOP.InnerClassExe;

public class MyLine {
    public MyPoint PointStart;
    public MyPoint PointEnd;


    public MyLine(int xStart, int xEnd, int yStart, int yEnd) {
        PointStart = new MyPoint(xStart, yStart);
        PointEnd = new MyPoint(xEnd, yEnd);
    }

    @Override
    public String toString() {
        return String.format("Начальная точка (%d, %d); Конечная точка (%d, %d)"
                , PointStart.x, PointStart.y, PointEnd.x, PointEnd.y);
    }

    public class MyPoint {
        public int x;
        public int y;
        public MyPoint (int x, int y) {
            this.x = x;
            this.y = y;
        }


    }
}

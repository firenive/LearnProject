package additionalInformation.Debug;

public class Car {
    public int Run(int speed, int accelerate) { // метод который показывает увеличение скорости
        return speed + accelerate;
    }
    public static void main(String[] args) { // данный метод main создан для дебага. передаем значение и дебажим в этом же окне
        System.out.println(new Car().Run(5,4));
    }
}

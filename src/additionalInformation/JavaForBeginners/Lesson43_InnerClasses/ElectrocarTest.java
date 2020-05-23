package additionalInformation.JavaForBeginners.Lesson43_InnerClasses;

public class ElectrocarTest {
    public static void main(String[] args) {
        Electrocar car = new Electrocar(232);
        car.start();
        Electrocar.Battery battery = new Electrocar.Battery(); // Теперь мы понимаем, что класс Battery лежит внутри
        // класса Electrocar
    }

}

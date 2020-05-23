package additionalInformation.JavaForBeginners.Lesson40_Exception4;

public class Exception4 {
    public static void main(String[] args) {
        run();


    }
    // из одного метода можем выбрасывать несколько разных исключений они также все выбрасываются в вызывающем методе или
    // каждое исключение обрабатывается блоком try с несколькими catch
    public static void run()  throws NullPointerException, NumberFormatException {
        String x = null;
        x.length();
    }
}

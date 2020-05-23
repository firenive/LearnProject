package additionalInformation.JavaForBeginners.Lesson38_Exceptions2;

public class ScannerException extends Exception{
    public ScannerException(String description) { // при выбрасывании исключения мы вызываем его конструктор
        // и передаем ему строчку с описанием
        super(description); // Такой же конструктор определен в родительском классе Exception

    }
}

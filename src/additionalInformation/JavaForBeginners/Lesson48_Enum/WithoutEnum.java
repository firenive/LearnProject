package additionalInformation.JavaForBeginners.Lesson48_Enum;

public class WithoutEnum {
    // перечисляем типы животных. типы животных будут закодированы в целых числах
    // способ использовался до появления Enum
    // Проблемы:
    // 1) Если в переменной animal хранится значение не принадлежащее ни одному животному возникает неопределенность
    // 2) необходимо знать какому животному соответствует его код (целочисленная переменная animal)
    private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int FROG = 2;

    public static void main(String[] args) {
        int animal = DOG; // хранится значение собаки = 0

        switch (animal) {
            case DOG:
                System.out.println("It's a dog");
                break;
            case CAT:
                System.out.println("It's a cat");
                break;
            case FROG:
                System.out.println("It's a frog");
                break;
            default:
                System.out.println("It's not an animal");
        }
    }
}

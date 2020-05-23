package additionalInformation.JavaForBeginners.Lesson49_Recursion;

public class RecursionTest {
    public static void main(String[] args) {
        someMethod();
        counter(3);
        System.out.println("-------------------");
        System.out.println(factorial(10));
    }

    private static void someMethod() {
        System.out.println("Hello");
        // someMethod(); stackOverflowError. Так как идет постоянный вызов метода, метод выполняется (печатает Hello)
        // и запускается снова, до тех пор пока java не выдаст ошибку из-за слишком большого количества вызовов.
        // Количество вызовов хранится в участке памяти, называемым Stack. Из-за большого количества вызовов он переполняется
        // someMethod()-> someMethod() -> someMethod() -> someMethod()
    }

    // Для того чтобы стек не переполнялся нужно ввести условие выхода из рекурсии
    private static void counter(int n) {
        if (n == 0) return;
        System.out.println(n);
        counter(n - 1); // выводим числа от указанного значения до 0
        // При рекурсивном методе до тех пор пока рекурсия не дойдет до базового случая все предыдущие вызовы находятся
        // в стеке и завершаются только при исполнении базового случая
        // counter(3)
        // counter(2)
        // counter(1)
        // вызовы хранятся в стеке

        // counter(0)
        // базовый случай, при котором совершается выход из рекурсии, начинают выполнятся предыдущие вызовы, хранящиеся в стеке
        // counter(1), counter(2), counter(3)

    }
    private static int factorial(int x) {
        if (x == 1 | x == 0) return 1;
        return factorial(x- 1) * x;
    }
    // factorial(4)
    // 4 * factorial(3) = 4 * 6
    // 3 * factorial(2) = 3 * 2
    // 2 * factorial(1) = 2 * 1
    // factorial(1) return 1;


}


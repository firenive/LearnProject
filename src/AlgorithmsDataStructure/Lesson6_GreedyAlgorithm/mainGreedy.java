package AlgorithmsDataStructure.Lesson6_GreedyAlgorithm;

import java.util.Arrays;
import java.util.Collections;

public class mainGreedy {
    public static void main(String[] args) {
        // дан неупорядоченный писок цифр от 0 до 9. Составить из этих цифр наибольшое число
        // на каждом шаге выбирать наибольшую цифру, присоединять ее к результирющему числу, далять цифру из исходного массива
        int[] digits = {3,1,7,9,9,5};

        System.out.println(maxNumberFromDigits(digits)); // 997531
        System.out.println(maxNumberLambda(digits));



    }
    public static StringBuilder maxNumberFromDigits(int[] digits) {
     // Для решения задача сначала отсортируем масив, затем в цикле канкатенируем cтроку для получения итоговой строки
        Arrays.sort(digits);
        StringBuilder result = new StringBuilder();
        for (int i = digits.length -1; i >=0; i--) {
            result.append(digits[i]);
        }

        return result;
    }
    public static String maxNumberLambda(int[] digits) { // реализации функции выше с помощью lambda выражения
        return String.join("", Arrays.stream(digits).boxed().
                sorted(Collections.reverseOrder()).map(String::valueOf).toArray(String[]:: new));
        // Вначале для того чтобы работать с массивом посредством lambda выраженией переводим массив в поток Arrays.stream(digits)
        // затем массив примитивов оборачиваем в класс обертку методом boxed(). затем сортируем его методом sorted()
        // в обратном порядке Collections.reverseOrder(). Функцию map используем для того чтобы преобразовать числа в  строки
        // Далее вызываем toArray для того чтобы преобразовать строку в массив строк
        // Метод join  склеивает единую строку из массива. в качестве delimiter принимает "".
    }
}

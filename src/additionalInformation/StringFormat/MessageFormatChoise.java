package additionalInformation.StringFormat;

import java.text.ChoiceFormat;
import java.text.MessageFormat;
// https://javarush.ru/groups/posts/590-klass-messageformat
public class MessageFormatChoise {
    // Также возможно сделать так, что в зависимости от значения переменной будет выбираться необходимый текст.
    // Своего рода реализация оператора if...else, только с помощью класса ChoiceFormat.
    public static void main(String[] args) {
        MessageFormat form = new MessageFormat("Я могу {1} {0}.");
        int count = 4;
        String exercise = "подтянуться";
        Object[] testArgs = {count, exercise};
        double[] fileLimits = {0, 2, 5}; // массив double[] filelimits, в котором указываются пределы значений,
        // при которых будет меняться вывод строк.
        String[] filePart = {"{0} раз", "{0} раза", "{0} раз"};
        // в массиве String[] filepart указываются те самые варианты строк, которые могут быть использованы.
        ChoiceFormat fileForm = new ChoiceFormat(fileLimits, filePart);
        // Условия выбора варианта строки от значения переменной определяются следующим образом: выберется вариант
        // filepart[j], если filelimits[j] =< count < filelimits[j+1].
        form.setFormatByArgumentIndex(0, fileForm);

        // С помощью метода form.setFormatByArgumentIndex(0, fileform) мы говорим объекту MessageFormat form, что когда
        // вызовут метод format, то для индекса 0 в шаблоне строки используй форматирование, которое было задано в
        // объекте ChoiceFormat fileform.

        System.out.println(form.format(testArgs));

    }
}

package additionalInformation.HotKeys;

public class Editing {
    private String s;
    private String d;

    // Alt + Insert генератор выражений и конструкторов или методы Get and Set
    public Editing(String s, String d) {
        this.s = s;
        this.d = d;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public static void main(String[] args) {

        // https://www.youtube.com/watch?v=vQksLDvacTo
        System.out.println();
        int x = 10;
        // Ctrl + W поэлементное выделение Ctrl + D копирование строки или выражения Ctrl + Y удаление строки
        // Ctrl + C копировать строку Ctrl + X вырезать строку Ctrl + - сворачивание текущего метода
        // Ctrl + Alt + O удалить неиспользуемые импорты Ctrl + {} переход в начало, конец метода Ctrl + G переход на строку
        // Ctrl + backspace удаление слова Shift + Tab убрать отступ Ctrl + Alt + I исправить форматирование текущей строки
        // Alt + Insert генератор выражений и конструкторов
        for (int i = 0; i < x; i++) {

        }

        // Ctrl + Shift + / комментирование строки многострочным комментарием
       /* for (int i = 0; i < x; i++) {

        }*/
        // Выделяем строку и с помощью Ctrl + Alt + T или меню Code делаем Surround With
        while (true) {
            System.out.println("Это не стоит того");
        }


    }
    public String Set() {
        return "Hello";
    }
}

package Myrusakov.Chapter3_OOP.Generalized.Lect;

public class Generic {
    public static void main(String[] args) {
        // Иногда есть необъодимость чтобы класс мог работать с полями разных типов
        // Мы создали класс GenericTest, установив для него тип данных полей = X, Y. теперь при создании объекта класса
        // мы можем передавать нужный нам тип данных,
        GenericTest t = new GenericTest<Integer, String>(12, "Hello");
        t.print();
        t.setData_1("asdsadas"); // несмотря на  то что при вызове конструкторв для переменной data_1 мы указали тип Integer
        // и задали целочисленное значение = 10 Мы можем передать в параметр другой тип данных, например строку
        // чтобы при создании объекта класса зафиксировать тип данных передаваемых при вызове конструктора пишем так

        GenericTest<String, String> tString = new GenericTest<String, String>("Don\'t worry", "Be happy");
        // при указании класса жестко прописываем типы данных, указываем те же типы при вызове конструктора класса (сам объект)
//        tString.setData_1(12); выдаст ошибку при попытки передачи целочисленного значения
        tString.setData_1("First value");
        tString.setData_2("Second value");
        System.out.println(tString.getData_1());
        System.out.println(tString.getData_2());

        GenericTest bool2 = new GenericTest(true, false); // можно создать объект без жесткого задания типов
        // но в этом случае мы не сможем использовать для data_1 и data_2 методы характерные для определенных типов данных
        // например contains, equals для строк и так далее
        // рекомендуется для однородного типа данных прописывать тип данных
        String s1 = "s1";
        s1.length();
        bool2.print();
        bool2.setData_1(5);
        bool2.print();

    }
}

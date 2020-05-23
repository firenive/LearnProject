package Myrusakov.Chapter3_OOP.Generalized.Lect;

public class GenericTest<X, Y> { // X and Y являются типами данных передаваемые для класса.
    // Заранее мы не знаем какой это тип
    private X data_1;
    private Y data_2;

    public GenericTest(X data_1, Y data_2) {
        this.data_1 = data_1;
        this.data_2 = data_2;
    }

    public void print() {
        System.out.println(data_1);
        System.out.println(data_2);
    }

    public X getData_1() {
        return data_1;
    }

    public Y getData_2() {
        return data_2;
    }

    public void setData_1(X data_1) {
        this.data_1 = data_1;
    }

    public void setData_2(Y data_2) {
        this.data_2 = data_2;
    }
}

package Myrusakov.Chapter3_OOP.Generalized.Exe;

public class Shop<X> {
    public X[] massiv;

    public Shop(X[] massiv) {
        this.massiv = massiv;
    }

    public void printObject() {
        for (X i : massiv) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
class TestShop {
    public static void main(String[] args) {
        Integer[] test = {1, 2, 113, 232};
        Shop<Integer> intMass = new Shop<Integer>(test);
        intMass.printObject();
        String[] str = {"sdsd", "fdf", "fgfdg"};
        Shop strMass = new Shop(str);
        strMass.printObject();
        Object[] obMass = { 1, 2, 5, "sds", "3dfd", "12"};
        Shop shop1 = new Shop(obMass);
        shop1.printObject();

    }
}

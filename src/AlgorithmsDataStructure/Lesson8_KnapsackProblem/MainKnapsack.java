package AlgorithmsDataStructure.Lesson8_KnapsackProblem;

import java.util.Arrays;
import java.util.Comparator;

public class MainKnapsack {
    public static void main(String[] args) {
        final Item item1 = new Item(4, 20);
        final Item item2 = new Item(3, 18);
        final Item item3 = new Item(2, 14);

        final Item[] items = {item1, item2, item3}; // набор всех предметов

        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed());
        // сортируем массив предметов по их удельной цене в обратном порядке. У каждого элемента массива item будет
        // вызываться метод valuePerUnitOfWeight. По полученому в результате работы удельной цене сортируются объекты
        System.out.println(Arrays.toString(items)); // [{w:2, v:14}, {w:3, v:18}, {w:4, v:20}]

        final int W = 7; // Вместимость рюкзака
        int weightSoFar = 0; // текущий вес предметов в рюкзаке
        double valueSoFar = 0; // Здесь будет аккумулироваться ценность предметов, уже находящихся в рюкзаке
        int currentItem = 0; // хранится индекс текущего предмета

        // пока не вышли за пределы массива item (Есть предметы, которые можно выбрать) и пока текущий вес предметов в
        // рюкзаке меньше общей вместимости рюкзака
        while (currentItem < items.length && weightSoFar != W) {
            if(weightSoFar + items[currentItem].getWeight() < W) {
                // берем объект с наибольшей удельной ценой и помещаем в рюкзак целиком

                valueSoFar +=items[currentItem].getValue();
                weightSoFar +=items[currentItem].getWeight();
            } else { // иначе берем только часть этого объекта
//                valueSoFar += ((W - weightSoFar) / (double) items[currentItem].getWeight()) *
//                        items[currentItem].getValue();
                valueSoFar += (W - weightSoFar) *items[currentItem].valuePerUnitOfWeight();
                weightSoFar = W; // полный рюкзак
            }
            currentItem++;
        }
        System.out.println("Ценность наилучшего набора: " + valueSoFar);
    }

}
class Item {
    private int weight;
    private int value;
    public Item (int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
    public double valuePerUnitOfWeight() { // позволяет вычислить удельную цену объекта за килограмм
        return value / (double) weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{w:" + weight + ", v:" + value + "}";
    }
}

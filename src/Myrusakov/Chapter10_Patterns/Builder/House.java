package Myrusakov.Chapter10_Patterns.Builder;

public class House {

    public boolean isWood; // деревянный дом или нет
    public boolean isElect; // Есть ли в доме электричество
    public int area; // площадь дома
    public int countFloors; // количество этажей
    public int valuePool;  // объем бассейна у дома
    public int areaPool; // площадь бассейна у дома

    @Override
    public String toString() {
        String s = "Получился следующий дом: ";
        if (isWood) s+= "Деревянный; ";
        else s+= "Кирпичный; ";
        if (isElect) s+= " С электричеством; ";
        else s+= " Без электричества; ";
        s+= "Площадь дома = " + area + "; ";
        s+= "Количество этажей в доме = " + countFloors + "; \n";
        if (valuePool != 0) s+= "Объем бассейна у дома составляет " + valuePool + " m3; ";
        if (areaPool != 0) s+= "Площадь бассейна у дома составляет " + areaPool + " m2. ";
        return s;
    }
}

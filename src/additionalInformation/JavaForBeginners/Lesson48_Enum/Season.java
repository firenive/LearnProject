package additionalInformation.JavaForBeginners.Lesson48_Enum;

public enum Season {
    SUMMER(22.3), WINTER(-12.2), AUTUMN(8.2), SPRING(6.4);
    // Кажому enum объекту объявленному в перечислении присваивается соответствующий индекс, начиная с 0
    // SUMMER(22.3) = 0, WINTER(-12.2) = 1, AUTUMN(8.2) = 2, SPRING(6.4) = 3;

    // По конвенции java объекты enum пишутся в верхнем регистре, так как являются константами
    // каждое значение это объект enum (класса) Season
    // иерархия наследования Enum: Object -> Enum -> Season

    // Мы хотим хранить среднюю температуру в указанное время года
    private double averageTemp;
    Season (double averageTemp) {
        this.averageTemp = averageTemp;
    }
    public double getAverageTemp() {
        return averageTemp;
    }
    @Override
    public String toString(){
        return "Average " + name().toLowerCase() + " temperature = " + averageTemp;
    }
}

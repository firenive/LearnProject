package Myrusakov.Chapter10_Patterns.Builder;

public class BuilderHouse {

    private House house; // будет хранить объект House

    public BuilderHouse() {
        reset();
    }
    public void reset() { // метод reset используется для инициализации объекта House или для сброса всех настроек
        house = new House();
    }
    // реализуем методы для всех переменных определенных в классе House
    public void setWood(boolean isWood) {
        house.isWood = isWood;
    }
    public void setElect(boolean isElect) {
        house.isElect= isElect;
    }
    public void setArea(int area) {
        house.area = area;
    }
    public void setFloor (int floor) {
        house.countFloors = floor;
    }
    public void setPool(int areaPool, int valuePool) {
        house.areaPool = areaPool;
        house.valuePool = valuePool;
    }
    public House getHouse() {
        return house;
    }
}

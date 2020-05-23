package additionalInformation.Interfaces;

public interface Info { // создадим интерфейс, который позволит нам выводить информацию из класса Animal и Person
    /*public void showInfo() { Методы интерфейса не могут иметь тела {}, Потому что интерфейс не задает реализацию
    } */
    // Реализация метода   showInfo будет различаться для классов Person, Animal. Поэтому просто объявим сигнатуру метода
    public void showInfo();
}

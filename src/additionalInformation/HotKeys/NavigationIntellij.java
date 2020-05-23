package additionalInformation.HotKeys;

import Myrusakov.Chapter3_OOP.Work.Abstract.Lect.Animal;
import Myrusakov.Chapter3_OOP.Work.Interfaces.DrawShape;

public class NavigationIntellij extends Animal implements DrawShape {
    @Override
    public void makeSound() {
    // Ctrl + I после наследования абстрактного класса реализует все его методы или методы интерфейса
    }

    public static void main(String[] args) {
        // Alt + 1 показ дерева проектов
        //TODO: комментарий Нажмите Alt + 6 для быстрого перехода по комментариям;

        // Ctrl + N поиск по классу Ctrl + F4 закрыть текущую вкладку
    }

    @Override
    public void draw() {

    }

    @Override
    public void hello() {

    }
}

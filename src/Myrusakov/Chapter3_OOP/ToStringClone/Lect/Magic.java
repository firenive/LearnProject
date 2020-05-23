package Myrusakov.Chapter3_OOP.ToStringClone.Lect;

public class Magic {
    public static void main(String[] args) {
        Point p = new Point(10,20);
        System.out.println(p); // Точка с координатами (10,20)
        // происходит преобразование объекта в строку в результате чего координаты точки выводятся в заданном формате
        String s = "Наш объект: " + p;
        System.out.println(s); // Наш объект: Точка с координатами (10,20)

        Point pNew = p; // создаем копию объекта p. копируется не сам объект а только создается новая ссылка на объект
        System.out.println(pNew); // Точка с координатами (10,20)
        p.setX(50);
        System.out.println(pNew); // при изменении свойств объекта p меняется и  свойства объекта pNew
        // Точка с координатами (50,20)

        Point pClone = p.clone(); // клонируем объект p при этом создастся новый объект
        System.out.println(pClone); // Точка с координатами (50,20)
        p.setX(13); // при изменении свойств объекта p, значения свойств у pClone не меняются, так как это другой объект
        System.out.println(pClone); // Точка с координатами (50,20)

        System.out.println(p.getId()); // вернется 1 так как значение id по умолчанию = 1
        System.out.println(pClone.getId()); // вернется 2, так как в методе clone мы переопределяем значение переменной
    }


}

package Myrusakov.Chapter7_Graphic.Lesson2_DrawFigure.Lect;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class GraphicsShape extends JFrame {
    public static void main(String[] args) {
        new GraphicsShape();

    }

    public GraphicsShape() {
        super("Draw Shape");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 640, 480);

        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.drawLine(20, 100, 30, 50); // рисует линию. в параметрах передаем координаты начальной и конечной точки
        Color oldColor = g2.getColor(); //  получаем цвет, которым рисуем сейчас
        System.out.println(oldColor);
        Color newColor = new Color(255, 0, 0);
        g2.setColor(newColor);
        g2.drawLine(20, 100, 100, 200); // красная линия
        g2.setColor(oldColor);
        g2.drawRect(100, 100, 100, 100); // прямоугольник
        g2.setColor(newColor);
        g2.fillRect(102, 102, 96, 96); // закрашенный прямоугольник
        g2.setColor(oldColor);
        g2.drawRoundRect(50, 250, 100, 100, 30, 40); // Прямоугольнкик с закругленными краями.
        // 5 и 6 параметр это горизонтальный и вертикальнвц размер дуги
        g2.drawOval(70, 270, 60, 60); // эллипс

        g2.setStroke(new BasicStroke(5)); // увеличиваем ширину линии на 5 пикселей
        g2.drawArc(300, 50, 100, 50, 90, 100); // рисуем арку с указанными углами и размерами
        g2.drawArc(300, 50, 100, 50, -90, 100); // рисуем арку с указанными углами и размерами

        // нарисуем Polygon  Многоугольник, каждая точка которого является углом. углов может быть сколько угодно
        int[] arrayX = {30, 120, 180, 270, 315, 70}; //  нарисуем 6 угольник с 6 заданными точками. координаты точек хранятся
        int[] arrayY = {180, 180, 200, 250, 70, 315}; // в массивах. созданы отдельные массивы для координат X и Y

        Polygon p = new Polygon(arrayX, arrayY, 6); // последний параметр количество точек
        g2.drawPolygon(p);


        Color green = new Color(0, 200, 0);
        g2.setColor(green);
        Font font = new Font("Tahoma", Font.BOLD | Font.ITALIC, 20); // жирный курсивный шрифт
        g2.setFont(font);
        g2.drawString("Hello world", 50, 400); // надпись

        g2.setPaint(new GradientPaint(0, 0, Color.RED, 100, 200, Color.BLUE, true));
        // градиентное закрашивание. принимает координаты начальной точки и первого цвета. затем принимает координаты
        // конечной точки и второго цвета. последний параметр повторяет заполнение градиента по фигуре если размер
        // фигуры больше размера градиента
        g2.fill(new Ellipse2D.Double(400, 100, 200, 100)); // закрашенный элипс с градиентными цветами

        // рисуем случайные точки в случайных координатах разным цветом
        for (int i = 0; i < 100; i++) {
            Color randColor = new Color( //  Указываем рандомную генерацию числа в диапазоне от 0 до 255. это будут цвета
                    (int) Math.ceil(Math.random() * 255),
                    (int) Math.ceil(Math.random() * 255),
                    (int) Math.ceil(Math.random() * 255)
            );
            g2.setColor(randColor);
            // необходимо установить пределы в рамках которого будут генерироваться точки. в нашем случае это будет размер окна
            int x = (int) Math.ceil(Math.random()* getSize().width);
            int y = (int) Math.ceil(Math.random()* getSize().height - 50) + 50;
            // учитывая размер заголовка окна изменяем координаты генерации точек
            g2.fillOval(x, y, 5, 5);


        }

    }
}

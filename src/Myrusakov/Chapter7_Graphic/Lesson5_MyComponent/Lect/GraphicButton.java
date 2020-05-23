package Myrusakov.Chapter7_Graphic.Lesson5_MyComponent.Lect;

import javax.swing.*;
import java.awt.*;

public class GraphicButton extends JComponent { // в этом классе необходимо создать свою собственную кнопку
    private String title;
    private Color color = Color.BLACK;

    public  GraphicButton(String title) {
        this.title = title;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        Font font = new Font("Arial", Font.BOLD,20);
        g2.setFont(font);
        // в качестве размеров кнопки получаем переданные размеры компоненты - 1 пиксель
        g2.drawRect(0, 0, getWidth()-1, getHeight() -1);
        // при размещении текста на кнопке необходимо выравнивать текст исходя из размеров кнопки, размера шрифта, размера наименования
        FontMetrics metrics = g.getFontMetrics(font);
        g2.setColor(color);
        g2.drawString(title, 50, 55);

    }
}

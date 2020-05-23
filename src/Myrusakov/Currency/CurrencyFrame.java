package Myrusakov.Currency;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.awt.*;

public class CurrencyFrame extends JFrame {
    private JPanel main;

    public CurrencyFrame() {
        super("Курс валюты");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setBounds(300,300,640,480);

        String[] columnNames = {"№","Код Валюты", "Наименование валюты","Цена Валюты"};
        JTable table = new JTable(mainCurrency.getValute(), columnNames); // сначала передаем таблицу, затем наименования колонок
        JScrollPane pane = new JScrollPane(table);

        JTableHeader header = table.getTableHeader(); // управляет заголовком таблицы
        header.setFont(new Font("Arial", Font.BOLD, 18));

        setColumnsWidth(table, header);

        table.setFont(new Font("Helvetica", Font.PLAIN, 14));
        table.setRowHeight(table.getRowHeight() + 10); // изменяем высоту строк в таблице


        // необходимо установить текст в таблице по центру
        DefaultTableCellRenderer centerRendered = new DefaultTableCellRenderer();
        centerRendered.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(centerRendered);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRendered);

        add(pane);

        pack(); // делает размер frame таким, чтобы в нем разместились все компоненты
        setLocationRelativeTo(null); // позволяет разместить окно относительно какого либо компонента.
        // если null размещение окна происходит по центру. важно соблюдать порядок. сначала pack, затем
        // setLocationRelativeTo, затем setVisible. размещение всех элементов происходит перед pack

        setVisible(true);
    }
    // https://javatalks.ru/topics/23746
    public static void setColumnsWidth(JTable table, JTableHeader header) {
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            TableColumn column = table.getColumnModel().getColumn(i);
            int prefWidth = Math.round(
                    (float) header.getFontMetrics(
                            header.getFont()).getStringBounds(header.getTable().getColumnName(i),
                                    header.getGraphics()).getWidth());
            column.setPreferredWidth(prefWidth + 10);
        }


    }
}

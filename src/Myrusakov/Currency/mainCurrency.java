package Myrusakov.Currency;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.swing.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class mainCurrency {
    static String valute[][];
    static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // добавить вывод на определенную дату, добавить доп колонку с указание валюты
    public static void main(String[] args) {

        // необходимо получить курс валют с помощью xml http://www.cbr.ru/scripts/XML_daily.asp/ (текущий день)
        // получение курса валют на определенную дату http://www.cbr.ru/scripts/XML_daily.asp?date_req=02/03/2002
        Date datePane = getDate();
        valute = getRates(datePane);
        for (int i = 0; i < valute.length; i++) {
            System.out.println(valute[i][0] + " " + valute[i][1] + " " + valute[i][2] + " " + valute[i][3]);
        }




        new CurrencyFrame();
    }
    static public Date getDate() { // http://proglang.su/java/date-and-time
        String date = JOptionPane.showInputDialog(null, "Введите дату, для определения курса валют");
        Date parsingDate = null;
        try {
            parsingDate = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parsingDate;
    }


    private static String[][] getRates(Date date) {
        HashMap<String, NodeList> result = new HashMap<>();
        String[][] rates = null; // двумерный массив будет хранить в себе курс валюты.


        // Указываем формат даты которую будем передавать для получения курса
        String url = "http://www.cbr.ru/scripts/XML_daily.asp?date_req=" + dateFormat.format(date);
        Document xml = loadDocument(url);// в результате выполнения скачается xml файл
        // System.out.println(xml.getXmlVersion());

        // <Valute ID="R01010">
        // <NumCode>036</NumCode>
        // <CharCode>AUD</CharCode>
        // <Nominal>1</Nominal>
        // <Name>Австралийский доллар</Name>
        // <Value>16,0102</Value>
        // </Valute>
        NodeList nl = xml.getElementsByTagName("Valute"); // получаем теги по их наименованию

        for (int i = 0; i < nl.getLength(); i++) {
            Node node = nl.item(i);
            NodeList nlChilds = node.getChildNodes(); // получаем дочерние теги (NumCode, CharCode, Nominal, Name, Value)

            for (int j = 0; j < nlChilds.getLength(); j++) { // Перебор дочерних тегов
                if (nlChilds.item(j).getNodeName().equals("CharCode")) {
                    result.put(nlChilds.item(j).getTextContent(), nlChilds); // получение текстового значения тега "CharCode"
                    // для примера выше это будет значение AUD. это значение будет использоваться в кчестве ключа.
                    // nlChilds, передаваемое в качестве значения хранит в себе информацию остальных дочерних тегов
                }

            }
        }
        int k = 0; // переменная отвечает за индекс
        rates = new String[result.size()][4]; // в массиве будет хранится код валюты и стоимость этой валюты в рублях
        // Необходимо вытащить информацию из HashMap result и положить в двумерный массив rates (String[][])

        for (Map.Entry<String, NodeList> entry : result.entrySet()) {
            NodeList temp = entry.getValue();
            double value = 0;
            int nominal = 0;
            String nameCurrency = "";
            for (int z = 0; z < temp.getLength(); z++) {
                if (temp.item(z).getNodeName().equals("Name")) {
                    nameCurrency = temp.item(z).getTextContent();
                }
                else if (temp.item(z).getNodeName().equals("Value")) {
                    value = Double.parseDouble(temp.item(z).getTextContent().replace(",", "."));
                    // получаем значение валюты из тега Value и приводим к типу Double. Так как значение Value
                    // указано с запятой необходиио запятую заменить на точку с помощью метода replace
                } else if (temp.item(z).getNodeName().equals("Nominal")) {
                    nominal = Integer.parseInt(temp.item(z).getTextContent());
                }

            }
            double amount = value / nominal;
            rates[k][0] = String.valueOf(k + 1);
            rates[k][1] = entry.getKey();
            rates[k][2] = nameCurrency;
            rates[k][3] = (((double) Math.round(amount * 100)) / 100) + " рублей";
            k++;
        }


        return rates;

    }

    private static Document loadDocument(String url) { // метод по получению XML файла
        Document doc = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            doc = factory.newDocumentBuilder().parse(new URL(url).openStream());
        } catch (SAXException | IOException | ParserConfigurationException e) {
            e.printStackTrace();
        }
        return doc;
    }
    static public String[][] getValute() {
        return valute;
    }
}

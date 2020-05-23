/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myrusakov.Currency;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Admin
 */
public class Currency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        /* http://www.cbr.ru/scripts/XML_daily.asp?date_req=dd/MM/yyyy */
        String[][] rates = getRates();
        for (int i = 0; i < rates.length; i++) {
            System.out.println(rates[i][0] + " " + rates[i][1]);
        }
        
    }
    
    private static String[][] getRates() throws Exception {
        HashMap<String, NodeList> result = new HashMap();
        String[][] rates = null;
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String url = "http://www.cbr.ru/scripts/XML_daily.asp?date_req=" + dateFormat.format(date);
        Document doc = loadDocument(url);
        
        NodeList nl = doc.getElementsByTagName("Valute");
        
        for (int i = 0; i < nl.getLength(); i++) {
            Node c = nl.item(i);
            NodeList nlChilds = c.getChildNodes();
            for (int j = 0; j < nlChilds.getLength(); j++) {
                if (nlChilds.item(j).getNodeName().equals("CharCode")) {
                    result.put(nlChilds.item(j).getTextContent(), nlChilds);
                }
            }
        }
        
        System.out.println(doc.getXmlVersion());
        int k = 0;
        rates = new String[result.size()][2];
        
        for (Map.Entry<String, NodeList> entry : result.entrySet()) {
            NodeList temp = entry.getValue();
            double value = 0;
            int nominal = 0;
            for (int i = 0; i < temp.getLength(); i++) {
                if (temp.item(i).getNodeName().equals("Value")) {
                    value = Double.parseDouble(temp.item(i).getTextContent().replace(',', '.'));
                }
                else if (temp.item(i).getNodeName().equals("Nominal")) {
                    nominal = Integer.parseInt(temp.item(i).getTextContent());
                }
            }
            double amount = value / nominal;
            rates[k][0] = entry.getKey();
            rates[k][1] = (((double) Math.round(amount * 10000)) / 10000) + " рублей";
            k++;
        }
        
        return rates;
    }
    
    private static Document loadDocument(String url) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        return factory.newDocumentBuilder().parse(new URL(url).openStream());
    }
    
}

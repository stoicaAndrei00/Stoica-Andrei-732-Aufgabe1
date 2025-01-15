import org.w3c.dom.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.*;
import java.io.File;

public class XMLReader {
    public static void main(String[] args) {
        try {
            File file = new File("spielorte.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("student");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("ID: " + element.getElementsByTagName("Id").item(0).getTextContent());
                    System.out.println("Datum: " + element.getElementsByTagName("Datum").item(0).getTextContent());
                    System.out.println("Kapazitat: " + element.getElementsByTagName("Kapazität").item(0).getTextContent());
                    System.out.println("Kapazität: " + element.getElementsByTagName("Kapazität").item(0).getTextContent());
                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

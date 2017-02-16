/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Astrid Hernandez
 */
public class Practica1_EDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SAXException {
        // TODO code application logic here
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {
              
                boolean casilla = false;
                boolean palabra = false;
                
                public void startElement(String uri, String localName,String qName,
                Attributes attributes) throws SAXException {

		System.out.println("Start Element :" + qName);

		if (qName.equalsIgnoreCase("casilla")) {
			casilla = true;
		}

		if (qName.equalsIgnoreCase("palabra")) {
			palabra = true;
		}

		
	}
          public void endElement(String uri, String localName,String qName)throws SAXException{
              ListaSimple listasimple = new ListaSimple();
              listasimple.agregar(qName);
              
          }  
                
            };
            
            
            
        
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Practica1_EDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
}



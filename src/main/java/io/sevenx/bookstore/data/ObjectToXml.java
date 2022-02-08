package io.sevenx.bookstore.data;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class ObjectToXml {
    public static File convert(Book book){
        File file = new File("src\\main\\resources\\bookDb.xml");
       try {
           
           JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
           
           Marshaller marshaller = jaxbContext.createMarshaller();
           
           
           marshaller.marshal(book, file);
           
        } catch (Exception e) {
            //TODO: handle exception
        }
        return file;
    }
}

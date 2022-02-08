package io.sevenx.bookstore.data;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

public class XmlToObject {
    public static Book convert(File file){
        Book book =new Book();
        try {
                
            // File file = new File("src\\main\\resources\\student.xml");
            
            JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
            
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            
            book = (Book)unmarshaller.unmarshal(file);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }
}

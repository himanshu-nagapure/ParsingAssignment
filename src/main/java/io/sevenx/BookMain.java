package io.sevenx;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import io.sevenx.bookstore.data.Book;
import io.sevenx.bookstore.data.ObjectToXml;
import io.sevenx.bookstore.data.XmlToObject;
import io.sevenx.bookstore.ui.BookDisplay;

public class BookMain {
    public static void main(String[] args) {
			
        List<Book> books = new ArrayList<>();
			Book book1 = new Book();
			book1.setIsbn("198-0961754038").setName("Rich Dad Poor Dad")
                .setAuthor("Robert Kiyosaki").setPublisher("Warner Books");
            
            
            File file = ObjectToXml.convert(book1);
            
            Book book = XmlToObject.convert(file);
            books.add(book);

            BookDisplay.display(books);

        // Write to File
        // m.marshal(bookstore, new File(BOOKSTORE_XML));

        // // get variables from our xml file, created before
        // System.out.println();
        // Unmarshaller um = context.createUnmarshaller();
        // Bookstore bookstore2 = (Bookstore) um.unmarshal(new FileReader(
        //         BOOKSTORE_XML));
        // for (Book book : list) {
        //     System.out.println("Book: " + book.getName() + " from "
        //             + book.getAuthor());
        // }

        
    }
}

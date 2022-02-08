package io.sevenx.bookstore.data;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {

    private String name;
    private String author;
    private String publisher;
    private String isbn;

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;

    }

    public String getPublisher() {
        return publisher;
    }

    public Book setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public String getIsbn() {
        return isbn;
    }

    public Book setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public void getInfo() {
        System.out.println("\tBook Details");
        System.out.println("Name :"+name+
        "\nISBN: " + isbn + 
        "\nPublisher: "+publisher+
        "\nAuthor :"+author);

        // System.out.printf("Name : %20s \nISBN : %20s \nPublisher : %20s \nAuthor :%20s",name,isbn,publisher,author);
    }
}
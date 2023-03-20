package org.example;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("","","");
        Book book = new Book("","",null);
        author.setAuthoremail("aboba228@gmail.com");
        author.setAuthorname("Goshkina");
        author.setAuthorsex("Женщина");
        book.setBookauthor(author);
        book.setBookyear("1992");
        book.setBooktitle("Радость от горя");
        System.out.println(book.toString());
    }
}
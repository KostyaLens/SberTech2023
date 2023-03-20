package org.example;

public class Book {
    private Author author;
    private String year, title;

    public Book(String year, String title, Author author){
        this.year = year;
        this.title = title;
        this.author = author;
    }
    public String getBookyear(){
        return this.year;
    }
    public String getBooktitle(){
        return this.title;
    }
    public Author getBookauthor(){
        return this.author;
    }

    public void setBookyear(String year){
        this.year = year;
    }
    public void setBooktitle(String title){
        this.title = title;
    }
    public void setBookauthor(Author author){
        this.author = author;
    }
    public String toString(){
        String S = this.year + " " + this.title + " " + this.author.sex + " " + this.author.name + " " + this.author.email;
        return S;
    }


}

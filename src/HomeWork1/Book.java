package HomeWork1;

import java.util.ArrayList;

public class Book {
    // title
    // pages
    // [String] Authors  "John Doe"
    // genre
    private String title;
    private int pages;
    private ArrayList<String> Authors = new ArrayList<>();
    private String genre;

    // Getters and Setters
    //title
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //pages
    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // Authors
    public ArrayList<String> getAuthors() {
        return this.Authors;
    }

    public void addAuthor(String author) {
        this.Authors.add(author);
    }

    public void setAuthors(ArrayList<String> authors) {
        this.Authors.addAll(authors);
    }

    //Genre
    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //Constructors
    //NoArg
    public Book() {
    }

    ;

    //allArg authors as Arraylist
    public Book(String title, int pages, ArrayList<String> authors, String genre) {
        this.title = title;
        this.pages = pages;
        this.Authors = authors;
        this.genre = genre;
    }

    //allArg add 1 author to Array
    public Book(String title, int pages, String author, String genre) {
        this.title = title;
        this.pages = pages;
        this.Authors.add(author);
        this.genre = genre;
    }

    //toString
    public String toString() {
        return "\nTitle = " + this.title + "\nPages = " + this.pages + "\nAuthors = " + this.Authors + "\nGenre = " + this.genre + "\n";
    }
}

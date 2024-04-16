package Lesson1;

import java.util.ArrayList;

public class Book {

    private String title;
    private int pages;
    private ArrayList<String> authors = new ArrayList<String>();
    private String genre;


    public Book() {
    }

    public Book(String genre, int pages, String title) {
        this.genre = genre;
        this.pages = pages;
        this.title = title;
    }

    public Book(String title, int pages, ArrayList<String> authors, String genre) {
        this.title = title;
        this.pages = pages;
        this.authors = authors;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthor(String author) {
        authors.add(author);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Lesson1.Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", Authors=" + authors +
                ", genre='" + genre + '\'' +
                '}';
    }
}
package HomeWork2.Task3;

public class Book extends Papirus {
    private String title;
    private int pages;

    //Constructor
    //AllArg
    public Book(String title, int pages, String size) {
        super(size);
        this.title = title;
        this.pages = pages;
    }

    //NoArg
    public Book() {
        super();
    }

    //Getters & Setters
    //title
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Pages
    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", pages=" + pages + "]";
    }
}